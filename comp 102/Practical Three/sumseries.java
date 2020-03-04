class sumseries {


   public static void main (String[] args){
      double z = 100;
      double sum = 0;
      for ( int i = 1; (i <=100) ;i++){
      
      sum += (Math.pow(-1,i) * i/z);
      
      z-=1;
      }
   
   System.out.println(sum);
   
   
   
   
   
   }
}