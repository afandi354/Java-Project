package GUI;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutBeraksi extends JFrame {
    JButton kukuh = new JButton("Kukuh");
    JButton andit = new JButton("Andit");
    JButton anggar = new JButton("Anggarjito");
    JButton dian = new JButton("Diannisa");
    JButton fahri = new JButton("Fahri");
    JButton ganang = new JButton("Ganang");
    JButton yolanda = new JButton("Yolanda");
    JButton anjas = new JButton("Anjas");
    JButton rizky = new JButton("Rizky");

public GridLayoutBeraksi() {
    super(" Grid Layout Beraksi ");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pane = new JPanel();
    GridLayout family = new GridLayout(3, 3, 5, 5);

    pane.setLayout(family);
    pane.add(kukuh); pane.add(andit);
    pane.add(anggar); pane.add(dian);
    pane.add(fahri); pane.add(ganang);
    pane.add(yolanda); pane.add(anjas);
    pane.add(rizky);

    add(pane);
    setVisible(true);
}

public static void main(String[] args) {
    GridLayoutBeraksi frame = new  GridLayoutBeraksi();
    }
}
