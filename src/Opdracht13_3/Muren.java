package Opdracht13_3;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Muren extends Applet {
    Button knopBaksteen;
    Button knopBeton;
    boolean baksteen;
    boolean beton;

    public void init() {
        //Baksteen
        knopBaksteen = new Button("Muur van bakstenen");
        BaksteenListener bkl = new BaksteenListener();
        knopBaksteen.addActionListener(bkl);
        add(knopBaksteen);

        //Beton
        knopBeton = new Button("Muur van betonblokken");
        BetonListener btl = new BetonListener();
        knopBeton.addActionListener(btl);
        add(knopBeton);
    }

    public void paint(Graphics g) {
        tekenBaksteenMuur(g);
        tekenBetonMuur(g);

    }

    class BaksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            baksteen = true;
            beton = false;
            repaint();
        }
    }

    class BetonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            beton = true;
            baksteen = false;
            repaint();
        }
    }

    private void tekenBaksteenMuur(Graphics g) {
        if (baksteen) {
            //Eerste rij
            int x = 20;
            int y = 60;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.red);
                g.drawRect(x, y, 60, 20);
                x += 60;
            }
            //Tweede rij
            int x1 = 50;
            int y1 = 80;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.red);
                g.drawRect(x1, y1, 60, 20);
                x1 += 60;
            }
            //Derde rij
            int x2 = 20;
            int y2 = 100;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.red);
                g.drawRect(x2, y2, 60, 20);
                x2 += 60;
            }
            //Vierde rij
            int x3 = 50;
            int y3 = 120;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.red);
                g.drawRect(x3, y3, 60, 20);
                x3 += 60;
            }
            //Vijfde rij
            int x4 = 20;
            int y4 = 140;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.red);
                g.drawRect(x4, y4, 60, 20);
                x4 += 60;
            }
        }
    }

    private void tekenBetonMuur(Graphics g) {
        if (beton) {
            //Eerste rij
            int x = 20;
            int y = 60;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.lightGray);
                g.fillRect(x, y, 60, 20);
                g.setColor(Color.darkGray);
                g.drawRect(x, y, 60, 20);
                x += 60;
            }
            //Tweede rij
            int x1 = 50;
            int y1 = 80;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.lightGray);
                g.fillRect(x1, y1, 60, 20);
                g.setColor(Color.darkGray);
                g.drawRect(x1, y1, 60, 20);
                x1 += 60;
            }
            //Derde rij
            int x2 = 20;
            int y2 = 100;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.lightGray);
                g.fillRect(x2, y2, 60, 20);
                g.setColor(Color.darkGray);
                g.drawRect(x2, y2, 60, 20);
                x2 += 60;
            }
            //Vierde rij
            int x3 = 50;
            int y3 = 120;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.lightGray);
                g.fillRect(x3, y3, 60, 20);
                g.setColor(Color.darkGray);
                g.drawRect(x3, y3, 60, 20);
                x3 += 60;
            }
            //Vijfde rij
            int x4 = 20;
            int y4 = 140;
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.lightGray);
                g.fillRect(x4, y4, 60, 20);
                g.setColor(Color.darkGray);
                g.drawRect(x4, y4, 60, 20);
                x4 += 60;
            }
        }
    }
}
