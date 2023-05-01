import java.util.Locale;
public class Alarm {
    boolean active;
    String message="THE TEMPEARTOR IS TOO HIGH";

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
        if (active) {
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
}
