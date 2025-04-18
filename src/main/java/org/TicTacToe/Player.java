package org.TicTacToe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private Symbols sign;

    Player(String name, Symbols sign)
    {
        this.name = name;
        this.sign = sign;
    }
}
