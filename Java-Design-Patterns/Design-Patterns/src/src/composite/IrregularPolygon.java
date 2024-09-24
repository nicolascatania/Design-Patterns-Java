package composite;

import utils.Point;

import java.util.Arrays;

public class IrregularPolygon extends Shape{

    private final Point[] points;


    public IrregularPolygon(Point[] points) {
        if(points.length < 3){
            throw new IllegalArgumentException("IrregularPolygon requires at least 3 points");
        }

        this.points = points;
    }

    @Override
    public String toString() {
        return "IrregularPolygon[" +
                "points=" + Arrays.toString(points) +
                ']';
    }

    @Override
    public IrregularPolygon translate(Point vector) {
        Point[] newPoints = new Point[points.length];
        for(int i =0; i<points.length; i++){
            newPoints[i] = points[i].translate(vector);
        }

        return new IrregularPolygon(newPoints);
    }

    public Point[] getVertices() {
        return points;
    }


}
