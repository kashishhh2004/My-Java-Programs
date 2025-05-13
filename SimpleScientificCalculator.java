import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleScientificCalculator extends JFrame implements ActionListener {
    JTextField textField;
    JButton sinButton, cosButton, tanButton, sqrtButton, clearButton;
    
    SimpleScientificCalculator() {
        // Set up the frame
        setTitle("Scientific Calculator");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.PINK); // Pink background

        // Create and add text field
        textField = new JTextField();
        textField.setBounds(30, 30, 320, 30);
        add(textField);

        // Create buttons
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        sqrtButton = new JButton("√");
        clearButton = new JButton("C");

        // Set button positions
        sinButton.setBounds(30, 80, 70, 40);
        cosButton.setBounds(110, 80, 70, 40);
        tanButton.setBounds(190, 80, 70, 40);
        sqrtButton.setBounds(270, 80, 70, 40);
        clearButton.setBounds(150, 140, 90, 40);

        // Add buttons to frame
        add(sinButton);
        add(cosButton);
        add(tanButton);
        add(sqrtButton);
        add(clearButton);

        // Add action listeners
        sinButton.addActionListener(this);
        cosButton.addActionListener(this);
        tanButton.addActionListener(this);
        sqrtButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Make frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double value = Double.parseDouble(textField.getText());
            if (e.getSource() == sinButton) {
                textField.setText(String.valueOf(Math.sin(Math.toRadians(value))));
            } else if (e.getSource() == cosButton) {
                textField.setText(String.valueOf(Math.cos(Math.toRadians(value))));
            } else if (e.getSource() == tanButton) {
                textField.setText(String.valueOf(Math.tan(Math.toRadians(value))));
            } else if (e.getSource() == sqrtButton) {
                textField.setText(String.valueOf(Math.sqrt(value)));
            } else if (e.getSource() == clearButton) {
                textField.setText("");
            }
        } catch (Exception ex) {
            textField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SimpleScientificCalculator();
    }
}
