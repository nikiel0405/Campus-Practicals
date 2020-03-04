import java.util.Scanner;

class WordGarbler {

	public static String removeChar (String s, int i){
		String newString = s.substring(0,i);
		newString += s.substring(i+1);
		return newString;

		//or all of the above can be done in one line
		//return s.substring(0,i) + s.substring(i + 1);	
	}

	public static void main (String [] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String s = key.nextLine();
		String garble = new String ();
		int ran = 0;

		while (s.length() > 0){
			ran = (int) (Math.random()* s.length()); 
			garble += s.substring(ran,ran+1); //add a random character from the string to garble
			s = removeChar(s, ran); //remove that character from the string
		}

		System.out.println(garble);
		
	}

}