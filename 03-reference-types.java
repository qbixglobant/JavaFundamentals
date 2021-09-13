import java.awt.*;

public class Main {
    

    public static void main(String[] args) {
        Point point1 = new Point(1, 1);

        // Points to the same reference location in memory
        Point point2 = point1;
        
        point1.x = 2;

        System.out.println("Point1 X: " + point1.x);
        System.out.println("Point2 X: " + point2.x);
    }

}
