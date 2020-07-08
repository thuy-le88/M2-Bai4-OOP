import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double getterA() {
        return a;
    }
    double getterB() {
        return b;
    }
    double getterC() {
        return c;
    }
    double getDiscriminant() {
        double delta;
        //return delta = this.b*this.b-4*this.a*this.c;
        return delta=this.getterB()*this.getterB()-4*this.getterA()*this.getterC();
    }
    double getRoot1() {
        double r1;
        return r1=(-this.b+Math.pow(this.getDiscriminant(),0.5))/2/this.a;
    }
    double getRoot2() {
        double r2;
        return r2=(-this.b-Math.pow(this.getDiscriminant(),0.5))/2/this.a;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=input.nextDouble();
        System.out.println("Enter b: ");
        double b=input.nextDouble();
        System.out.println("Enter c: ");
        double c=input.nextDouble();
        QuadraticEquation pt= new QuadraticEquation(a,b,c);
        System.out.println("Quadratic Equation is: "+pt.a+"xx + "+pt.b+"x + "+pt.c);
        if (pt.getDiscriminant()<0) {
            System.out.println("The quadratic equation has no root.");
        } else if (pt.getDiscriminant()==0) {
            System.out.println("The quadratic equation has 1 root is: "+(-pt.c/pt.a));
        } else {
            System.out.println("The 1st root is: " + pt.getRoot1());
            System.out.println("The 2nd root is: " + pt.getRoot2());
        }
    }
}
