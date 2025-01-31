package string;

public class StringBasic {

	public static void main(String[] args) {

		String str = "Umang garg";
		System.out.println(str.charAt(2)); 					//a
		
		System.out.println(str.length()); 					//10
		
		System.out.println(str.substring(3, 9)); 			//ng gar
		
		System.out.println(str.equals("umang"));  			//false
		
		System.out.println(str.equals("Umang garg"));       // true
		
		
		
		System.out.println(str.equalsIgnoreCase("UMANG Garg"));  //true
		
		System.out.println(str.toLowerCase());					//umang garg
		
		System.out.println(str.toUpperCase());					//UMANG GARG
		
		
		String str2 = "Umang garg  ";
		System.out.println(str2.trim());   						//Umang garg /REMOVES WHITE SPACE FROM LAST
		
	}
}
