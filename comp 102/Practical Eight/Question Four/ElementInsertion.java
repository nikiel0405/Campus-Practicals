import java.util.Scanner;
class ElementInsertion{
   
   public static char[] insert(char[] a, int index, char element){
      a[index] = element;
      for(int i = a.length - 1; i > index; i-- ){
         
         a[i+1] = a[i]; 
      }
      
      return a;   
   }

   public static void main(String[] args){
      char[] arr = {'c','o','m','p','u','t','r'};
      char[] arrans = null;
      char last = (arr[arr.length-1]);
      arrans = insert(arr, 6,'e');
      
      System.out.print("[");
      for(char value:arrans){
         System.out.print(value+"");
      }
      System.out.print(last);
      System.out.print("]");
   }

}//<>