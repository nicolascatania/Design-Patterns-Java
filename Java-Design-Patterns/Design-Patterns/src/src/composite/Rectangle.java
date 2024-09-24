package composite;

import utils.Point;

import java.util.Arrays;

public class Rectangle extends Shape{

    private final Point origin;
    private final double wide, height;

    public Rectangle(Point origin, double wide, double height) {
        this.origin = origin;
        this.wide = wide;
        this.height = height;
    }

    public Point getOrigin() {
        return origin;
    }

    public double getWide() {
        return wide;
    }

    public double getHeight() {
        return height;
    }

    public Point[] getVertices(){
        return new Point[]{origin, new Point(origin.getX()+wide, origin.getY()), new Point(origin.getX(), origin.getY()+height), new Point(origin.getX()+wide, origin.getY() + height)};
    }

    @Override
    public String toString() {
        Point[] vertices = getVertices();
        return "Rectangle[" + Arrays.toString(vertices) + "]";
    }

    @Override
    public Rectangle translate(Point vector) {
        return new Rectangle(origin.translate(vector), wide, height);
    }
}
