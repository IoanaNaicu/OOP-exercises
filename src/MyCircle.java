public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(int x, int y, int radius){
       center.setX(x);
        center.setY(y);
        radius = radius;
    }

    public int getCenterX(){
        return center.getX();
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    public String toString(){
        return "Circle @ " + "(" + center.getX() + "," + center.getY() + ") " + "  radius = " + radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
