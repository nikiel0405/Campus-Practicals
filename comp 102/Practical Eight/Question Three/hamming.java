import java.util.Scanner;
import java.lang.Math.*;
class hamming{

   int hammingdistance(int[] a,int[] b){
      int length1=a.length;
      int length2=b.length;
      int min=Math.min(length1,length2);
      int h=Math.abs(length1-length2);
      
      for(int i=0;i<min;i++){
         if (a[i]!=b[i]){
            h++;
         }             
         
      } 
      
      
   return h;
   }
   
   
   public static void main(String[]args){
      
      hamming hamming=new hamming();
      Scanner key=new Scanner(System.in);
      int bitl1=key.nextInt();
      int bitl2=key.nextInt();
      
      int[] bita1=new int[bitl1];
      int[] bita2=new int[bitl2];
      
      for(int i=0;i<bitl1;i++){
         System.out.println("enter part of bit")  ;
         bita1[i]=key.nextInt();
         
      }
      
      for(int i=0;i<bitl2;i++){
         System.out.println("enter part of bit2")  ;
         bita2[i]=key.nextInt();
         
      }
      
      System.out.println(hamming.hammingdistance(bita1,bita2));
   
   }


}