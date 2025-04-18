package org.TicTacToe;

import java.util.*;

public class Game {
    private final Board board;
    private final int numPlayers;
    private final Queue<Player> players = new LinkedList<>();

    public Game(Board b,int numPlayers)
    {
        this.board = b;
        this.numPlayers = numPlayers;
    }

    public void start()
    {
        Symbols[] s = Symbols.values();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<this.numPlayers; i++)
        {
            int k = i+1;
            System.out.println("Please enter Player "+k+" name:");
            String name = sc.nextLine();
            Player p = new Player(name,s[i]);
            players.add(p);
        }

        boolean winner  = false;
        boolean tie = true;
        board.print();
        //instead of while loop //
        for(int run = 0;run<board.getSize()*board.getSize();run++)
        {
            Player currPlayer = players.poll();
            System.out.println("It's "+currPlayer.getName()+" turn. Please enter an row and col");
            int row = sc.nextInt();
            int col = sc.nextInt();
            while(row<0||row>=board.getSize()||col<0||col>=board.getSize()||!board.empty(row,col))
            {
                System.out.println("Please choose a valid position: ");
                row = sc.nextInt();
                col = sc.nextInt();
            }
            winner = board.update(row,col,currPlayer.getSign());
            board.print();
            if(winner)
            {
                tie = false;
                System.out.println(currPlayer.getName()+" won the Game!!!");
                break;
            }
            players.add(currPlayer);
        }
        if(tie)
        {
            System.out.println("It's a tie!");
        }
        sc.close();
    }
}
