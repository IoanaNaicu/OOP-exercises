import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Rectangle rec1 = new Rectangle(4,5);
//        Rectangle rec2 = new Rectangle (5, 8);
//        System.out.println("Area of rec1 is: " + rec1.getArea());
//        System.out.println("Area of rec2 is: " + rec2.getArea());


//        Area area1 = new Area();
//        Scanner in = new Scanner(System.in);
//        System.out.println("insert length: ");
//        area1.setLength(in.nextInt());
//        System.out.println("insert breadth: ");
//        area1.setBreadth(in.nextInt());
//        System.out.println(area1.getArea());

//        Average average1 = new Average();
////        Scanner in = new Scanner(System.in);
////        System.out.println("insert no1: ");
////        average1.setInt1(in.nextInt());
////        System.out.println("insert no2: ");
////        average1.setInt2(in.nextInt());
////        System.out.println("insert no3: ");
////        average1.setInt3(in.nextInt());
////        average1.calculateAverage();


        Complex c = new Complex(0,0);
        Complex d = new Complex(0,0);

        Complex e = Complex.add(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.product(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
