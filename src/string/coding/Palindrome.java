package string.coding;

public class Palindrome {

	public static void main(String[] args) {
		String st = "abcba";

		int left = 0;
		int right = st.length() - 1;
		boolean isPalindrome = true;
		while (left < right) {
			if (st.charAt(left) != st.charAt(right)) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;

		}
		
		System.out.println(isPalindrome);
	}
}
