import java.util.Scanner;


public class Numerology {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    String indexString = new String("abcdefghijklmnopqrstuvwxyz");
	    
	    // Get the string
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("Write a short story about how your program works");
		
	    System.out.println("Enter a string: ");
	    String userString = keyboard.nextLine();

	    int sum = 0;
	    
	    for (int i = 0; i < userString.length();i ++){ //for each character
		//find its position it the indexString
		sum += indexString.indexOf(userString.substring(i,i+1).toLowerCase()) + 1;
		
                //you could also get the individual character and convert to a number
		//But first convert to lower case: userString = userString.toLowerCase();
	        //sum += (int) userString.charAt(i) - 96;   //a = 97
		
	    }

	    System.out.println(sum);
	}
}