class square{



   public static boolean square(int x){
      boolean k = true;
      for( int i = 0; (i <=x);i++){
         if (i*i == x){
         k = true;
         break;
         
      }
      else{
      k = false;
      }
   
   
   
      }
      return k;
   
    
   }

   public static void main (String[] args){
       int i = 1000;
      while (i <10000){
         int low1 = i /100;
         
         int  low2 = i%100;
         boolean z = square(low1);
         

         boolean y = square(low2);
         
         
        if ((z == true)&&(y == true)){
        System.out.println(i);
        } 
       i++;
      }
   
   }


}