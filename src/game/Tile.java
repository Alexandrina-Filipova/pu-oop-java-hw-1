package game;

import java.awt.*;

/**
 * Квадрати в играта
 */
public class Tile {

    private int row;
    private int col;
    private int tileSize;

    public Tile(int row, int col) {

        this.row        = row;
        this.col        = col;
        this.tileSize   = 100;
    }

    /**
     * Подредба на квадратите по цветове на бойното поле
     * @param g Графика
     */
    public void render(Graphics g) {

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        if ((row == 0 && (col == 0 || col == 4)) || (row == 4 && (col == 1 || col == 3))) {
            g.setColor(Color.RED);
        }else if ((row == 0 && (col == 1 || col == 3)) || (row == 4 && (col == 0 || col ==4))) {
            g.setColor(Color.DARK_GRAY);
        }else if ((row == 1 && (col == 0 || col == 1 || col == 3 || col == 4)) || (row == 3 && (col == 0 || col == 1|| col == 3 || col == 4))) {
            g.setColor(Color.LIGHT_GRAY);
        }else {
            g.setColor(Color.WHITE);
        }

        g.drawRect(row,col,100,100);
        g.fillRect(tileX,tileY,this.tileSize-1, this.tileSize-1);
    }
}