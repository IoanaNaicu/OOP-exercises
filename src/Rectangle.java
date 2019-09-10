public class Rectangle {
    private int breadth;
    private int length;

    public Rectangle(int breadth, int length) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return this.breadth*this.length;
    }
}
