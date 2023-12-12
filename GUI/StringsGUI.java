import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StringsGUI {
    public static void main(String args[]) {
        JFrame f = new JFrame("String Operation");

        JLabel input = new JLabel("Input:");
        JLabel searchStr = new JLabel("Search String:");
        JLabel num_occurrence = new JLabel("Number of Occurrences:");
        JLabel replaceStr = new JLabel("Replace String:");
        JLabel result = new JLabel("Result:");

        JTextField inputField = new JTextField(20);
        JTextField searchStrField = new JTextField(20);
        JTextField num_occurrenceField = new JTextField(20);
        JTextField replaceStrField = new JTextField(20);
        JTextField resultField = new JTextField(20);

        JButton search = new JButton("Search");
        JButton replace = new JButton("Replace");

        f.setLayout(new GridLayout(7, 2));
        f.add(input);
        f.add(inputField);
        f.add(searchStr);
        f.add(searchStrField);
        f.add(num_occurrence);
        f.add(num_occurrenceField);
        f.add(replaceStr);
        f.add(replaceStrField);
        f.add(result);
        f.add(resultField);
        f.add(new JLabel());
        f.add(new JLabel());
        f.add(search);
        f.add(replace);

        f.setVisible(true);
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StringsGUI gui = new StringsGUI(); // Create an instance of the StringsGUI class

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = inputField.getText();
                String toSearch = searchStrField.getText();
                int count = gui.countOccurrences(query, toSearch);
                num_occurrenceField.setText(String.valueOf(count));
            }
        });

        replace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = inputField.getText();
                String toSearch = searchStrField.getText();
                String replace = replaceStrField.getText();
                String replaced = gui.replaceOccurrences(query, toSearch, replace);
                resultField.setText(replaced);
            }
        });
    }

    public int countOccurrences(String str, String search) {
        int count = 0;
        int index = str.indexOf(search);
        while (index != -1) {
            count++;
            index = str.indexOf(search, index + search.length());
        }
        return count;
    }

    public String replaceOccurrences(String input, String search, String replace) {
        return input.replace(search, replace);
    }
}
