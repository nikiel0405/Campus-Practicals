import java.util.Scanner;

class Interest{

   public static void main(String[] args){
      
      Scanner key = new Scanner(System.in);
      
      System.out.println("Enter the ammount : ");
      
      double P = key.nextDouble();
      
      System.out.println("Enter the interest rate : ");
      
      double R = key.nextDouble();
      
      System.out.println("Enter the no. of years : ");
      
      int N = key.nextInt();
      double rate = R/100;
      double num = P *(Math.pow((1+rate),N))*rate;
      double den = (Math.pow((1+rate), N))-1;
      double A = num/den;
      System.out.println(" your interest is : "+A);
      
      
      
      













   }
}