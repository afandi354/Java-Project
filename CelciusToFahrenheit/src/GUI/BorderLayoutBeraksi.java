package GUI;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutBeraksi extends JFrame {
    JButton nButton = new JButton("North");
    JButton sButton = new JButton("South");
    JButton eButton = new JButton("East");
    JButton wButton = new JButton("West");
    JButton cButton = new JButton("Center");
        
public BorderLayoutBeraksi() {
    super("Border Layout Beraksi"); setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    add(nButton, BorderLayout.NORTH);
    add(sButton, BorderLayout.SOUTH);
    add(eButton, BorderLayout.EAST);
    add(wButton, BorderLayout.WEST);
    add(cButton, BorderLayout.CENTER); 
}
public static void main(String[] args) {
   BorderLayoutBeraksi frame = new
	BorderLayoutBeraksi();
 	frame.setVisible(true);
      }
}
