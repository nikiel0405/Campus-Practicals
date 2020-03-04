import java.util.Scanner;
class pyramidpp {

   public static void main (String[] args){
   
      Scanner y = new Scanner(System.in);
      System.out.println("enter number of rows ");
      int u = y.nextInt();
      int k = 0;
      int z = 1;
        for(int i = 1; i <= u; ++i, k = 0) {
            for(int space = 1; space <= u - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print(" "+ z);
                ++k;
                z +=1;
               
            }
                
            System.out.println();
        }
    }
}