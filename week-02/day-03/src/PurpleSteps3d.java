import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]
        int numberOfSquares = 10;
        int sizeOfSquares = 10;

        for (int i = 1; i < numberOfSquares; i++) {

                drawPurpleSquares(graphics, sizeOfSquares , sizeOfSquares , sizeOfSquares);
                sizeOfSquares = sizeOfSquares*2;

        }
    }

    public static void drawPurpleSquares(Graphics g, int x, int y, int size) {
        Color purple = new Color(160, 32, 240);
        g.setColor(purple);
        g.fillRect(x, y, size, size);
        g.setColor(Color.black);
        g.drawRect(x, y, size, size);


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