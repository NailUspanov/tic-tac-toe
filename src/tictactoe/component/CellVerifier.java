package tictactoe.component;

import tictactoe.model.FieldTable;

public class CellVerifier {

    public boolean allCellsAreFilled(FieldTable table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table.isEmpty(i, j)) return false;
            }
        }
        return true;
    }
}
