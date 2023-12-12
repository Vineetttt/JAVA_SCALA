import java.awt.*;
import javax.swing.*;

//Write a program with 4 swing buttons with suitable texts on them. When the user
//presses a button, a message should appear in the label as to which button was pressed
//by the user

class PressButton{
    public static void main(String[] args){
        JFrame f = new JFrame("Play with Buttons");

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");

        JLabel l1 = new JLabel("");

        b1.addActionListener(e -> l1.setText("Button 1 pressed"));
        b2.addActionListener(e -> l1.setText("Button 2 pressed"));
        b3.addActionListener(e -> l1.setText("Button 3 pressed"));
        b4.addActionListener(e -> l1.setText("Button 4 pressed"));

        JPanel panel = new JPanel();
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(l1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.getContentPane().add(panel); 
        f.setVisible(true);
        f.setSize(200, 200);
    }
}