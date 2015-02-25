
public class ClockLogic implements ClockInterface {

	private int alarmHour;
	private int alarmMinute;
	private int hours;
	private int minute;
	private int second;
	private DigitalClockGUI clockGUI;
	
	//Start clockthread
	public ClockLogic(DigitalClockGUI clockGUI) {
		this.clockGUI = clockGUI;
		ClockThread clockthread = new ClockThread(this);
		clockthread.start();
	}
        //Set alarm and save them.
	    public void setAlarm(int alarmHour, int alarmMinute) {
	    	this.alarmHour = alarmHour;
	    	this.alarmMinute = alarmMinute;
	    	
	    }
        //Set alarmHour and alarmMinute to -1 so it never can be true.
    	public void clearAlarm() { 		
    		alarmHour = -1;
    	    alarmMinute = -1;
    		
    	}
        //Update clockGUI and alarm.
    	public void update (int hours, int minute, int second) {	
    		clockGUI.setTimeOnLabel(String.format("%02d:%02d:%02d",hours,minute,second));   		
    		clockGUI.alarm(alarmHour == hours && alarmMinute == minute);
    	}
    	
    	
    }
