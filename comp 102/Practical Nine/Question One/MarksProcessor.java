import java.util.Scanner;
class MarksProcessor {

   double[][] arr;
   int x ;
   public MarksProcessor(){
      Scanner s = new Scanner(System.in);
      System.out.println("enter no. of students :");
      x = s.nextInt();
      arr = new double[x][5];
      int q = 1;
      for(int i = 0 ; i <x ;i++){
      
         int t = 1;
         for(int j = 0;j <4; j++){
         
            if(j==3){
            
               System.out.println("enter practical mark of student "+q);
               arr[i][j] = s.nextDouble(); 
                
            }//iffy
            
            else{
            
               System.out.println("enter test "+t+" of student "+q);
               arr[i][j] = s.nextDouble();
               t++;
               
            }//iffy
            
         }//loopy 2
         
         q++;
         
      }//loopy 1
      
   }//constructor1
   
   public MarksProcessor(double[][] mark){
      arr = mark;
   }//constuctor 2
   
   public void average(){
      for(int  i =0 ; i<x;i++){
      
         double sum = 0;
         
         for(int j = 0 ; j< 5 ;j++){
         
            sum +=arr[i][j];
            
         }//loppy2
         
         arr[i][4] = sum/4;
         
      }//loopy1
      
   } //end method; 
   
   public void analyse(){
      int t= 1;
      for(int i = 0; i<5; i++){
      
      int sum = 0;
      
         for(int j = 0; j < x; j++){
         
         double g = arr[j][i];
            sum +=g;   
            
         }//inner
         
         if(t == 4 ){
         
         int ave = sum/x;
            System.out.println("the average mark for the practical is "+ave);
         }
         else{
         
            int ave = sum/x;
            System.out.println("the average mark for test "+t+" is "+ave);
         }
         
         t++;
         
      }//outter
      
   }//method 
   
   public void DpReports(){  
      int s = 1;
      for(int i = 0; i<arr.length;i++){
      
         int fail = 0;
         
         for(int j = 0 ;j< 3;j++){
         
            if(arr[i][j] <40){
            
               fail++;
               
            }//iffy
            
         }//inner loop
         
         if(fail >2){
         
            System.out.println("student " +s+" did not obtain DP");
         }
         else {
         
            if(arr[i][4]<= 40){
               System.out.println("student " +s+" did not obtain DP");
               
            }//small iffy
            else{
            
               if(arr[i][3]<30){
                  System.out.println("student " +s+" did not obtain DP");
                  
               }
               else{
                  System.out.println("student " +s+" did obtain DP");
                  
               }
               
            }//small elsy
            
         }//else
         
         s++;
         
      }//outter loop
      
   }//method 
    
}//class