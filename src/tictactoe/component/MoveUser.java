package tictactoe.component;

import tictactoe.model.FieldTable;

import java.util.Scanner;

public class MoveUser {
    public void move(FieldTable table) {
        System.out.println("Please type number between 1 and 9:");
        String n = new Scanner(System.in).nextLine();
        while (n.length() != 1 || n.charAt(0) > '9' || n.charAt(0) < '1' || !table.isEmpty(Integer.parseInt(n))) {
            System.out.println("Please, try again");
            n = new Scanner(System.in).nextLine();
        }
        table.userMove(Integer.parseInt(n));
    }
}