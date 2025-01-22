import javax.swing.*;
import java.awt.*;

public class SimpleMult {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MY POSITIVE QUATO");
        frame.setSize(450,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("MY Positive Quato",SwingConstants.CENTER);

        JLabel label1 = new JLabel("\"Solve Problem then write code \"",SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD,25));

        label1.setFont(new Font("Roman" ,Font.ITALIC,20));
        JLabel label2= new JLabel("\"Talk is cheap.show me code \"",SwingConstants.CENTER);
        label2.setFont(new Font("Roman",Font.ITALIC, 20));

        JLabel label4 = new JLabel("\"Best way to predict futur is to invet\" ",SwingConstants.CENTER);

        frame.setLayout(null);
        frame.add(label4);
        frame.add(label2);
        frame.add(label1);
        frame.add(label);
        //bounds
        label4.setBounds(50 ,85,300,30);
        label.setBounds(50,25,300,30);
        label2.setBounds(50,80,300 , 20);
        label1.setBounds(50 , 50,300 ,30);
        frame.setVisible(true);
    }
}

