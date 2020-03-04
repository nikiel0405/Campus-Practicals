class Perfect {

   public static void main (String[] args){
      int x = 1;
      while (x <= 10000){
         int sum = 0;
         for(int i= 1; i<x; i++){
           if (x%i==0){
            sum+=i;
           }
         }
         if (sum == x) {
            System.out.println(x + " is a perfect number ");
           
         }
      
      //end
      x++;
      }
   }


}