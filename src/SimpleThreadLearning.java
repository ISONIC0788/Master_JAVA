import  javax.swing.JFrame;

public class SimpleThreadLearning {
    static void app (){
        JFrame frame = new JFrame();
        frame.setTitle("Title goas here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Thread.currentThread().setName("EbediMeleck");
        System.out.println(Thread.currentThread().getName());
     app();

    }
}
