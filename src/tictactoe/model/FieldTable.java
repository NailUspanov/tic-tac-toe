package tictactoe.model;

import tictactoe.component.CellNumberConverter;

public class FieldTable {
    private final CellNumberConverter cellNumberConverter;
    private final char[][] table = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public FieldTable(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public boolean isEmpty(Cell cell) {
        return table[cell.getRow()][cell.getCol()] == ' ';
    }

    public boolean isEmpty(int row, int col) {
        return isEmpty(new Cell(row, col));
    }

    public boolean isEmpty(int num) {
        return isEmpty(cellNumberConverter.toCell(num));
    }

    public void computerMove(Cell cell) {
        table[cell.getRow()][cell.getCol()] = 'O';
    }

    public void computerMove(int row, int col) {
        computerMove(new Cell(row, col));
    }

    public void userMove(Cell cell) {
        table[cell.getRow()][cell.getCol()] = 'X';
    }

    public void userMove(int num) {
        userMove(cellNumberConverter.toCell(num));
    }

    public char getCell(int row, int col) {
        return table[row][col];
    }
}
