class RectangleApplication {

   public static void main(String[] args){
      Rectangle rect1 = new Rectangle();
      Rectangle rect2 = new Rectangle(4,9);
      rect1.setWidth(7);
      rect1.setHeight(3);
      System.out.println("The width of the first rectangle is "+rect1.getWidth());
      System.out.println("the height of the first rectangle is  "+rect1.getHeight());
      System.out.println("The width of the second rectangle is "+rect2.getWidth());
      System.out.println("the height of the second rectangle is  "+rect2.getHeight());
      System.out.println("The area of the first rectangle is " +rect1.getArea() + " cm^2");
      System.out.println("the perimeter of the first rectangle is  "+rect1.getPerimeter() + " cm");
      System.out.println("The area of the second rectangle is " +rect2.getArea() + " cm^2");
      System.out.println("the perimeter of the second rectangle is  "+rect2.getPerimeter() + " cm")
   }
}