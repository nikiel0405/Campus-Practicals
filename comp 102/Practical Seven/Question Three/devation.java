import java.util.Scanner;
class devation{
   public static void main(String[]args){
      int[] numa;
      int num;
      int j;
      double sum;
      double mean;
      double deviation;
      double top;
      sum=0;
      mean=0;
      top=0;
      System.out.println("enter number of numbers in the array");
      Scanner key=new Scanner(System.in);
      num=key.nextInt();
      numa=new int[num];
      int length=numa.length;
      for(int i=0;i<length;++i){
         System.out.println("enter number in the array");
         j=key.nextInt();
         numa[i]=j;
         sum+=j;    
      }
      mean=sum/num;
      for(int i=0;i<length;++i){
         top=Math.pow((numa[i]-mean),2); 
      }
      deviation=Math.pow(top/num-1,1/2);
       System.out.println(mean+" "+deviation); 
   }
}