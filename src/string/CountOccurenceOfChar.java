package string;

public class CountOccurenceOfChar {

	public static void main(String[] args) {

		String srt = "Umanggarrggg";
		char charToCount = 'r';

		int count = 0;
		for (int i = 0; i <= srt.length() - 1; i++) {

			if (srt.charAt(i) == charToCount) {
				count++;
			}
		}
		System.out.println("total occurence of " + charToCount + "is " + count);
	}
}
