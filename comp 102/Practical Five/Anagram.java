import java.util.Scanner;

public class  Anagram {
    
    public static boolean isAnagram(String s1, String s2){
        StringBuffer sb = new StringBuffer(s2); //so we can delete chars

        if (s1.length() != s2.length()){
            return false;
        }
        else{ 
            for(int i = 0; i < s1.length(); i++){
                //for each character in s1	    
                //find it in the stringbuilder
                int index = sb.indexOf(s1.substring(i,i+1)); 
                if(index >= 0){                    //if found
                    sb = sb.deleteCharAt(index); //delete it from sb so its not checked again

                }	       
                else return false; //cannot be an anagram			   
            }
        }
        if(sb.length() == 0) //all characters have been removed
            return true;
        else 
            return false;
    }


    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("enter the first  word:");
        String s = in.nextLine();
        System.out.println("enter the second word:");
        String s1 = in.nextLine();

        if(isAnagram(s,s1))
            System.out.println("is anagram");
        else 
            System.out.println("NOT anagram");

    }


}
