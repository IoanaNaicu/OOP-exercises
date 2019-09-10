public class Area {
     private int length;
     private int breadth;

    public Area() {

    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length){
        this.length = length;
    }


    public int getArea(){
        return length*breadth;
    }
}
