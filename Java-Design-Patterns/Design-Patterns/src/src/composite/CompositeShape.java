package composite;

import utils.Point;

import java.util.LinkedList;

public class CompositeShape extends Shape {

    private LinkedList<Shape> shapes = new LinkedList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }




    @Override
    public CompositeShape translate(Point vector) {
        CompositeShape translatedCompositeShape = new CompositeShape();
        for(Shape shape : shapes) {
            translatedCompositeShape.addShape(shape.translate(vector));
        }

        return translatedCompositeShape;
    }

    @Override
    public String toString() {
        return "CompositeShape[" +
                "shapes=" + shapes +
                ']';
    }

}
