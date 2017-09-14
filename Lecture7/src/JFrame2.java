import javax.swing.*;
import java.awt.*;

public class JFrame2 {

    public static void main(String[] args){

        final int height=500;
        final int width=500;

        Font headlineFont = new Font("Ariel",Font.BOLD,36);


         JFrame newFrame= new JFrame("Frame");
        newFrame.setSize(height,width);
        newFrame.setVisible(true);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel greeting = new JLabel("Good Day");
        greeting.setFont(headlineFont);
        newFrame.add(greeting);


       // MovieApp app1 = new MovieApp();
//        MovieApp2 app1 = new MovieApp2();



    }
}

