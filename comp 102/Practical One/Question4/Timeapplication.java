class Timeapplication{

   public static void main(String[] args) {
      Time start = new Time(13, 45);
      Time end  = new Time(995);
      int startt = start.gettotalminutes();
      int finall  = end.gettotalminutes();
      if (islater(startt,finall) == True)
      {
        int diff = finall - startt;
        x = diff /60;
        system.out.println(200/x);
      }
      else
      {
         system.out.println("invalid time eentered ");
      }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
}