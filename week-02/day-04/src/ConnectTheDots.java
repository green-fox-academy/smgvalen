import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void create2Parameters (int [][] arr, Graphics g){

        g.setColor(Color.green);
        for (int i = 0; i < arr.length -1; i++) {
            //               x1           y1           x2             y2
            g.drawLine(arr[i][0], arr[i][1], arr[i+1][0], arr[i+1][1]);
        }
        g.drawLine(arr[0][0], arr[0][1], arr[arr.length-1][0], arr[arr.length-1][1]);


    }
    public static void mainDraw(Graphics graphics) {
                        //x -- y
        int [][] box1 = {{10, 10}, // x1
                        {290,  10},
                        {290, 290},
                        {10, 290}};
        int [][] box2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                 {120, 100}, {85, 130}, {50, 100}};

        create2Parameters(box1, graphics);
        create2Parameters(box2, graphics);

        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}



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
 /*
*/
