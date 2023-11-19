
import javax.swing.*;
import java.awt.*;

public class Xadrez extends JFrame {
    public Xadrez() {
        super("Xadrez");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        boolean chv = false;
        for (int lin = 0; lin < 8; lin+=1) {
            for (int col = 0; col < 8; col+=1) {
                g.setColor((chv = !chv)?Color.BLACK:Color.WHITE);
                g.fillRect((col * 50) + 10, (lin * 50) + 10, 50, 50);
            }
            chv = !chv;
        }
    }
    public static void main(String [] args) {
        new Xadrez();
    }
}