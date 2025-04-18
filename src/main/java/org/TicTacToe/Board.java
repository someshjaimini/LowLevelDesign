package org.TicTacToe;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Board {
    private int size;
    private List<List<Symbols>> grid;
    public Board(int n)
    {
        this.size = n;
        this.grid = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Symbols> row = new ArrayList<>(n);
            for(int j=0;j<size;j++)
            {
                row.add(null);
            }
            grid.add(row);
        }
//        this.print();
    }

    public Boolean empty(int row,int col)
    {
        if(grid.get(row).get(col)==null)
        {
            return true;
        }
        return false;
    }

    public Boolean update(int x, int y,Symbols s)
    {
        this.grid.get(x).set(y,s);
        boolean flag = true;
        for(int i=0;i<size;i++)
        {
            if(grid.get(i).get(y)!=s)
            {
                flag = false;
                break;
            }
        }
        if(flag)return true;
        flag = true;
        for(int i=0;i<size;i++)
        {
            if(grid.get(x).get(i)!=s)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void print()
    {
        for(int i=0;i<size;i++)
        {
            List<Symbols> ls = grid.get(i);
            for(int j=0;j<size;j++)
            {
                System.out.print("[ ");
                if(ls.get(j)!=null)
                {
                    System.out.print(ls.get(j));
                }
                else {
                    System.out.print(" ");
                }
                System.out.print(" ]");
            }
            System.out.println();
        }
    }
}
