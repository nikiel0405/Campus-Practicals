import java.util.Scanner;
class primes {

   public static boolean isprime(int x){
      int z = 0;
      for ( int i= 0 ; (i<= x) ; i++){
          if (i%x == 0) {
            z +=1;
          }// end if loop
      
      }// end for loop  
      if (z == 2) {
         return true;
         
      }// end if return
      else{
         return false;
      }// end else return
   }// end 
   
   public static int reverse(int x){
   
      int reverse  = 0;
      
      while(x != 0)
      {
          reverse = reverse * 10;
          reverse = reverse + x%10;
          x = x/10;
      }
      return reverse;
      
   
   
   }//end thing
   
   public static void main(String[] args){
      
      Scanner key = new Scanner(System.in);
      
      System.out.println("enter a number : ");
      
      int num = key.nextInt();
      
      boolean v = isprime(num);
      int t = reverse(num);
      boolean y = isprime(t);
      
      if (v == y) {
      
         System.out.println("Is "+num+" prime? : "+v);
         System.out.println("Is "+ t +" prime : "+y);
         System.out.println(num +" and "+ t +" are prime");

      }  
      else{
         System.out.println("Is "+num+" prime :"+v);
         System.out.println("Is "+ t +" prime : "+y);
         System.out.println(num +" and "+ t +" are not prime");

      }         
      
   
      
   } 
   
}