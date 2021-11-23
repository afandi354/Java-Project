package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
 
// Deklarasi kelas
public class DemoFlowLayout extends JFrame {
 
   public DemoFlowLayout() {
 
      // Membuat obyek layout manager
      FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT, 10, 10);
       
      // Memperoleh kontent pane dari frame
      Container container = getContentPane();
 
      // Mengatur layout manager dari content pane
      container.setLayout(flowLayout);
 
      // Menambahkan lima button ke content pane
      container.add(new JButton("Tombol 1"));
      container.add(new JButton("Tombol 2"));
      container.add(new JButton("Tombol 3"));
      container.add(new JButton("Tombol 4"));
      container.add(new JButton("Tombol 5"));
   }
 
   public static void main(String[] args) {
      DemoFlowLayout jendela = new DemoFlowLayout();
      jendela.setTitle("Kelas DemoFlowLayout");
      jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jendela.setSize(500, 300);
      jendela.setVisible(true);
   }
}