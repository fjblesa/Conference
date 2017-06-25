package conference.entity.event;

/**
 * Entity Event Networking
 * 
 * @author fblesa
 *
 */
public class NetworkingEvent extends Event {

	private final static Integer ZERO = 0;
	private final static String NETWORKINGEVENT = "Networking Event";
	private final static String PM = "PM";
	
	public NetworkingEvent(String hourOfEvent) {
		this.setHourOfEvent(hourOfEvent);
		this.setDuration(ZERO);
		this.setName(NETWORKINGEVENT);
	}
	//In this method set the hour of event, because networking it is between 4 and 5 PM
	@Override
	public void setHourOfEvent(String hourOfEvent) {
		String[] stractHour = hourOfEvent.split(PM);
		stractHour = stractHour[ZERO].split(":");
		if(Integer.parseInt(stractHour[ZERO])<4)
			hourOfEvent = "04:00PM";
		super.setHourOfEvent(hourOfEvent);
	}
}
