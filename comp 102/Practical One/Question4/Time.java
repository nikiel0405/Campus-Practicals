class Time{

   int hour;
   int minutes;
   
   
   Time(){
   }
   
   Time(int h , int m){
   hour = h;
   minutes = m;
   }
   
   Time(int m){
   int h = m/60;
   int l = m-(h*60);
   hour = h;
   minutes = l;
   }
   
   int gethours(){
      return hour;
   }
   
   int getminutes(){
      return minutes;
   }
   
   
   void gettime12(){
      (if hour >12) 
         { int hr  = hour - 12;
         System.out.println("the 12 hr format is " hr+ ":"+minutes + "pm");
         }
      else
         {
         System.out.println("the 12 hr format is " hour+ ":"+minutes + "am");
         }
   
   }
   
   void gettime24 (){
   
   System.out.println("the 24 hour format is " +hour + "H" +minutes);
   }

   int Gettotalminutes(){
      return (hour*60)+minutes;
   }

   void settime(int h, int m){
      hour = h;
      minutes = m;
   }

   void update(int mins){
   
      int mini = Gettotalminutes();
      mini +=mins;
   }

   boolean islater(mytime, atime){
      if (atime - mytime) < 0 
      {
         return False;
   
      }
      else
      {
         return True;
      }
   }













}