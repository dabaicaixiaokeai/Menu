package util;

public class StringUtil {
	public static String valeof(Object object) {
		if(object!=null) {
			return object.toString();
		}
		return null;
	}
}
