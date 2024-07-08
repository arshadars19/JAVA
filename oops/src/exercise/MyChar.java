package exercise;

public class MyChar {

	public boolean isVowel(char ch) {
		switch (ch) {
		case 'A', 'E', 'I', 'O', 'U':
		case 'a', 'e', 'i', 'o', 'u':
			return true;
		}
		return false;
	}

}
