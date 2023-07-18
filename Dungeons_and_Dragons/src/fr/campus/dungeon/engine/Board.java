package fr.campus.dungeon.engine;


import java.util.Arrays;

public class Board {
    private int[] boardCells;

    public Board() {
        this.boardCells = new int[64];

        for (int i = 0; i < boardCells.length; i++) {
            this.boardCells[i] = i;
        }

        System.out.println(boardCells);
    }

    public int[] getBoardCells() {
        return boardCells;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardCells=" + Arrays.toString(boardCells) +
                '}';
    }
}
