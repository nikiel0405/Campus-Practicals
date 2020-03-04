import java.util.Scanner;

public class RemovePunctuation {

   
    


    public static void main (String[] args){

        String punctuationString = ";:.,?!";

        Scanner in = new Scanner(System.in);
        System.out.println("enter a line of text:");
        String s = in.nextLine();

        String newString = "";
        for(int i = 0; i < s.length(); ++i){
            if (!(punctuationString.indexOf (s.charAt(i)) >= 0) ) 
                newString += s.charAt(i);
        }
        System.out.println(newString);
    }

}
