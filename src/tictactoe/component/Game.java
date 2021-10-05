package tictactoe.component;

import tictactoe.model.FieldTable;

import java.util.Random;

public class Game {

    private final MoveUser moveUser;
    private final Print print;
    private final MoveComputer moveComputer;
    private final WinnerVerifier winnerVerifier;
    private final CellVerifier cellVerifier;
    private final CellNumberConverter cellNumberConverter;

    public Game(MoveUser moveUser, Print print,
                MoveComputer moveComputer,
                WinnerVerifier winnerVerifier,
                CellVerifier cellVerifier, CellNumberConverter cellNumberConverter) {
        this.moveUser = moveUser;
        this.print = print;
        this.moveComputer = moveComputer;
        this.winnerVerifier = winnerVerifier;
        this.cellVerifier = cellVerifier;
        this.cellNumberConverter = cellNumberConverter;
    }

    public void game() {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        print.printMappingTable();
        FieldTable table = new FieldTable(cellNumberConverter);
        if (new Random().nextBoolean()) {
            moveUser.move(table);
            print.printTable(table);
        }
        while (true) {
            moveComputer.move(table);
            print.printTable(table);
            if (winnerVerifier.isComputerWin(table)) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            if (cellVerifier.allCellsAreFilled(table)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            moveUser.move(table);
            print.printTable(table);
            if (winnerVerifier.isUserWin(table)) {
                System.out.println("USER WIN!");
                break;
            }
            if (cellVerifier.allCellsAreFilled(table)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
    }

}
