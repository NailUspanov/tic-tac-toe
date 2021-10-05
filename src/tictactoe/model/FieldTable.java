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
}
