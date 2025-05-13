import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class BasicTextEditor extends JFrame implements ActionListener {
    JTextArea textArea;
    JMenuItem openItem, saveItem, clearItem, exitItem, fontSizeItem;

    BasicTextEditor() {
        // Frame setup
        setTitle("Basic Text Editor");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        // Text area
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 10, 565, 420);
        add(scrollPane);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        clearItem = new JMenuItem("Clear");
        exitItem = new JMenuItem("Exit");
        fontSizeItem = new JMenuItem("Change Font Size");

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        clearItem.addActionListener(this);
        exitItem.addActionListener(this);
        fontSizeItem.addActionListener(this);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        editMenu.add(clearItem);
        editMenu.add(fontSizeItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = fileChooser.getSelectedFile();
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    textArea.read(reader, null);
                    reader.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "File not found!");
                }
            }
        } else if (e.getSource() == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = fileChooser.getSelectedFile();
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    textArea.write(writer);
                    writer.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file!");
                }
            }
        } else if (e.getSource() == clearItem) {
            textArea.setText("");
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        } else if (e.getSource() == fontSizeItem) {
            String sizeStr = JOptionPane.showInputDialog(this, "Enter Font Size:");
            try {
                int newSize = Integer.parseInt(sizeStr);
                textArea.setFont(new Font("Arial", Font.PLAIN, newSize));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid size!");
            }
        }
    }

    public static void main(String[] args) {
        new BasicTextEditor();
    }
}
