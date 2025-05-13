import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {

    TextField num1Field, num2Field, resultField;
    Choice operation;
    Button calcButton;

    public SimpleCalculator() {
        // Set frame properties
        setTitle("Simple Calculator");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setBackground(Color.CYAN); 

        // Create input fields
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        resultField = new TextField(15);
        resultField.setEditable(false);

        // Create combo box for operation
        operation = new Choice();
        operation.add("+");
        operation.add("-");
        operation.add("*");
        operation.add("/");

        // Create button
        calcButton = new Button("Calculate");
        calcButton.addActionListener(this);

        // Add components to frame
        add(new Label("First Number:"));
        add(num1Field);

        add(new Label("Second Number:"));
        add(num2Field);

        add(new Label("Operation:"));
        add(operation);

        add(calcButton);

        add(new Label("Result:"));
        add(resultField);

        // Handle window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            String op = operation.getSelectedItem();
            double result = 0;

            if (op.equals("+")) result = n1 + n2;
            else if (op.equals("-")) result = n1 - n2;
            else if (op.equals("*")) result = n1 * n2;
            else if (op.equals("/")) {
                if (n2 == 0) {
                    resultField.setText("Can't divide by 0");
                    return;
                }
                result = n1 / n2;
            }

            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
