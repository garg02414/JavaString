package string.coding;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str  ="umanunm";
		char result = '\0';
		
		boolean isUnique = true;
		
		for(int i=0; i<str.length(); i++) {
			isUnique = true;
			
			for(int j=0; j<str.length(); j++) {
				if(i!=j && str.charAt(i) == str.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			
			if(isUnique) {
				result = str.charAt(i);
				break;
			}
			
			
		}
		if(result!='\0') {
			System.out.println("uniques number is " + result);
		}
		else {
			System.out.println("no unique character " + result);
		}
	}
}
