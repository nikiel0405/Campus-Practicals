class myPointApplication{
   public static void main(String[] args){
      myPoint point1 = new myPoint();
      myPoint point2  = new myPoint(12, 17);
      point1.setX(4);
      point1.setY(6);
      
      double dist = point1.distance(point2.getX(), point2.getY());
      
      System.out.println("the x coordinate of the first point is " +point1.getX());
      System.out.println("the y coordinate of the first point is " +point1.getY());
      System.out.println("the x coordinate of the second point is " +point2.getX());
      System.out.println("the y coordinate of the second point is " +point2.getY());
      System.out.println("The distance from the first point and specified point (7, 8) is " + point1.specificDistance());
      System.out.println("The distance from the second point and specified point (7, 8) is "+point2.specificDistance());
      System.out.println("the distance between the two points are " +dist);
      






















   }
}