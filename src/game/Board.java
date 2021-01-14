package game;

import javax.swing.*;
import java.awt.*;

/**
 * Дъска за бойното поле
 * (Размери,Фон)
 */
public class Board extends JFrame{

    public Board(){

        this.setSize(500, 505);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
    }


    /**
     * Цвят на бойното поле
     * @param g Графика
     */
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 5; col++) {

                Tile tile = new Tile(row, col);
                tile.render(g);

            }
        }

        /**
         * Рисуване на централния кръг
         */
        g.drawOval(225,225,50,50);
        g.setColor(Color.GRAY);
        g.fillOval(225,225,50,50);
    }

}

