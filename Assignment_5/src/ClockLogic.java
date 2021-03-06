import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockLogic {

	private DigitalClockGUI digitalClockGUI;
	private int alarmHour;
	private int alarmMinute;
//**	private DigitalClockGUI digClockGUI;**//
	
	public ClockLogic(DigitalClockGUI digitalClockGUI){
		this.digitalClockGUI = digitalClockGUI;
		ClockThread ca = new ClockThread();
		ca.start();
	}
	
	public void setAlarm(int hours, int minute){
		this.alarmHour = hours;
		this.alarmMinute = minute;
	}
	
	public void clearAlarm(){
		setAlarm(-1, -1);
		
		digitalClockGUI.activeAlarm(false);
		
	}
	
	private class ClockThread extends Thread{
		@Override
		public void run() {
			DecimalFormat df = new DecimalFormat("00");
			while(true){
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				}
			
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
				Calendar calendar = Calendar.getInstance();

				int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
				int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
				int minute     = calendar.get(Calendar.MINUTE);
				int second     = calendar.get(Calendar.SECOND);
				int millisecond= calendar.get(Calendar.MILLISECOND);
					
				System.out.println(sdf.format(calendar.getTime()));
					
				/**System.out.println("hour \t\t: " + hour);
				System.out.println("hourOfDay \t: " + hourOfDay);
				System.out.println("minute \t\t: " + minute);
				System.out.println("second \t\t: " + second);
				System.out.println("millisecond \t: " + millisecond);**/
				
				digitalClockGUI.setTimeOnLabel(df.format(hourOfDay) + ":" +df.format(minute) + ":" + df.format(second));
				
				if((hourOfDay == alarmHour && minute == alarmMinute)) {
					digitalClockGUI.activeAlarm(true);
					
				}else{
					
					digitalClockGUI.activeAlarm(false);
				}
			}
		}
	}
}
