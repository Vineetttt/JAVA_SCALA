import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Counter{
    public static void main(String[] args){
        JFrame f = new JFrame("Counter");

        JLabel count = new JLabel("Count: ");
        JTextField countField = new JTextField(20);
        JButton inc = new JButton("Increment");
        JButton dec = new JButton("Decrement");

        f.setLayout(new GridLayout(4,2));
        f.add(count);
        f.add(countField);
        f.add(inc); 
        f.add(dec);

        inc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String current = countField.getText();
                int num = Integer.parseInt(current);

                num += 1;
                countField.setText(String.valueOf(num));
            }
        });
        dec.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String current = countField.getText();
                if(current == " "){
                    current = "0";
                }
                int num = Integer.parseInt(current);

                num -= 1;
                countField.setText(String.valueOf(num));
            }
        });

        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}