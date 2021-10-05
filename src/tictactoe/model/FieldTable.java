package tictactoe.model;

public class FieldTable {
    private final char[][] table = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public boolean isEmpty(Cell cell) {
        return table[cell.getRow()][cell.getCol()] == ' ';
    }

    public boolean isEmpty(int row, int col) {
        return isEmpty(new Cell(row, col));
    }

    public char[][] getTable() {
        return table;
    }
}
