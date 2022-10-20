package exemple;

public class StringUtils {
	public static String build(String separateur, Object...objects) {
		StringBuilder builder = new StringBuilder();
		for(Object obj : objects) {
			builder.append(obj).append(separateur);
			
		}
		return builder.toString();
	}
}
