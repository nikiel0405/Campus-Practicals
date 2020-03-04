//Class definition 
class Circle {

    //The fields/attributes  of the class
    //to represent the state of the objects
    double radius;

    //A constructor to set the value of the radius
    Circle(double r){
        radius = r;
    }

    //A second constructor to set the value of the radius 1.0
    Circle(){
        radius = 1.0;
    }


    //The methods that define the behavior of the class
    //set the radius of this Circle
    void setRadius(double r){
        radius = r;
    }

    //return the radius of this Circle
    double getRadius(){
        return radius;
    }

    //calculate and return the circumference of this circle
    double getCircumference(){
        return 2 * Math.PI * radius;
    }

    //calculate and return the area of this circle
    double getArea(){
        return Math.PI * radius * radius;
    }

}
