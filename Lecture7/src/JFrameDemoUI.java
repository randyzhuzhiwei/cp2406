import javax.swing.*;
import java.awt.*;

public class JFrameDemoUI {

    public static void main(String[] args){

        final int height=500;
        final int width=500;

        Font headlineFont = new Font("Ariel",Font.BOLD,36);


        JFrame newFrame= new JFrame("Frame");
        newFrame.setSize(height,width);
        newFrame.setLayout(new FlowLayout());
        newFrame.setVisible(true);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel greeting = new JLabel("Good Day");
        greeting.setFont(headlineFont);
        newFrame.add(greeting);


        JTextField tf = new JTextField("Enter your name");
        tf.setEditable(true);
        newFrame.add(tf);

        JButton btn = new JButton("PAY");
        btn.setToolTipText("PAY Everything");
        newFrame.add(btn);


        // MovieApp app1 = new MovieApp();



    }
}

