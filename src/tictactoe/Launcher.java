package tictactoe;

import tictactoe.component.*;
import tictactoe.keypad.DesktopNumericKeypadCellNumberConverter;

public class Launcher {
    public static void main(String[] args) {
        DesktopNumericKeypadCellNumberConverter cellNumberConverter = new DesktopNumericKeypadCellNumberConverter();
        Game game = new Game(new MoveUser(), new Print(cellNumberConverter), new MoveComputer(), new WinnerVerifier(), new CellVerifier(), cellNumberConverter);
        game.game();
    }
}
