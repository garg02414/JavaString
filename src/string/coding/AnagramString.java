package string.coding;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str = "silent";
		String str2 = "listen";
		
		if (str.length()!= str2.length()) {
			
			 System.out.println("not anagram: ");
			 return;
			
		}
		char[] one = str.toCharArray();
		char[] two = str2.toCharArray();
		
		Arrays.sort(one);
		Arrays.sort(two);
		if(one.equals(two)) {
			System.out.println("Both ara anagram String ");
			
		}
		else {
			System.out.println("Both ara anagram String ");
			
		}
		
	}
}
