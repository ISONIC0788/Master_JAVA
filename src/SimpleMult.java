import javax.swing.*;

public class SimpleMult {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frist Java App");
        frame.setSize(450,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Solve Problem then write code ",SwingConstants.CENTER)
;
        frame.add(label);
        frame.setVisible(true);
    }
}

