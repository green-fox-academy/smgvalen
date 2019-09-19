import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int step = 20;
        int x = 0;
        int y = 0;
        int x2 = 320;
        int y2 = 320;
        for (int i = 0; i < WIDTH/step; i++) {
            drawLine(graphics, x , y );
            x = x +step;
        }
        for (int i = 0; i < WIDTH /step; i++) {
            drawLine(graphics, x, y );
            y = y + step;
        }
        for (int i = WIDTH / step; i > 0; i--) {
            drawLine(graphics, x2, y2);
            x2 = x2 - step;
        }
        for (int i = WIDTH / step; i > 0; i--) {
            drawLine(graphics, x2, y2);
            y2 = y2 -step;

        }
    }

    public static void drawLine(Graphics g, int x, int y) {
        g.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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