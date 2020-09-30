import java.lang.Math;
public class Circle {
    
    //Instance Varibles
    private double radiusOfCircle;
    final double PI = 3.14159;


    public Circle(){
        //Default values
    }

    
    //Constructor
    public Circle(double pRadiusOfCircle){
        this.radiusOfCircle = pRadiusOfCircle;
    }

    //Getters and Setters
    public void setRadius(double newRadius){
        this.radiusOfCircle = newRadius;
    }

    //Returns the radius of circle
    public double getRadius(){
        return this.radiusOfCircle;
    }
    
    //Returns the diameter
    public double getDiamater(){
        return this.radiusOfCircle * 2;
    }

    //Returns the area of the circle
    public double getArea(){
        return Math.pow(this.radiusOfCircle, 2) * PI;
        
    }

    //Return the circumference
    public double getCircumfernce(){
        return this.radiusOfCircle * PI * 2;
    }

    


}
