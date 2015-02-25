import java.util.Calendar;
import java.lang.Thread;

public class ClockThread extends Thread {

	private ClockInterface clockInterface;
	
	public ClockThread (ClockInterface clockInterface) {
		this.clockInterface = clockInterface;
	}	
	public void run() {
        while (true) {
       	
        	Calendar now = Calendar.getInstance();
        	int hours = now.get(Calendar.HOUR_OF_DAY);
            int minute = now.get(Calendar.MINUTE);
            int second = now.get(Calendar.SECOND);
            clockInterface.update(hours, minute, second);
            
            try {	
            	Thread.sleep(900);
            } catch(Exception e){}
 

        }
         
}
}