package string;

public class StringBuiler {

	public static void main(String[] args) {
		String str= "umang";
		StringBuilder sb = new StringBuilder();
		sb.append('u');
		System.out.println(sb);
		sb.append('m');
		sb.insert(0, "abcd");
		System.out.println(sb);
		
		sb.replace(0, 4, "uamng");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		System.out.println(sb.charAt(4));
		
		System.out.println("adding a comment ");
		
	}
}
