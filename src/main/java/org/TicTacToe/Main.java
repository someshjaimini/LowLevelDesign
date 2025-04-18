package org.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // limit of players 3
        int limit = 3;
        Board b = new Board(3);
        // Nothing just a comment
        System.out.println("Please enter number of players: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        while(num>limit)
        {
            System.out.println("please enter players within the limit that is "+ limit +": ");
            num = sc.nextInt();
        }

        Game game = new Game(b,num);
        game.start();
        sc.close();
    }
}