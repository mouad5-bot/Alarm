public class Program {
    public static void main(String[] args) {
        Alarm alarm = new HighVisibilityAlarm("Your hair is on faire.");
        alarm.turnOn();
        System.out.println(alarm);
    }
}
