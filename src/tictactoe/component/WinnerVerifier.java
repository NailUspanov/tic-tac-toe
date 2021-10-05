package tictactoe.component;

import tictactoe.model.FieldTable;

public class WinnerVerifier {

    public boolean isComputerWin(FieldTable table) {
        return (winnerByCols(table, 'O') || winnerByDiag(table, 'O') || winnerByRows(table, 'O'));
    }

    public boolean isUserWin(FieldTable table) {
        return (winnerByCols(table, 'X') || winnerByDiag(table, 'X') || winnerByRows(table, 'X'));
    }

    private boolean winnerByRows(FieldTable table, char dig) {
        for (int i = 0; i < 3; i++) {
            if (table.getCell(i, 0) == dig && table.getCell(i, 1) == dig && table.getCell(i, 2) == dig) {
                return true;
            }
        }
        return false;
    }

    private boolean winnerByCols(FieldTable table, char dig) {
        for (int i = 0; i < 3; i++) {
            if (table.getCell(0, i) == dig && table.getCell(1, i) == dig && table.getCell(2, i) == dig) {
                return true;
            }
        }
        return false;
    }

    private boolean winnerByDiag(FieldTable table, char dig) {
        if (table.getCell(0, 0) == dig && table.getCell(1, 1) == dig && table.getCell(2, 2) == dig)
            return true;
        return table.getCell(0, 2) == dig && table.getCell(1, 1) == dig && table.getCell(2, 0) == dig;
    }


}
