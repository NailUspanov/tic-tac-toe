package tictactoe.component;

import tictactoe.model.FieldTable;

public class Print {
    public void printMappingTable() {
        System.out.println(
                """
                        -------------
                        | 7 | 8 | 9 |
                        -------------
                        | 4 | 5 | 6 |
                        -------------
                        | 1 | 2 | 3 |
                        -------------""");
    }

    public void printTable(FieldTable table) {
        StringBuilder sb = new StringBuilder("-------------\n| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(table.getTable()[i][j]).append(" | ");
            }
            if (i != 2) sb.append("\n-------------\n| ");
        }
        sb.append("\n-------------");
        System.out.println(sb);
    }
}
