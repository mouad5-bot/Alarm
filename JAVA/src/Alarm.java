import java.time.LocalDateTime;
import java.util.Locale;

public  class Alarm{
    protected boolean active;
    private final String message;
    private LocalDateTime snoozeUntil;

    Alarm(){
        this.message = "this is a default messaage !!!";
    }
    Alarm(String message){
        this.message = message;
        stopeSnoozing();
    }

    public String getMessage() {
        return message;
    }

    void snooze(){
        if(active)
            snoozeUntil = LocalDateTime.now().plusSeconds(5);
    }

    boolean isSnoozing(){
        return snoozeUntil.isAfter(LocalDateTime.now());
    }
    void stopeSnoozing(){
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }

    void turnOn(){
        active = true;
        stopeSnoozing();
    }
    void turnOff(){
        active = false;
        stopeSnoozing();
    }
    String getReport(){
        return getReport(false);
    }
    String getReport(boolean uppercase){
        if (active && !isSnoozing()) {
            if(uppercase){
                return message.toUpperCase();
            }else{
                return message;
            }
        }else{
            return "";
        }
    }
    void sendReport(){
        System.out.println(getReport(true));
    }

    @Override
    public String toString(){
        return getReport();
    }

    public static void main (String[] args) throws InterruptedException {
        Alarm alarm = new Alarm("this is alarm in main inside class");
        alarm.turnOn();
        alarm.snooze();
        Thread.sleep(6000 * 2);
        alarm.sendReport();
    }

    //============> accessor methods <================//
    //public LocalDateTime getSnoozeUntil(){
       // return snoozeUntil;
    //}
    //public void setSnoozeUntil(LocalDateTime snoozeUntil){
      //  this.snoozeUntil = snoozeUntil;
    //}
}
