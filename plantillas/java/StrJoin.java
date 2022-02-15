
public class StrJoin {
	private static String strJoin(String[] arr, String sep, String prefix) {
		String str = "";
		if (prefix == null)
			prefix = "";
		if (arr.length == 0) {
			return "";
		}
		
		str += String.format(prefix + arr[0], 1);
		for (int i = 1; i < arr.length; i++) {
			str += String.format(sep + prefix + arr[i], (i + 1));
		}
		return str;
	}
}
