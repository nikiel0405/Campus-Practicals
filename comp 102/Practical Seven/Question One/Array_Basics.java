import java.util.Scanner;
class Array_Basics{
   public static void main(String args[]){
      Scanner key = new Scanner(System.in);
      float[] list= new float[11] ;
      for(int i = 0; i<list.length; i++){
         System.out.println("enter a number ");
         list[i] = key.nextFloat();
      }
      //avgerage
      float sum_avg2 = 0;
      for(int i=0; i<list.length;i++){
         sum_avg2 = list[i]+ sum_avg2;
         } 
      float sum_avg= (sum_avg2/list.length);
      System.out.println("average of the list is " + sum_avg);
      //min
      float min = list[0];
      for(int j= 1; j<list.length; j++){
         if (list[j]<min){
            min = list[j];
            }
         }
      System.out.println("minimum of the list is " + min);
      //max
      float max = 0;
      for(int k= 1; k<list.length; k++){
         if (list[k]>max){
            max = list[k];
            }
         }
      System.out.println("maximum of the list is " + max);
      //neg
      int neg_count = 0;
      for(int l=0; l<list.length; l++){
         if (list[l]<0){
            neg_count++;
            }
         }
      System.out.println("negative numbers in the list is " + neg_count);
      //below avg
      int no_below_avg = 0;
      for(int m=0; m<list.length; m++){
         if (list[m]<sum_avg){
            no_below_avg++;
            }  
         }
      System.out.println("number of negatives in the list is " + neg_count);  
      }
}