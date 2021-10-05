package tictactoe.keypad;

import tictactoe.component.CellNumberConverter;
import tictactoe.model.Cell;

public class DesktopNumericKeypadCellNumberConverter implements CellNumberConverter {

    private final char[][] mapping = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}
    };

    @Override
    public Cell toCell(int num) {
        return switch (num) {
            case 1 -> new Cell(2, 0);
            case 2 -> new Cell(2, 1);
            case 3 -> new Cell(2, 2);
            case 4 -> new Cell(1, 0);
            case 5 -> new Cell(1, 1);
            case 6 -> new Cell(1, 2);
            case 7 -> new Cell(0, 0);
            case 8 -> new Cell(0, 1);
            case 9 -> new Cell(0, 2);
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
    }

    @Override
    public char toNumber(Cell cell) {
        return mapping[cell.getRow()][cell.getCol()];
    }
}
