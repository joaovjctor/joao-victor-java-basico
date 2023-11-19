import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Corrida extends JFrame implements Runnable {

    private int posRato [] = { 10, 10, 10, 10 };
    private JButton bt = new JButton("Correr");
    private Thread th;

    public Corrida() {
        super("Corrida");
        this.setSize(500,500);
        //this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pn = new JPanel();
        pn.add(bt);
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                correr();
            }
        });
        this.add(pn, BorderLayout.SOUTH);
        this.setVisible(true);
        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("~(1):-",posRato[0],100);
        g.drawString("~(2):-",posRato[1],150);
        g.drawString("~(3):-",posRato[2],200);
        g.drawString("~(4):-",posRato[3],250);
    }

    public static void main(String [] args) {
        new Corrida();
    }

    public void correr() {
        posRato = new int[]{ 10, 10, 10, 10 };
        th = new Thread(this);
        th.start();
    }

    public void run() {
        while (
            posRato[0] < 470 && posRato[1] < 470 && 
            posRato[2] < 470 && posRato[3] < 470
        ) {
            posRato[(int)(Math.random()*4)]+=3;
            repaint();
            try {
                th.sleep(3);
            } catch (InterruptedException e) {
            }
        }
        int rato = 4;
        if (posRato[0] >= 470) {
            rato = 1;
        } else if (posRato[1] >= 470) {
            rato = 2;
        } else if (posRato[2] >= 470) {
            rato = 3;
        }
        JOptionPane.showMessageDialog(this, "O rato vencedor foi " + rato);
    }

}