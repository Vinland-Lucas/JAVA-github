package fr.campus.dungeon.plateau;

import java.util.ArrayList;


public class Board implements Case {
    private ArrayList<Case> boardCells;

    public Board() {
        display();

//        for (int i = 0; i < boardCells.size(); i++) {
//            this.boardCells.get(i) = i;
//        }

        System.out.println(boardCells);
    }

    @Override
    public void display() {
        this.boardCells = new ArrayList<Case>();
        boardCells.add(new EmptyCase());
        boardCells.add(new Enemy());
        boardCells.add(new Item());
        boardCells.add(new Potion());
    }

    public ArrayList<Case> getBoardCells() {
        return boardCells;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardCells=" + boardCells +
                '}';
    }
}
