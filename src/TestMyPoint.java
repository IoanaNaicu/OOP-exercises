import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,0);
        MyPoint p2 = new MyPoint(0,4);

       // System.out.println(p2.toString());

       // System.out.println(p1.distance(p2));
        //System.out.println(p1.distance(0,4));

        MyPoint[] p3 = new MyPoint[10];
       // System.out.println(p3.length);
        for (int i = 0; i < 10; i++){
            p3[i] = new MyPoint(i+1,i+1);
            //System.out.println(p3[i]);
        }

        MyCircle c1 = new MyCircle(p1, 6);
       // System.out.println(c1.toString());
      //  System.out.println(c1.getCenterX());
      //  System.out.println(c1.getCenterY());
        c1.setCenter(p2);
      //  System.out.println(c1.getCenter());
        c1.setCenterXY(1,1);
       // System.out.println(c1);
        c1.setCenteX(7);
        System.out.println(c1);

       //MyCircle c2 = new MyCircle(1,2,9);
        //System.out.println(c2.getCenter());

    }
}
