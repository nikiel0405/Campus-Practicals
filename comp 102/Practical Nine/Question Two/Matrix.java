class Matrix{

   static void print(int[][]A){
      for (int i = 0; i<A.length;i++){
         for(int j = 0; j<A[i].length;j++){
            System.out.printf("%9s",+A[i][j]);
         }
         System.out.println('\n');
      }    
   }
   
   
   static void classify(int[][]A){
      boolean lt=true;
      boolean ut= true;
      boolean dg= true;
   
      for(int i = 0; i<A.length;i++){
         for(int j = 0; j<A[0].length;j++){
            if((i!=j)&&(A[i][j]!=0)){
               dg=false;
               if(i<j){
                  lt=false;
               }
               if(i>j){
                  ut=false;
               }
            }    
         }
         
      }
      System.out.println("");
      
      if(dg){
         System.out.println("diagonal");
      }
      else if(lt){
         System.out.println("lower triangular");
      }
      else if(ut){
         System.out.println("upper triangular");

      }
      else{
         System.out.println("none");
      }
      
   }
   static int[][] sum(int[][]A,int[][]B){
      if((A.length==B.length) && (A[0].length==B[0].length)){
         int[][] S= new int[A.length][A[0].length]; 
         
         for (int i = 0; i<A.length;i++){
            for(int j = 0; j<A[i].length;j++){
               S[i][j]=A[i][j]+B[i][j];
            }
         } 
         return S; 
         
      }
      else{
         int[][] S={{}};
         System.out.println("error:matrices of different sizes");
         return S;
      }
         
   }
   
   static int[][] multiply(int[][]A, int c){
      int[][]B = new int[A.length][A[0].length];
      for (int i = 0; i<A.length;i++){
         for(int j = 0; j<A[i].length;j++){
            B[i][j]=A[i][j]*c;
         }
      } 
      return B;  
   }
   
   static int[][] multiply(int[][]A,int[][]B){
      if(A[0].length==B.length){
         int[][] S= new int[A.length][B[0].length]; 
         
         for (int i = 0; i<S.length;i++){
            for(int j = 0; j<S[i].length;j++){                
               int k=0;
               int entry=0;
               while(k<B.length){
                  entry+=A[i][k]*B[k][j];
                  k++;
               }
               S[i][j]=entry;        
            }
         }       

         return S; 
         
      }
      else{
         int[][] S={{}};
         System.out.println("error:matrices of invalid sizes");
         return S;
      }
         
   }


   public static void main(String[] args){
      int[][]A =
      {
      {12,13,45,73},
      {99,11,22,33},
      {55,44,33,22},
      {98,87,76,65},
      };
      
      int[][]B =
      {
      {17,13,40,73},
      {9,11,28,36},
      {21,94,37,22},
      {98,17,76,60},
      }; 
      
      print(A);
      System.out.println();
      print(B);
      
      System.out.println();
      print(sum(A,B));
      System.out.println();
      
      print(multiply(A,B));
      System.out.println();
      
      print(multiply(B,3));
      classify(A);
   }
}