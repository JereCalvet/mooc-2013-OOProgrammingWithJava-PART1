public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
    private static final int HOURS_LIMIT = 23;
    private static final int MINUTES_LIMIT = 59;
    private static final int SECONDS_LIMIT = 59;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(HOURS_LIMIT);
        this.minutes = new BoundedCounter(MINUTES_LIMIT);
        this.seconds = new BoundedCounter(SECONDS_LIMIT);
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        /*
        respuesta propuesta: el codigo esta igual, lo ideal seria descomentar el sleep para que avance cada 1 sec
        (hay que agregarle throws exception al metodo y al main.
        el problema es que el test no lo reconoce y falla la compilacion.
        el servidor del micro servicio tmb)
        */
        //Thread.sleep(1000);                              
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();
            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }

    @Override
    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
