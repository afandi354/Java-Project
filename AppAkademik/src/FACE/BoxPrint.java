package FACE;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;

class BoxPrint extends javax.swing.JDialog{
    JDialog fm = null;
    JFrame f = null;
    public BoxPrint(JDialog frame, boolean b, Component c){
        super(frame,b);
        this.fm = frame;
        this.getContentPane().add(c);
    }

    public BoxPrint(JFrame frame, boolean b, Component c){
        super(frame,b);
        this.f = frame;
        this.getContentPane().add(c);
    }

    public void addTitle(String title){
        this.setTitle(title);
    }

    public void tampilkan(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(0, 0, screenSize.width-(screenSize.width/8), screenSize.height-(screenSize.height/3));
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }
}