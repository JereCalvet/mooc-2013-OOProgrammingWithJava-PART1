
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public MyDate clone() {
        MyDate clone = new MyDate(this.day, this.month, this.year);
        return clone;
    }
        
    public int CuentaAños(MyDate fechaMin, MyDate fechaMax) { //desde hasta
        int contadorAños = 0;
        while (fechaMin.earlier(fechaMax)) { 
            fechaMin.year++;
            contadorAños++;
        }
        if (fechaMin.year == fechaMax.year && fechaMin.month == fechaMax.month && fechaMin.day == fechaMax.day) {
            return contadorAños;
        } else {
            return contadorAños - 1;
        }
    }

    public int differenceInYears(MyDate date) { 
        MyDate fechaInicial = this.clone();
        MyDate fechaComparacion = date.clone();

        if (this.earlier(date)) {
            return CuentaAños(fechaInicial, fechaComparacion); //min/max
        } else {
            return CuentaAños(fechaComparacion, fechaInicial); //max/min
        }
    }
}

