import java.util.Arrays;

public class AnagramString {

	public static class StringNotEqual extends Exception {
		public String toString() {
			return "Strings not equal";

		}

	}

	public static void matchString(String s1, String s2) throws StringNotEqual {
		if (s1.length()!=s2.length()) {
			throw new StringNotEqual();
			
		}
		else {
			char[] a1 = s1.toCharArray();
			char a2[] = s2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			if (Arrays.equals(a1, a2)) {
				System.out.println("Anagram");
			}

		}

	}

	public static void main(String[] args) {

		String s1 = "Angl";
		String s2 = "Angel";
		try {
			matchString(s1, s2);
		} catch (StringNotEqual e) {
			System.out.println(e);

		}

	}
}
