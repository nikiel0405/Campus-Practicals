import java.util.Scanner;
class Numbers{
  //fields
  int[] numbers ;
  
  //constructor
  public Numbers(int num){
     numbers = new int[num];
     }
     
  //methods
  public void readNumbers(){
    Scanner keyboard = new Scanner (System.in);
     for(int i = 0 ; i<numbers.length ; i++){
       System.out.print("Enter a value: ");
       int x = keyboard.nextInt();
       numbers[i]=x;
     }

    }
    
  public int getMax(){
    int max = numbers[0];
    for(int i= 0 ; i<numbers.length; i++){
      if(numbers[i]>max){
        max=numbers[i];
        }
      }
    return max;
   }
   
   public int getAverage(){
     int count = 0;
     int ave = 0;
     int sum = 0;
     for (int i = 0 ; i<numbers.length ; i++){
      count+=1;
      sum=sum+numbers[i];
     }
     ave = sum/count;
     return ave;
   }
   
   public int getAbove(int keyValue){
     int count = 0;
     for (int i = 0 ; i<numbers.length ; i++){
       if(numbers[i]>=keyValue){
         count+=1;
       }
     }
    return count;
   }
   
   public void displayArray(){
     System.out.print(numbers[0]);
     for(int i = 1 ; i<numbers.length ; i++){
       System.out.print(" ; "+numbers[i]);
     }
   
   }
}