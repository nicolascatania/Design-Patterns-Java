package Iterator;

import utils.Point;

public class IteratorApp {

    public static void main(String[] args) {
        int distance = 3;
        Point[][] points =  {
                {new Point(1,2), new Point(3,4), new Point(5,5)},
                {new Point(1,-2), new Point(33,24), new Point(0,-1)},
                {   new Point(0,0), new Point(13,14), new Point(-5,-5)}
        };
        Matrix<Point> matrix = new Matrix<>(points);
        for(Point p1 : matrix) {
            for (Point p2 : matrix) {
                if(p1 != p2 && p1.distanceToPoint(p2)<distance) {
                    System.out.println("Points that are to a distance lower than " + distance + " " + p1 + " " + p2);
                }
            }
        }
    }


}
