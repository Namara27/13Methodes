package Praktijkopdracht1;

import java.awt.*;
import java.applet.*;

public class Boom extends Applet {
    Color brown = new Color(102, 51, 0);
    Color darkGreen = new Color(0, 102, 0);

    public void init() {}

    public void paint(Graphics g) {
        tekenBoom(g);
    }

    void tekenBoom(Graphics g) {
        //Eerste rij
        int x = 120;
        int x1 = 80;
        for (int i = 0; i < 5; i++) {
            g.setColor(brown);
            g.fillRect(x, 120, 20, 80);
            g.setColor(darkGreen);
            g.fillOval(x1, 60, 100, 80);
            x += 120;
            x1 += 120;
        }
        //Tweede rij
        int x2 = 120;
        int x3 = 80;
        for (int i = 0; i < 5; i++) {
            g.setColor(brown);
            g.fillRect(x2, 260, 20, 80);
            g.setColor(darkGreen);
            g.fillOval(x3, 200, 100, 80);
            x2 += 120;
            x3 += 120;
        }
    }
}
