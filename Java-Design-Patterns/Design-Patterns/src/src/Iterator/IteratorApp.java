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
        MatrixIterator<Point> iterator = new MatrixIterator<Point>(matrix);

        //quick change, the iterator will iterate through the matrix in a chess board pattern.
        while(iterator.hasNext()) {
            Point point = iterator.next();
            System.out.println(point);
        }

    }


}
