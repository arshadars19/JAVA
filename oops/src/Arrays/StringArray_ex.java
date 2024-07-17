package Arrays;

public class StringArray_ex {

	public static void main(String[] args) {
		String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

		// for printing
//		for (String day : days) {
//			System.out.println(day);
//		}
//
//		for (int i = 0; i <= days.length - 1; i++) {
//			System.out.println(days[i]);
//		}

		// Day with most number of characters
		String daywithmostcharcters = " ";
		for (String day : days) {
			if (day.length() > daywithmostcharcters.length()) {
				daywithmostcharcters = day;
			}
		}
		System.out.println("Most characters :- " + daywithmostcharcters);

		// reverse printing of days
		for (int i = days.length - 1; i >= 0; i--) {
			System.out.println("Reverse days:- " + days[i]);
		}
	}

}
