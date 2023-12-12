import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Adder{
    public static void main(String[] args){
        JFrame f = new JFrame("Adder");

        JLabel num1 = new JLabel("Number 1: ");
        JLabel num2 = new JLabel("Number 2: ");
        JLabel result = new JLabel("Result: ");

        JTextField num1Field = new JTextField(20);
        JTextField num2Field = new JTextField(20);
        JTextField resultField = new JTextField(20);

        JButton add = new JButton("Add");
        JButton reset = new JButton("Reset");

        f.setLayout(new GridLayout(4,2));
        f.add(num1);
        f.add(num1Field);
        f.add(num2);
        f.add(num2Field);
        f.add(result);
        f.add(resultField);
        f.add(add);
        f.add(reset);

        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String num1 = num1Field.getText();
                String num2 = num2Field.getText();

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);

                int res = n1 + n2;

                resultField.setText(String.valueOf(res));
            }
        });
        reset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                num1Field.setText("");
                num2Field.setText("");
                resultField.setText("");
            }
        });

        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}