import java.util.Scanner;
class reverse{
   public static void main(String[]args){
      int[] numbers;
      Scanner key=new Scanner(System.in);
      numbers=new int[27];
      for(int i=0;i<27;++i){
         System.out.println("enter a number");
         numbers[i]=key.nextInt();
      }
      for(int i=26;i>0;--i){
         if((numbers[i] % 2)==1){
            if ((i % 7)==0){
               System.out.println();
            }
            System.out.print(numbers[i]+"\t");
         }
      }  
   }
}