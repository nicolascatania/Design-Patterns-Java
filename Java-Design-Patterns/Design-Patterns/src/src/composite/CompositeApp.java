package composite;

import utils.Point;

public class CompositeApp {
    public static void main(String[] args) {
        Square square = new Square(new Point(0,0), 5);
        Rectangle rectangle = new Rectangle(new Point(2,2),3, 1);
        IrregularPolygon irregularPolygon = new IrregularPolygon(new Point[]{new Point(0,0), new Point(0,2), new Point(2,2), new Point(-1,7)});

        CompositeShape cp = new CompositeShape();
        cp.addShape(square);
        cp.addShape(rectangle);
        cp.addShape(irregularPolygon);

        System.out.println("INITIAL COMPOSITE SHAPE");
        System.out.println(cp);

        CompositeShape traslatedCp = cp.translate(new Point(-10,-10));

        System.out.println("TRASLATED COMPOSITE SHAPE");
        System.out.println(traslatedCp);
    }

}
