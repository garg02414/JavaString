package string.coding;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "umangg garg";

		StringBuilder result = new StringBuilder();
		HashSet<Character> hash = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			if (!hash.contains(str.charAt(i))) {
				result.append(str.charAt(i));
				hash.add(str.charAt(i));

			}
		}
		System.out.println("result " + result.toString());

	}
}
