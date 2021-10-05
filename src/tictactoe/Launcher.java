package tictactoe;

import tictactoe.component.*;

public class Launcher {
    public static void main(String[] args) {
        Game game = new Game(new MoveUser(), new Print(), new MoveComputer(), new WinnerVerifier(), new DrawVerifier());
        game.game();
    }
}
