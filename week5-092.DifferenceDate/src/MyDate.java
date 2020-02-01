
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public int auxRestaFechas(MyDate fechaMin, MyDate fechaMax) {
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
            return auxRestaFechas(fechaInicial, fechaComparacion); //min/max
        } else {
            return auxRestaFechas(fechaComparacion, fechaInicial); //max/min
        }
        
        /* respuesta propuesta: la solucion propuso un algoritmo al cual llego comparando meses y dias.
                                
                                yo lo solucione y fui corrigiendo errores (cuando se ponian 2 fechas iguales)
                                conforme se corrian los test.
                                
                                En mi algoritmo yo comparaba las fechas y le sumaba años a la menor hasta
                                que siga siendo menor (suma hasta pasarse. Ahi sale 
                                del while y resto). Con eso obtengo la cantidad de años. 
                                fechas iguales = 3.2.2013 - 3.2.2010 = 3
                                fecha menor -ej de funcinoamiento entre 8.1.2013 y 4.8.2019
                                                diferencia de 2 años, 4 meses y 2x dias (casi 5 meses)
                                             
                                                                                    contador=0
                                             while (fecha menor < fecha mayor) que calcula:       
                                             8.1.2013 - 4.8.2010 = contador-1 = 0  contador=1
                                             8.1.2013 - 4.8.2011 = contador-1 = 1   contador=2
                                             8.1.2013 - 4.8.2012 = contador-1 = 2   contador=3
                    aca no entra xq se pasa||8.1.2013 - 4.8.2013 = ya salio
                                             
            public int differenceInYears(MyDate compared) {
        if (this.earlier(compared)) {
            return differenceWhenThisEarlier(compared);
        }
        
        int minusOneYear = 0;
        if (this.month < compared.month) {
            minusOneYear = 1; 
        } else if (this.month == compared.month && this.day < compared.day) {
            minusOneYear = 1; 
        }
 
        return this.year - compared.year - minusOneYear;
    }
 
    private int differenceWhenThisEarlier(MyDate compared) {
        int minusOneYear = 0;
        
        if (compared.month < this.month) {
            minusOneYear = 1;
        } else if (compared.month == this.month && compared.day < this.day) {
            minusOneYear = 1;
        }
 
        return compared.year - this.year - minusOneYear;
    }           
        */
        
        
    }
}
