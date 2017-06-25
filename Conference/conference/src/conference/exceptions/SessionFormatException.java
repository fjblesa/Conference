package conference.exceptions;

public class SessionFormatException extends RuntimeException{
	
	/**
	 * When you can not find the type introduced the Session
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SessionFormatException(){
		super("The format of type session is not supported");
	}

}
