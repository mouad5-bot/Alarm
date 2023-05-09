public final class HighVisibilityAlarm extends Alarm {
    public HighVisibilityAlarm(String message) {
        super(message);
    }

    @Override
    public String getReport(boolean uppercase){
        String report = super.getReport(uppercase);
        if (report.isEmpty()){
            return  report;
        }else{
            return report + "!!$!!";
        }
    }

    public static void main(String[] args) {
        HighVisibilityAlarm alarm = new HighVisibilityAlarm("temperator is so high");

        System.out.println(alarm.toString());
    }
}
