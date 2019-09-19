import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int x = 0;  // x and y used to set the frame of the board
        int y = 0;
        int size = WIDTH / 8;  // size is 8 times smaller than the board. every line contains 8 squares

        for (int i = 0; i < WIDTH / size; i++) {
            for (int j = 0; j < WIDTH / size; j++) {

                if (i % 2 == 0 && j % 2 == 0) {         // draw a black square if i and j are even, squares made in odd col
                    drawSq(graphics, size * i, size * j, size);
                }
                if (i % 2 != 0 && j % 2 != 0) {  // draw a black square if i and j are odd in even cols by cols
                    drawSq(graphics, size * i, size * j, size);
                }
            }
        }

        graphics.drawRect(x, y, WIDTH, HEIGHT);


    }


    public static void drawSq(Graphics g, int x, int y, int size) {
        g.setColor(Color.black);
        g.fillRect(x, y, size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}