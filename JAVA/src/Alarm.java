import java.time.LocalDateTime;
import java.util.Locale;

public class Alarm {
    boolean active;
    final String message;
    LocalDateTime snoozeUntil;

    Alarm(){
        this.message = "this is a default messaage !!!";
    }
    Alarm(String message){
        this.message = message;
        stopeSnoozing();
    }

    void snooze(){
        snoozeUntil = LocalDateTime.now().plusMinutes(5);
    }

    boolean isSnoozing(){
        return snoozeUntil.isAfter(LocalDateTime.now());
    }
    void stopeSnoozing(){
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }

    void turnOn(){
        active = true;
    }
    void turnOff(){
        active = false;
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

    public static void main (String[] args) throws InterruptedException {
        Alarm alarm = new Alarm("this is alarm in main inside class");
        alarm.turnOn();
        alarm.snooze();
        Thread.sleep(6000 * 2);
        alarm.sendReport();
    }
}
