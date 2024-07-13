package String;

public class ex_2 {

	public int countUppercaseLetters(String str) {
		int count = 0;

		if (str == null) {
			return -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
			}
		}

		return count;
	}

	public boolean hasConsecutiveDuplicate(String str) {
		if (str == null) {
			return false;
		}
		for (int i = 0; i < str.length() - 1; i++) {
			char currentChar = str.charAt(i);
			char NextChar = str.charAt(i + 1);

			if (currentChar == NextChar) {
				return true;
			}
		}
		return false;
	}

	public int getRightmostDigit(String str) {
		if (str == null || str.equals("")) {
			return -1;
		}

		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				return Character.getNumericValue(ch);
			}
		}

		return -1;
	}

}
