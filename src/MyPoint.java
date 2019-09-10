public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        int diffX = this.x - x;
        int diffY = this.y - y;
        double distance = Math.sqrt(diffX*diffX+diffY*diffY) ;
        return distance;
    }

    public double distance(MyPoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        double distance = Math.sqrt(xDiff*xDiff+yDiff*yDiff) ;
        return distance;
    }
}
