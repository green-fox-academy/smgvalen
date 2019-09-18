import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        Random r = new Random();
        ArrayList <Color> colors = new ArrayList<>(Arrays.asList(Color.red, Color.orange, Color.green, Color.blue, Color.magenta, Color.cyan));
        ArrayList<Integer> squareSize = new ArrayList<>(Arrays.asList( 170, 240, 360, 490, 550, 600));
        for (int i = colors.size()-1; i >= 0 ; i--) {
            drawSquare(squareSize.get(i), colors.get(i), graphics);


        }
    }
    public static void drawSquare(int size, Color color, Graphics g){
        int x = WIDTH/2-size/4;
        int y = HEIGHT/2-size/4;
        g.setColor(color);
        g.fillRect(x, y, size/2, size/2);




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