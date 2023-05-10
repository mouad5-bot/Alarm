public class Program {
    public static void main(String[] args) {
        HighVisibilityAlarm alarm = new HighVisibilityAlarm("Pressure low");
        alarm.turnOn();
        String report = alarm.getReport();
        System.out.println(report);
    }
}
