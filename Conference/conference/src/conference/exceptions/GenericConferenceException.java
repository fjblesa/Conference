package conference.exceptions;

public class GenericConferenceException extends Exception {
	/**
	 * When you can not find the type introduced the Session
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenericConferenceException(Exception e){
		super(e);
	}

}
