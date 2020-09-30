import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("###.##");
        Circle churcle = new Circle(4);
        System.out.println("The cicle's area is " + df.format(churcle.getArea()));
        System.out.println("The circle's diameter is " + churcle.getDiamater());
        System.out.println("The circle's circumference is " + df.format(churcle.getCircumfernce()));
    }
}