class Rectangle{

   double width;
   double height;
   
   Rectangle(){
      width = 1.0;
      height = 1.0;
      
   } 
   
   Rectangle(double w, double h){
      
      width = w;
      height = h;
   
   }
   
   void setWidth(double e){
      
      width = e;
   }
   
   void setHeight(double r) {
      
      height = r;   
   
   }
   double getWidth(){
      
      return width;
   }
   
   double getHeight(){
      
      return height;
   }
   
   double getArea(){
      
      double  area = width *height;
      return area;
   
   }
   
   
  double getPerimeter(){
   
      double perimeter = 2*(width+height);
      return perimeter;
  }

}