import java.util.*;

public class HowMany {


    public static int howMany(String s, char c){
        
        //Count the character
        int count = 0; //initialize count
        for (int i = 0; i < s.length();i ++){ //for each character
            if (s.charAt(i)==c) //count it if its same as our searchChar
                count ++;
        }

        return count;


    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Get the string
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Write a short story about how your program works");
		
		System.out.println("Enter a string: ");
		String userString = keyboard.nextLine();

    int vowelCount = 0;
    vowelCount += howMany(userString,'a');
    vowelCount += howMany(userString,'e');
    vowelCount += howMany(userString,'i');
    vowelCount += howMany(userString,'o');
    vowelCount += howMany(userString,'u');

    vowelCount += howMany(userString,'A');
    vowelCount += howMany(userString,'E');
    vowelCount += howMany(userString,'I');
    vowelCount += howMany(userString,'O');
    vowelCount += howMany(userString,'U');


		System.out.println("Your sentence contains " + vowelCount + " vowels");
	}

}
