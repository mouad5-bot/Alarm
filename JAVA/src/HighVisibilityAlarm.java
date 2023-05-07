public class HighVisibilityAlarm extends Alarm {
    public HighVisibilityAlarm(String message) {
        super(message);
    }

    public String getReport(boolean uppercase){
        if (active && !isSnoozing()) {
            if(uppercase){
                return getMessage().toUpperCase() + "!!!!!";
            }else{
                return getMessage() + "!!!!!!";
            }
        }else{
            return "";
        }
    }

    public static void main(String[] args) {
        HighVisibilityAlarm alarm = new HighVisibilityAlarm("temperator is so high");
        alarm.turnOn();
        System.out.println(alarm.getReport(true));
    }
}
