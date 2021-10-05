package tictactoe.component;

import tictactoe.model.FieldTable;

import java.util.Random;

public class MoveComputer {

    public void move(FieldTable table) {
        int randomCol = new Random().nextInt(3);
        int randomRow = new Random().nextInt(3);

        while (!table.isEmpty(randomRow, randomCol)) {
            randomCol = new Random().nextInt(3);
            randomRow = new Random().nextInt(3);
        }
        table.getTable()[randomRow][randomCol] = 'O';
    }
}
