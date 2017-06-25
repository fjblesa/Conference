package conference.entity.event;

/**
 * Entity Event
 * 
 * @author fblesa
 *
 */
public class Event {
	
	private String name;
	
	private String hourOfEvent;
	
	private Integer duration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHourOfEvent() {
		return hourOfEvent;
	}

	public void setHourOfEvent(String hourOfEvent) {
		this.hourOfEvent = hourOfEvent;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
}
