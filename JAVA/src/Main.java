public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm("this is a text");
        alarm.turnOn();
        alarm.sendReport();
    }
}