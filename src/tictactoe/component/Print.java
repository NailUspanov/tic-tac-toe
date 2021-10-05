package tictactoe.component;

import tictactoe.model.Cell;
import tictactoe.model.FieldTable;

public class Print {
    CellNumberConverter cellNumberConverter;

    public Print(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void printMappingTable() {
        StringBuilder sb = new StringBuilder("-------------\n| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(cellNumberConverter.toNumber(new Cell(i, j))).append(" | ");
            }
            if (i != 2) sb.append("\n-------------\n| ");
        }
        sb.append("\n-------------");
        System.out.println(sb);
    }

    public void printTable(FieldTable table) {
        StringBuilder sb = new StringBuilder("-------------\n| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(table.getCell(i, j)).append(" | ");
            }
            if (i != 2) sb.append("\n-------------\n| ");
        }
        sb.append("\n-------------");
        System.out.println(sb);
    }
}
