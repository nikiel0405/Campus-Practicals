
class myPoint{

   double x;
   double y;
   
   myPoint(){
   x = 0;
   y = 0;
   }
   
   myPoint(double z, double t){
   x = z;
   y = t;
   }

   double getX(){
   return x;
   }

   double getY(){
   return y;
   }
   
   void setX(double z){
   x =z;
   }
   
   void setY(double t){
   y = t;
   }
   
   double distance( double x2, double y2){
   double x3 = x-x2;
   double y3 = y-y2;
   double sum1 = Math.pow(x3,2);
   double sum2 = Math.pow(y3,2);
   double sum3 = sum1 +sum2;
   double dist =Math.pow(sum3,0.5);
   return dist;
   }

   double specificDistance(){
   double x2  = x-7;
   double y2 = y-8;
   double sum1 = Math.pow(x2,2);
   double sum2 = Math.pow(y2,2);
   double sum3  = sum1 +sum2;
   double dist = Math.pow(sum3,0.5);
   return dist;
   }
}