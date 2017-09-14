import javax.swing.*;

public class JFrame1 {



    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame aFrame= new JFrame("First Frame");
        aFrame.setSize(500,500);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

