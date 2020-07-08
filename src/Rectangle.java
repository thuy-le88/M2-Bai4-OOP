import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    public Rectangle() {
    }
    public Rectangle(double width,double height) {
        this.width=width;
        this.height=height;
    }
    public double getArea() {
        return this.width*this.height;
    }
    public double getPerimeter() {
        return (this.width+this.height)*2;
    }
    public String display() {
        return "Rectangle {width: "+width+"; height: "+height+"}";
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter width: ");
        double width=input.nextDouble();
        System.out.println("Enter height: ");
        double height=input.nextDouble();
        Rectangle rec1=new Rectangle(width,height);
        System.out.println("rec1 is: "+rec1.display());
        System.out.println("rec1 area is: "+rec1.getArea());
        System.out.println("rec1 perimeter is: "+rec1.getPerimeter());
    }
}
