package conference.entity.session;

import java.util.ArrayList;
import java.util.List;

import conference.entity.event.Event;

/**
 * Entity session
 * 
 * @author fblesa
 *
 */
public class Session {

	public Session(){
		this.listEvents = new ArrayList<>();
	}
	
	private Integer totalDuration;
	
	private List<Event> listEvents;
	
	private Integer lastHouEvent;
	
	private String amOrPm;
	
	
	public List<Event> getListEvents() {
		return listEvents;
	}
	
	public Integer getTotalDuration() {
		return totalDuration;
	}
	
	protected void setTotalDuration(Integer totalDuration) {
		this.totalDuration = totalDuration;
	}

	public Integer getLastHouEvent() {
		return lastHouEvent;
	}

	public void setLastHouEvent(Integer lastHouEvent) {
		this.lastHouEvent = lastHouEvent;
	}

	public String getAmOrPm() {
		return amOrPm;
	}

	public void setAmOrPm(String amOrPm) {
		this.amOrPm = amOrPm;
	}
	
	public void setEvent(Event event){
		event.setHourOfEvent(calculateHourOfEvent());
		this.setLastHouEvent(lastHouEvent + event.getDuration());
		this.setTotalDuration(totalDuration - event.getDuration());
		this.listEvents.add(event);
	}

	/**
	 * 
	 *This method calculates the hour of the event
	 * 
	 * @return the hour of event
	 */
	private String calculateHourOfEvent() {
		 
	    Integer hours = lastHouEvent/60;
	   	Integer minutes = lastHouEvent%60;
	   	String hoursToString = hours.toString();
	   	String minutesToString = minutes.toString();
	   	
	   	if(hours<10)
	   		hoursToString = "0" + hoursToString;
	   	if(minutes<10)
	   		minutesToString = "0" + minutesToString;
	   	if(hours == 12)
	   		amOrPm = "PM";
		return hoursToString + ":" + minutesToString + amOrPm;
	}
}
