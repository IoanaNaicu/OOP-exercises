public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("C1 radius is " + c1.getRadius() + " and area is " + c1.getArea());

        Circle c2 = new Circle(2);
        System.out.println("C2 radius is " + c2.getRadius() + " and area is " + c2.getArea());

        Circle c3 = new Circle(3, "blue");
        System.out.println("C3 radius is " + c3.getRadius() + " and area is " + c3.getArea());
        System.out.println(c3.getColor());

        c3.setRadius(7);
        c3.setColor("yellow");
        System.out.println("C3 radius is " + c3.getRadius() + " and area is " + c3.getArea());

        System.out.println(c3.toString());

    }

}
