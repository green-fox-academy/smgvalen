import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random r = new Random();
        r.nextInt();
        for (int i = 0; i < 4; i++) {

            graphics.setColor(new Color(getRandomNumbers(0, 255), getRandomNumbers(0, 255), getRandomNumbers(0, 255)));
            int s = r.nextInt(100);
            int s1 = r.nextInt(100);
            int s2 = r.nextInt(100);
            int s3 = r.nextInt(100);
            graphics.fillRect(s, s1 ,  s2,  s3);

        }
    }

    private static int getRandomNumbers (int min, int max) {
        return (int) ((Math.random() * ((max - min) +  1)) + min);
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