import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator{
    public static void main(String[] args){
        JFrame f = new JFrame("Calculator");

        JLabel num1 = new JLabel("Number 1: ");
        JLabel num2 = new JLabel("Number 2: ");
        JLabel result = new JLabel("Result: ");
        
        JTextField num1Field = new JTextField(20);
        JTextField num2Field = new JTextField(20);
        JTextField resultField = new JTextField(20);

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton mod = new JButton("%");
        JButton reset = new JButton("Reset");

        f.setLayout(new GridLayout(7,2));
        f.add(num1);
        f.add(num1Field);
        f.add(num2);
        f.add(num2Field);
        f.add(result);
        f.add(resultField);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(mod);
        f.add(reset);

        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String n1 = num1Field.getText();
                String n2 = num2Field.getText();

                int no1 = Integer.parseInt(n1);
                int no2 = Integer.parseInt(n2);

                int res = no1 + no2;
                resultField.setText(String.valueOf(res));
            }
        });


        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}