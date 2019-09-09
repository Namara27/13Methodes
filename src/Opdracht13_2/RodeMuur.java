package Opdracht13_2;

import java.awt.*;
import java.applet.*;

public class RodeMuur extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        tekenMuur(g);
    }

    private void tekenMuur(Graphics g) {
        //Eerste rij
        int x = 20;
        int y = 20;
        for (int i = 0; i < 5; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, 60, 20);
            x += 60;
        }
        //Tweede rij
        int x1 = 50;
        int y1 = 40;
        for (int i = 0; i < 5; i++) {
            g.setColor(Color.red);
            g.drawRect(x1, y1, 60, 20);
            x1 += 60;
        }
        //Derde rij
        int x2 = 20;
        int y2 = 60;
        for (int i = 0; i < 5; i++) {
            g.setColor(Color.red);
            g.drawRect(x2, y2, 60, 20);
            x2 += 60;
        }
        //Vierde rij
        int x3 = 50;
        int y3 = 80;
        for (int i = 0; i < 5; i++) {
            g.setColor(Color.red);
            g.drawRect(x3, y3, 60, 20);
            x3 += 60;
        }
        //Vijfde rij
        int x4 = 20;
        int y4 = 100;
        for (int i = 0; i < 5; i++) {
            g.setColor(Color.red);
            g.drawRect(x4, y4, 60, 20);
            x4 += 60;
        }
    }
}
