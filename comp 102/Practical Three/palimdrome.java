import java.util.Scanner;
class palimdrome{




      public static int reverse(int x){
   
      int reverse  = 0;
      
      while(x != 0)
      {
          reverse = reverse * 10;
          reverse = reverse + x%10;
          x = x/10;
      }
      return reverse;
     }

   public static void main (String[] args){
      Scanner key = new Scanner(System.in);
      
      
      int x = key.nextInt();
      int y = reverse(x);
      
      if (x==y){
         System.out.println(x +" is a palindrome");
      }
      else{
         System.out.println(x +  " is not a palindrome");
      }
     
   
   
   }


}