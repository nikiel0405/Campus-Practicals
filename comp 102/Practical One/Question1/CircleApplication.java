//class Definition
  class CircleApplication {

    //The main method that runs
    public static void main(String[] args){
        Circle myCircle = new Circle();//  //create a Circle Object
        Circle cir2 = new Circle(4);   
        myCircle.setRadius(5);    
        double circle1 = myCircle.getCircumference();
        double circle2 = cir2.getCircumference();  
        double area1 = myCircle.getArea();
        double area2 = cir2.getArea();                
        System.out.println("The circumference of the first circle is  " + circle1 + " cm");
        System.out.println("The Area of the first circle is " +area1+" cm^2");
        System.out.println("The circumference of the second circle is  " +circle2 +" cm");
        System.out.println("The Area of the second circle is  "+ area2 +" cm^2");
        

     }
   }
