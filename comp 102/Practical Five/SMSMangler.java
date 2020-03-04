import java.util.Scanner;


public class SMSMangler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Get the string
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Write a short story about how your program works");
		
		System.out.println("Enter a string: ");
		String userString = keyboard.nextLine();
		
		String mangled = "";
		
		for (int i = 0; i < userString.length();i ++){ //for each character
			if (! isAVowel(userString.charAt(i))) //output it if its not a vowel
				mangled += (userString.charAt(i));
		}

		System.out.println(mangled);

	}
	
	public static boolean isAVowel(char c){
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'    )
			return true;
		else
			return false;
			
	}
	

}
