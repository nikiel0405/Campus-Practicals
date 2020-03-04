class VoltageMeasurement{
   
   
  
   public static double average(double[] x){
      double average =0;
      double sum = 0;
      for(double value:x){
         sum += value;
      }
      average = sum/x.length;
      return average;
   }
   
   public static boolean[] vary(double[] x){
      boolean[] retArr = new boolean[x.length];
      double ten = (10/100)*average(x);
      for(int i = 0; i < x.length; i++){
         if(x[i] > (average(x) + ten)){
            retArr[i] = true;
         }
         else{
            retArr[i] = false;
         }
      }
      return retArr;
   }
   
   public static void print15(double[] x){
      double fift = (15/100) * average(x);
      for(double value:x){
         if(value > fift){
            System.out.println(value);
         }
      }   
   }
   
   public static void main(String[] args){
      double[] arr = {221.7, 220.3, 190.3, 210.1, 216.5, 227.33, 185.3, 220.3, 218.45, 236.6, 200.4, 217.4};
      System.out.println("The average is: "+average(arr));
      boolean[] ansArr = null;
      ansArr = vary(arr);
      System.out.print("[");
      for(int i = 0; i < ansArr.length; i++){
         System.out.print(ansArr[i]+", ");
      } 
      System.out.println("]");
      print15(arr);
   }
   
}