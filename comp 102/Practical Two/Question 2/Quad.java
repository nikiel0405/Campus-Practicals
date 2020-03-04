class Quad{

   private double a;
   private double b;
   private double c;
   
   Quad(double A,double B,double C){
      a = A;
      b = B;
      c = C;
   }

   double getA(){
      return a;
   }
   
   double getB(){
      return b;
   }
   
   double getC(){
      return c;
   }

   double getDiscriminant(){
      
      return (b*b)-4*(a*c);
   }
   
   
   double getRoot1(){
      if (getDiscriminant() < 0){
         return 0;
      }
      else {
   
   
         double x = 0-b;
         double y = 1/(2*a);
         double z = Math.pow(getDiscriminant(), 0.5);
         return ((x +z )*y);
      }
   
   }
   
   
   double getRoot2(){
      if (getDiscriminant() < 0){
         return 0;
      }
      else {
   
   
         double x = 0-b;
         double y = 1/(2*a);
         double z = Math.pow(getDiscriminant(), 0.5);
         return ((x  -z )*y);
      }
   
   }
   
   void display(){
      System.out.println("the equation is : "+getA()+"x^2 + " +getB() +"x + " + getC());
      System.out.println("the first root  is : "+ getRoot1());
      System.out.println("the second root is : "+ getRoot2());
      
   
   
   
   }
}