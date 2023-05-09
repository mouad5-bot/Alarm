import java.awt.print.PrinterIOException;

public final class PrioritizedAlarm extends Alarm {
    private final int priority;
    public PrioritizedAlarm(String message, int priority){
        super(message);
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }

    public static void main (String [] args){
        PrioritizedAlarm alarm = new PrioritizedAlarm("temperatore is high" ,22);
        alarm.getPriority();
    }

}
