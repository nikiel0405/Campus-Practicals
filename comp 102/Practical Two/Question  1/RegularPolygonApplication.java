class RegularPolygonApplication{

   public static void main (String[] args){
   
   RegularPolygon poly1 = new RegularPolygon();
   RegularPolygon poly2 = new RegularPolygon(3, 2, 7, 9);
   RegularPolygon poly3 = new RegularPolygon(5, 6);
   poly1.setXcord(6);
   poly1.setYcord(12);
   poly1.setN(5);
   poly1.setSide(7);
   System.out.println("the no of sides of p1 is : " +poly1.getN());
   System.out.println("the lenght of p1 is : " +poly1.getSide());
   System.out.println("the X cord of p1 is : " +poly1.getXcord());
   System.out.println("the Y cord of p1 is : " +poly1.getYcord());
   
   System.out.println();
   
   System.out.println("the no of sides of p2 is : " +poly2.getN());
   System.out.println("the lenght of p2 is : " +poly2.getSide());
   System.out.println("the X cord of p2 is : " +poly2.getXcord());
   System.out.println("the Y cord of p2 is : " +poly2.getYcord());
   
   System.out.println();
   
   System.out.println("the no of sides of p3 is : " +poly3.getN());
   System.out.println("the lenght of p3 is : " +poly3.getSide());
   System.out.println("the X cord of p3 is : " +poly3.getXcord());
   System.out.println("the Y cord of p3 is : " +poly3.getYcord());
   
   boolean t = poly1.equals(poly2);
   boolean y = poly1.equals(poly3);
   boolean v = poly2.equals(poly3);
   
   if (t == true) {
      System.out.println("polygons 1 and 2 are equal ");
   }
   
   else {
      System.out.println("polygons 1 and 2 are not equal");
   }
   
   if (y == true) {
      System.out.println("polygons 1 and 3 are equal ");
   }
   
   else {
      System.out.println("polygons 1 and 3 are not equal");
   }

   if (v == true) {
      System.out.println("polygons 3 and 2 are equal ");
   }
   
   else {
      System.out.println("polygons 3 and 2 are not equal");
   }





   }
}