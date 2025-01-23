import javax.swing.*;
import java.awt.*;

public class SimpleMult {
    public static void main(String[] args) {
        JFrame frame = new JFrame("App Quote");

        frame.setSize(450,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("MY Positive Quote",SwingConstants.CENTER);
        label.setBackground(Color.CYAN);
        label.setOpaque(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.add(label);

        JLabel label1 = new JLabel("\"Solve Problem then write code \"",SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD,25));

        label1.setFont(new Font("Roman" ,Font.ITALIC,20));
        JLabel label2= new JLabel("\"Talk is cheap.show me code \"",SwingConstants.CENTER);
        label2.setFont(new Font("Roman",Font.ITALIC, 20));

        JLabel label4 = new JLabel("\"Best way to predict the future  is to invent\" ",SwingConstants.CENTER);
        label4.setFont(new Font("Roman",Font.ITALIC, 20));
        frame.setLayout(null);
        frame.add(label4);
        frame.add(label2);
        frame.add(label1);
        frame.add(label);
        frame.add(panel);
        //bounds
        label4.setBounds(30 ,95,400,30);
        label.setBounds(50,25,300,30);
        label2.setBounds(50,80,300 , 20);
        label1.setBounds(50 , 50,300 ,30);
        frame.setVisible(true);
    }
}

