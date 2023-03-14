package Homework;

import java.awt.*;

public class Pechka {
    enum color {
        white,
        black,
    }

    private Color color;
    private int row;

    private int column;

    public void Pawn(Color color, int row, int column) {
        this.color = color;


    }
    public int getRow(){
        return row;
    }

    public int getColumn() {
        return column;
    }
    public void setCoordinates (int row, int column){

    }
    private void chekCoordinates(int row, int column){
        if (row < 1 || row > 8) {
            System.out.println("не корреткный номер сторки" + row);
            throw new IllegalArgumentException();
        }
        this.row = row;

        if (column < 1 || column > 8) {
            System.out.println("не корреткный номер столбца" + column);
            throw new IllegalArgumentException();
        }
        this.column = column;

    }

}


