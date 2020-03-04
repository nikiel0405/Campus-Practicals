import java.util.Scanner;
class PegSolitaire {
   
   char [][] arr ;
 
   public PegSolitaire() {
      fill();
   }//end of constructor
   
   public void fill(){
      
      arr = new char[9][9];  
      for(int row = 0 ;  row < 9 ;  row++){
      
         for(int col = 0; col < 9  ;  col++){
         
            if( (  (  row  >  2  ) && (  row   <  6  )  ) || ( ( col  >  2 )  &&  ( col  <  6 ) ) ){
               /*the first bracket of the if statement checks to see if the value of first for loop is inbetween the points 2 and 6 excluding 2 and 6 
                  while the second bracket of if statement checks if the value of the second for loop is inbetween the points 2 and 6 excluding 2 and 6
                  in this way we get the desired coordinated of the points in which a map can be layed out to play the game */
                  
               arr[ row ][ col ]='X';// if the value of first and second for loop meet the condition in the if loop . it is seen as a playable coordinate and an X is used to represent the playable coordinate
               
            }//end if loop
            
            else{
            
               arr[ row ][ col ] = 'Z';// if the values do not meet the requirement of if loop it is seen as an unplayable coordinated and given the sign Z to represent it
               
            }//end else
         }//end second for loop
      }//end first for loop
      
      arr[4][4] = 'O';// given value O to indicate the board is complete O is also seen as a playable coordinate
      
   }//end of fill
   
   
   public void print(){
   
      int x = 0;
      System.out.println("       0          1          2          3          4          5          6          7          8");
      // the y coordinates are outputted to help the player choose their desired coordinate
      System.out.println();
      
      for(int i = 0 ;  i < 9 ;   i++){
      
         System.out.print(x);// this is to output the x coordinates to help the player choose desired coordiantes
       
         for(int j = 0 ; j < 9 ; j ++){
           
            if((arr[ i ][ j ] =='X') || (arr[ i ][ j ] == 'O')){
            /* if the value in the coordinate [i][j] is a playable coordiante i.e the X or O the the point many be outputted */
            
               System.out.print("      "+arr[ i ][ j ]+"    ");
               
            }//end if lloop
            
            else{
            
               System.out.print("    "+"   "+"    ");
               // else it is given a blank space 
               
               /*   
                  each point whether playable or not is given the format of 2 tab spaces before and 2 tab spaces after
                  so the board can be seen without error of judgement
               */
               
            }//end else
         }//end second for loop
         
         x++;
         System.out.println();
         System.out.println();
         
      }//end first for loop
   }//end of print
   
   public boolean IsValid(int fromR, int fromC, int toR, int toC){
   
      if(((fromR  == toR) &&( Math.abs(fromC-toC)==2)) || ((Math.abs(fromR-toR) == 2) &&(fromC == toC))){
         /*  first brackets check if rows are equal and difference between columns is two this is to also check if the two values are not diagonals
               if values does not meet that statement then the second part of the if checks if the difference between rows are 2 and columns are 
               equal this is to also check if the values are not diagonals  */
               
         if(arr[ toR ][ toC ] =='O'){// if condiction check if ending position is empty and equal to character O
         
            if(arr[ fromR ][ fromC ] == 'X'){//if condiction checks if starting position is not empty and equal to character X
            
               int  x = (fromR+toR)/2;//midpoint of row value 
               int y = (fromC+toC)/2;// midpoint of column value
               
               if (arr[ x ][ y ] =='X'){//checks if point between staring and ending position is not filled and equal to character X
               
                  /*the lopp doesnot have to check if the midpoint values differs from the 
                     starting position by one since the first if condiction had checked that either the rows difer by 2 or columns 
                     differ by two therefore the midpoint would most definetely differ by a factor of 1 from starting position     */
                  
               
                  return true;
                  
               }//end fourth if
               
               else{
               
                  return false;
               
               }//end fourth else
            
            }//end third iff
            
            else{
            
               return false;
            
            }//end third else
         }//end second if
         
         else{
         
            return false;
            
         }//end second else
      }//end iff
      
      else {
      
         return false;
      
      }//end else
   }//end IsValid
   
   public boolean Move(int fromR, int fromC, int toR, int toC){
   
      int  x = (fromR+toR)/2;
      int y = (fromC+toC)/2;
       
      if( IsValid(fromR,fromC,toR,toC)==true){//checks if move is valid first
        
         arr[ fromR ][ fromC ] = 'O';//changes starting position to an empty character O
         arr[ toR ][ toC ]  = 'X';//changes final position to a playable character
         arr[ x ][ y ] = 'O';// changes points between the two to an empty character O
          
         return  true;
          
      }
      else{
       
         return false;
         
      }
   }//end Move
   
   public boolean IsEmpty(){
   
      int howx = 0;
   
      for(int i = 0 ; i < 9  ; i++){
      
         for(int j = 0 ; j < 9   ; j++){
         
            if(arr[ i ][ j ] =='X'){
            
               howx++;// checks how many X are left on the board
            
            }//end if
         }//end second for loop
      }//end first for
      
      if (howx != 1){ // if the number of Xs on the board is not 1 then board is not empty and returns false otherwise returns true
         return false;
      }
      else{
         return true;
      }
   }//end IsEmpty
   
   public static void main(String[] args){
      PegSolitaire j = new PegSolitaire();
      Scanner k = new Scanner(System.in);   
      System.out.println("WELCOME TO PEGSOLITAIRE");
      System.out.println();
      int lose = 0; 
      while(lose <4){
         while( j.IsEmpty() == false){
         
            j.print();
          
            System.out.println("Enter the value of Starting position");
            System.out.println("enter x coordinate (SPACE) enter y coordinate");
            int sx = k.nextInt();
            int sy = k.nextInt();
            System.out.println("Enter the value of Final position");
            System.out.println("enter x coordinate (SPACE) enter y coordinate");
            int fx = k.nextInt();
            int fy = k.nextInt();
                     
               if( j.Move(sx,sy,fx,fy) == true ){// makes move and checks validity
               
                  j. IsEmpty();// check if board is empty
               
               }//end inner if
               
               else{
                  System.out.println();
                  System.out.println("!!INVALID MOVE!! ");
                  System.out.println();
                  lose++;
                  break;
                  
               }//end inner else
               
         }//end while loop
            
         if(j.IsEmpty() == true ){
            
            lose = 5;
               
         }//ends if loop 
      } //ends lose condiction
         
      if(lose > 4 ){
         
         System.out.println("CONGRATULATIONS YOU HAVE SUCCESSFULLY COMPLETED THE PUZZLE"); 
         
      }
      else{
            
         System.out.println("!!YOU HAVE BEEN UNSUCCESSFUL IN SOLVING THE PUZZLE!!");  
            
      }  
         
   }//end main method
}//end of class