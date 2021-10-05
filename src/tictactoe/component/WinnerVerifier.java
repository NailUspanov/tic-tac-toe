package tictactoe.component;

import tictactoe.model.FieldTable;

public class WinnerVerifier {
    public boolean isComputerWin;
    public boolean isUserWin;

    public boolean isComputerWin(FieldTable table) {
        return (winnerByCols(table) || winnerByDiag(table) || winnerByRows(table));
    }

    private boolean winnerByRows(FieldTable table) {
        for (int i = 0; i < 3; i++) {
            if (table.getTable()[i][0] == 'O' && table.getTable()[i][1] == 'O' && table.getTable()[i][2] == 'O') {
                return true;
            }
        }
        return false;
    }

    private boolean winnerByCols(FieldTable table) {
        for (int i = 0; i < 3; i++) {
            if (table.getTable()[0][i] == 'O' && table.getTable()[1][i] == 'O' && table.getTable()[2][i] == 'O') {
                return true;
            }
        }
        return false;
    }

    private boolean winnerByDiag(FieldTable table) {
        if (table.getTable()[0][0] == 'O' && table.getTable()[1][1] == 'O' && table.getTable()[2][2] == 'O')
            return true;
        return table.getTable()[0][2] == 'O' && table.getTable()[1][1] == 'O' && table.getTable()[2][0] == 'O';
    }

    public boolean isUserWin(FieldTable table) {
        return true;
    }
}
