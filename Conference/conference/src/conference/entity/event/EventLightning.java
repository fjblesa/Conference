package conference.entity.event;

/**
 * Entity Event Lightning
 * 
 * @author fblesa
 *
 */
public class EventLightning extends Event {

	private final static Integer FIVE = 5;
	
	public EventLightning() {
		this.setDuration(FIVE);
	}
}
