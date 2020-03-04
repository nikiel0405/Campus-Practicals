import java.util.Scanner;
class Frequency{
   public static void main(String[] agrs){
      Scanner key= new Scanner(System.in);
      System.out.println("enter size of array");
      int numb = key.nextInt();
      String[] arr1 = {"o-9", "10-19", "20-29", "30-39", "40-49", "50-59", "60-69", "70-79","80-89","90-99","100-109"};
      int[] arr2 = new int[numb];
      for(int  i = 0 ; i<numb; i++){
         System.out.println("enter a number ");
         int o = key.nextInt();
         if ((o >=0) && (o<=109)){
            arr2[i] = o;
         }//if loop
         else{
            while( (o > 109 ) || ( o<0)){
               System.out.println("enter a valid number between 0 and 109 ");
               o = key.nextInt();
            }//while
            arr2[i] = o;
         }//else
      }//for loop
      int min = 0;
      int max = 9;
      for(int i = 0; i < arr1.length ; i++){
         System.out.print(arr1[i]+ "\t"+ " = ");
         for(int j = 0 ; j < numb ;  j++){
            if((arr2[j]>=min) && (arr2[j] <=max)) {
               System.out.print("\t"+arr2[j]);
            }//end iffy
         }//inner loop
         min+=10;
         max+=10;
         System.out.println();
      }//outter loop
   }
}