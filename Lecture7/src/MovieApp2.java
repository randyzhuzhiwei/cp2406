import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieApp2 extends JFrame implements ActionListener{


        final int height=1000;
        final int width=1000;

        //UI Components
    JLabel greeting;
    JTextField tf;
    JButton btn;

    public MovieApp2()
        {
            super("Moive App");

            Font headlineFont = new Font("Ariel",Font.BOLD,36);
            setSize(height,width);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            setLayout(new FlowLayout());
         greeting = new JLabel("Good Day");
        greeting.setFont(headlineFont);
        add(greeting);



             tf = new JTextField("Enter your name");
            tf.setEditable(true);
            add(tf);

            btn = new JButton("PAY");
            btn.setToolTipText("PAY Everything");
            add(btn);


            btn.addActionListener(this);

        }
        public void actionPerformed(ActionEvent e)
        {

            String text = tf.getText();
            greeting.setText(text);
        }
}

