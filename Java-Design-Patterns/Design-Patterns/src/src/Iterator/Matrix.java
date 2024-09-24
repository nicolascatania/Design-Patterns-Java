package Iterator;

import java.util.Iterator;

public class Matrix <T> implements Iterable<T> {

    private T[][] matrix;
    private int row, col;


    public Matrix(T[][] matrix) {
        this.matrix = matrix;
        this.row = matrix.length;
        this.col = matrix[0].length;
    }

    public int getRows(){
        return row;
    }

    public int getCols(){
        return col;
    }

    public T get(int row, int col){
        return matrix[row][col];
    }

    @Override
    public Iterator<T> iterator() {
        return new MatrixIterator<T>(this);
    }


}
