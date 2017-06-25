package conference.entity.event;

/**
 * Entity Event Lunch
 * 
 * @author fblesa
 *
 */
public class LunchEvent extends Event {

	private final static Integer ZERO = 0;
	private final static String LUNCH = "Lunch";
	private final static String AM = "AM";
	private final static String TWELVEPM = "12:00PM";
	
	
	public LunchEvent() {
		this.setDuration(ZERO);
		this.setName(LUNCH);
		this.setHourOfEvent(TWELVEPM);
	}
	
	//In this method set the hour of event, because lunch is at 12
	@Override
	public void setHourOfEvent(String hourOfEvent) {
		if(!hourOfEvent.equals(TWELVEPM)){
			String[] stractHour = hourOfEvent.split(AM);
			stractHour = stractHour[ZERO].split(":");
			if(Integer.parseInt(stractHour[ZERO])<12)
				hourOfEvent = TWELVEPM;
		}
		super.setHourOfEvent(hourOfEvent);
	}
}
