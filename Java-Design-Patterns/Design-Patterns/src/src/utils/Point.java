package utils;

public class Point {

    private double x,y;

    public Point(double x, double y){
            this.x = x;
            this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceToPoint(Point p){
        return Math.hypot(x - p.getX(), y - p.getY());
    }

    public Point translate(Point vector){
        return new Point(x+vector.getX(), y+vector.getY());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
