package Iterator;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private Matrix<T> matrix;
    private int i, j;

    public MatrixIterator(Matrix<T> matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        return i < matrix.getRows() && j < matrix.getCols();
    }

    @Override
    public T next() {
        T element = matrix.get(i, j);
        j++;
        if (j == matrix.getCols()) {
            i++;
            j = 0;
        }
        return element;
    }

}