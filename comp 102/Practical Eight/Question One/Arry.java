import java.util.*;
class Arry {

   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the length :");
   
   int k = sc.nextInt();
   Numbers n = new Numbers(k);
   n.readNumbers();
   n.displayArray();
   System.out.println("max = " +n.getMax());  
   System.out.println("average = "+n.getAverage());
   System.out.println("enter number to check greater values = ");
   int d = sc.nextInt();
   System.out.println("numbers above are  = "+ n.getAbove(d));  
   
   
   
   }
}