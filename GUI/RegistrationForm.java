import javax.swing.*;
import java.awt.*;

class RegistrationForm{
    public static void main(String args[]){
        JFrame f = new JFrame("Registration Form");
        
        JLabel name = new JLabel("Name:");
        JLabel roll = new JLabel("Roll No:");
        JLabel email = new JLabel("Email:");

        JTextField nameField = new JTextField(20);
        JTextField rollField = new JTextField(20);
        JTextField emailField = new JTextField(30);

        JButton submit = new JButton("Submit");

        f.setLayout(new GridLayout(4,2));
        f.add(name);
        f.add(nameField);
        f.add(roll);    
        f.add(rollField);
        f.add(email);
        f.add(emailField);
        f.add(submit);

        submit.addActionListener(e -> {
            String nameT = nameField.getText();
            String rollT = rollField.getText();
            String emailT = emailField.getText();
            JOptionPane.showMessageDialog(f,"Registration Successful\n"+ "Name: " + nameT + "\nRoll No: " + rollT + "\nEmail: " + emailT);
        });
        
        
        f.setVisible(true);
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}