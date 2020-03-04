import java.util.Scanner;
class Unique{

   public static void main(String[] args) {
   
      Scanner key = new Scanner(System.in);
      
      System.out.println("Enter number of elements in array");
      int numb = key.nextInt();
      
      int[] arr1 = new int[numb];
      
      
      for( int  i= 0; i <numb ; i++){
         System.out.println("enter a number : "); 
         arr1[i] = key.nextInt();
      }
      System.out.println();
      System.out.println("the unique number/s is/are :");
      
      for(int i = 0; i <numb ; i++){
         int ava = 0;
         for(int j= 0 ; j <numb ; j++){
         
            if (arr1[i] == arr1[j]){
            
               ava+=1;
            
            }
         
         
         
         }//inner loop
         
         
         
         if (ava ==1){
         
            System.out.print("\t" + arr1[i]);         
         
         
         }//outter loop
      
      
      
      }//outter
   
   }
}
