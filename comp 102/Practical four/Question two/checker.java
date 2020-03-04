import java.util.Scanner;

class checker {

   public static int reduce( long number ){
   
    long x = number;
    
    if ((x <20) && (x >= 0)){
      int sum = 0;
       while(x > 0){
         int u = (int)x%10;
         sum = sum+u;
         x = x/10;
       }
      int s = sum;
      return s;
    }
    
    else{
      int num = 0;
      while(x > 0){
         int b = (int)x %10;
         num = num+b;
         x = x/10;
      }
      return reduce(num);
    }
  }//end
   
   public static void main (String[] args){
      Scanner y = new Scanner(System.in);
      
      System.out.println("enter a number ");
      
      long z = y.nextInt();
      int q = reduce(z);
      
      if (q%3==0){
         
         System.out.println( z +" is divisable by three");
      
      }
      else{
          System.out.println( z +" is not divisable by three");
      
      }
   
   }
}