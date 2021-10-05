package tictactoe.component;

import tictactoe.model.Cell;

public interface CellNumberConverter {

    Cell toCell(int num);

    char toNumber(Cell cell);
}
