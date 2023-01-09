import java.util.Scanner;

public class SwitchProgram {
    public static void main(String[] args) {
        // a) Area of circle (c) (Pi*r*r)
        // b) Area of Rectangle (r)
        // c) Area of Triangle (t)
        // d) Area of Square (s)
        // Default Case (Invalid)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter c to calculate area of circle");
        System.out.println("Enter r to calculate area of rectangle");
        System.out.println("Enter t to calculate area of triangle");
        System.out.println("Enter s to calculate area of square");
        char choice = sc.next().charAt(0);

        switch(choice){
            case 'c':
                System.out.print("Enter radius of circle: ");
                double r = sc.nextDouble();
                double ca = (22/7.0)*r*r;
                System.out.println("Area of Circle: "+ca);
                break;
            case 'r':
                System.out.print("Enter length of rectangle: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double b = sc.nextDouble();
                double ra = l*b;
                System.out.println("Area of Reactangle: "+ra);
                break;
            case 't':
                System.out.print("Enter base of triangle: ");
                double ba = sc.nextDouble();
                System.out.print("Enter height of triangle: ");
                double h = sc.nextDouble();
                double ta = (1/2.0)*ba*h;
                System.out.println("Area of triangle: "+ta);
                break;
            case 's':
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                double sa = side*side;
                System.out.println("Area of square: "+sa);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
