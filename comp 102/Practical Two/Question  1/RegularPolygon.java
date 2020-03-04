import java.lang.*;
class RegularPolygon{

   private int n;
   private double side;
   private double xcord;
   private double ycord;
   
   
   RegularPolygon(int no, double s, double x , double y){
      n = no;
      side = s;
      xcord = x;
      ycord = y;
   }
   
   RegularPolygon(){
      n = 3;
      side = 2;
      xcord = 0;
      ycord = 0;
      
   }
   
   RegularPolygon(int x , double y){
      n = 3;
      side = 2;
      xcord = x;
      ycord = y;
   }

   int getN(){
   return n;
   }
   
   double getSide(){
      return side;
   }
   
   double getXcord(){
      return xcord;
   }
   
   double getYcord() {
      return ycord;
   }
   
   void setN(int a){
      n = a;
   }
   
   void setSide(double b){
      side= b;
   }
   
   void setXcord(double c){
      xcord = c;
   }
   
   void setYcord(double d){
      ycord = d;
   }

   double getPerimeter(){
      return (side*n);
   }
   
   double getArea(){
      double e = (n*(Math.pow(side,2)));
      double f = 4*(Math.tan(Math.pow(Math.PI,2)/(180*n)));
      return e/f;
   }
   
   boolean equals(RegularPolygon r){
      if (this.getN()==r.getN() && this.getSide() == r.getSide())  
      {
         return true;
      
      }//end of if statement
      else {
         return false;
      }
      
      
   }//end of method
   






}