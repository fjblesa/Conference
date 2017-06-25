package conference.utils;

/**
 * Utilities to parse string
 * 
 * @author fblesa
 *
 */
public class StringUtils {
	
	/**
	 * 
	 *Method to determine whether the contents of the string is numeric
	 * 
	 * @param cadena
	 * @return if is numeric true, but if is not numeric false
	 */
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
