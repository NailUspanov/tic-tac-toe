package tictactoe;

import tictactoe.component.*;
import tictactoe.keypad.TerminalNumericKeypadCellNumberConverter;

public class Launcher {
    public static void main(String[] args) {
        CellNumberConverter cellNumberConverter = new TerminalNumericKeypadCellNumberConverter();
        Game game = new Game(new MoveUser(), new Print(cellNumberConverter), new MoveComputer(), new WinnerVerifier(), new CellVerifier(), cellNumberConverter);
        game.game();
    }
}
