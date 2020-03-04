import java.util.Scanner;
class Conversion {
   public static double celsiustofahrenheit(double celsius ){
      
      return (((9.0/5)*celsius)+32);
     
   }
   
      public static double fahrenheittocelsius(double fahrenheit ){
      
      
      return ((fahrenheit -32)*5)/9;
     
   }   
   
   public static void main (String[] args){
      
      Scanner conversion = new Scanner(System.in);
      
      System.out.println(" 1 : convert from celsius to fahrenheit");
      System.out.println(" 2 : convert from fahrenheit to celsius");
      System.out.println(" select 1 or 2");
      int num = conversion.nextInt();
      
      if (num ==1) {
         System.out.println(" Enter celsius ammount : ");
         double cel = conversion.nextDouble();
         double far = celsiustofahrenheit(cel);
         System.out.println("Celsius"+" "+ "fahrenheit");
         System.out.println(cel +" "+far);
         
      }
      else{
         System.out.println(" Enter fahrenheit ammount : ");
         double ce = conversion.nextDouble();
         double fa = fahrenheittocelsius(ce) ; 
         System.out.println("fahrenheit"+" "+ "celsius");
         System.out.println(ce +" "+fa); 
      }
      
   
   
   
   
   
   }




}