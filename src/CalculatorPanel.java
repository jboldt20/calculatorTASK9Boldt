import java.awt.*;
import javax.swing.*;

public class CalculatorPanel extends JPanel {

    public CalculatorPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);

        JPanel bar = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel calc = new JLabel("0");
        bar.add(calc);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 5));
        JButton ba = new JButton("<-");
        JButton bx = new JButton("CE");
        JButton bq = new JButton("C");
        JButton bpm = new JButton("+-");
        JButton bl = new JButton("-|");
        JButton b7 = new JButton ("7");
        JButton b8 = new JButton ("8");
        JButton b9 = new JButton ("9");
        JButton bi = new JButton ("/");
        JButton br = new JButton ("%");
        JButton b4 = new JButton ("4");
        JButton b5 = new JButton ("5");
        JButton b6 = new JButton ("6");
        JButton bs = new JButton ("*");
        JButton bt = new JButton ("1/x");
        JButton b1 = new JButton ("1");
        JButton b2 = new JButton ("2");
        JButton b3 = new JButton ("3");
        JButton bm = new JButton ("-");
        JButton by = new JButton ("=");
        JButton b0 = new JButton ("0");
        JButton bd = new JButton (".");
        JButton bc = new JButton ("C");
        JButton bp = new JButton ("+");

        buttonPanel.add(ba);
        buttonPanel.add(bx);
        buttonPanel.add(bq);
        buttonPanel.add(bpm);
        buttonPanel.add(bl);
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(bi);
        buttonPanel.add(br);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(bs);
        buttonPanel.add(bt);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(bm);
        buttonPanel.add(by);
        buttonPanel.add(b0);
        buttonPanel.add(bd);
        buttonPanel.add(bc);
        buttonPanel.add(bp);

        add(bar, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new CalculatorPanel());
        f.pack();
        f.setVisible(true);
    }
}