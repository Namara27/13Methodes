package Opdracht13_1;

import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {
    private int x1, x2, x3, y1, y2;

    public void init() {
        x1 = 50;
        y1 = 200;
        x2 = 100;
        y2 = 110;
        x3 = 150;
    }

    public void paint(Graphics g) {
        tekenDriehoek(g, x1, y1, x2, y2, x3);
    }

    private void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y1);
        g.drawLine(x1, y1, x3, y1);
    }
}
