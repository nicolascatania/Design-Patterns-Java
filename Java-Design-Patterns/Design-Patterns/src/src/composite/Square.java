package composite;

import utils.Point;

import java.util.Arrays;

public class Square extends Shape {
    //my shapes are not mutable
    private final Point origin;
    private final double sideLength;

    public Square(Point origin, double sideLength) {
        this.origin = origin;
        this.sideLength = sideLength;
    }

    public Point getOrigin() {
        return origin;
    }

    public double getSideLength() {
        return sideLength;
    }

    public Point[] getVertices() {
        return new Point[]{origin, new Point(origin.getX() + sideLength, origin.getY()), new Point(origin.getX(), origin.getY() + sideLength), new Point(origin.getX() + sideLength, origin.getY() + sideLength)};
    }

    @Override
    public String toString() {
        Point[] vertices = getVertices();

        return "Square[ " + Arrays.toString(vertices) + "]";
    }

    @Override
    public Square translate(Point vector) {
        return new Square(origin.translate(vector), sideLength);
    }
}
