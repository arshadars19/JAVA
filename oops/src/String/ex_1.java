package String;

public class ex_1 {

	public static void main(String[] args) {
		String s1 = "This is a lot of text again";
		System.out.println(s1.length());

//		for (int i = 0; i <= s1.length() - 1; i++) {
//			System.out.println(s1.charAt(i));// for printing character one by one
//		}

		System.out.println(s1.charAt(0));
		System.out.println(s1.startsWith("T"));
		System.out.println(s1.startsWith("A"));
		System.out.println(s1.endsWith("n"));
		System.out.println(s1.contains("Lot"));
		System.out.println(s1.contains("lot"));
		System.out.println(" ");
		String s2 = "value";
		String s3 = "Value";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.indexOf("l"));
		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s2.concat("hi"));
	}

}
