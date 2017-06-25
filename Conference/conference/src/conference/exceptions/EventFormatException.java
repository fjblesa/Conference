package conference.exceptions;

public class EventFormatException extends RuntimeException{
	
	/**
	 * When you can not find the type introduced the event
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EventFormatException(String name){
		super("The format to type event isn´t supported, name: " + name);
	}
}
