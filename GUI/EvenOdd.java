import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EvenOdd{
    public static void main(String[] args){
        JFrame f = new JFrame("Even Odd");

        JLabel input = new JLabel("Enter numbers seperated by space: ");
        JLabel oddList = new JLabel("Odd Numbers: ");
        JLabel evenList = new JLabel("Even Numbers: ");
        JTextField inputField = new JTextField(20);
        JTextField odd = new JTextField(20);
        JTextField even = new JTextField(20);
        JButton submit = new JButton("Submit");

        f.setLayout(new GridLayout(4,2));
        f.add(input);
        f.add(inputField);
        f.add(oddList);
        f.add(odd);
        f.add(evenList);
        f.add(even);
        f.add(submit);

        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nums_str = inputField.getText();
                String[] nums_arr = nums_str.split(" ");
                int[] arr = new int[nums_arr.length];
                for(int i=0;i<nums_arr.length;i++){
                    arr[i] = Integer.parseInt(nums_arr[i]);
                }
                int odd_count = 0, even_count = 0;
                even_count = countEven(arr);
                odd_count = arr.length - even_count;

                odd.setText(String.valueOf(odd_count));
                even.setText(String.valueOf(even_count));
            }
        });


        f.setVisible(true);
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static int countEven(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                count += 1;
            }
        }
        return count;
    }
}