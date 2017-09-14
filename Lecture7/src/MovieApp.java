import javax.swing.*;
import java.awt.*;

public class MovieApp  extends JFrame{


        final int height=1000;
        final int width=1000;

        public MovieApp()
        {
            super("Moive App");

            Font headlineFont = new Font("Ariel",Font.BOLD,36);
            setSize(height,width);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Good Day");
        greeting.setFont(headlineFont);
        add(greeting);


    }
}

