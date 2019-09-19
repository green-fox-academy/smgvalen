import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        blackSky(graphics);
    int stars = (int)(Math.random()*60);
    Random random = new Random();
        for (int i = 0; i < stars; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int w = random.nextInt(5);
            int h = random.nextInt(5);

            greyStars(graphics);
            graphics.fillRect(x, y, w, h);

        }

    }
    public static void blackSky (Graphics sky){
        sky.setColor(Color.black);
        sky.fillRect(0,0, WIDTH, HEIGHT);
    }
    public static void greyStars (Graphics stars){
        Random Color = new Random();
        int g = Color.nextInt(256);
        stars.setColor(new Color(g, g, g));
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