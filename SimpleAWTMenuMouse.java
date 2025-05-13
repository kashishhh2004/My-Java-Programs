import java.awt.*;
import java.awt.event.*;

public class SimpleAWTMenuMouse extends Frame implements MouseListener {

    Label label;

    public SimpleAWTMenuMouse() {
        // --- Frame settings ---
        setTitle("AWT Menu & Mouse Events Example");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setBackground(Color.GREEN);

        // --- Menu Bar ---
        MenuBar menuBar = new MenuBar();

        // File menu
        Menu fileMenu = new Menu("File");
        fileMenu.add(new MenuItem("Open"));
        fileMenu.add(new MenuItem("Save"));
        fileMenu.add(new MenuItem("Exit"));

        // Edit menu
        Menu editMenu = new Menu("Edit");
        editMenu.add(new MenuItem("Cut"));
        editMenu.add(new MenuItem("Copy"));
        editMenu.add(new MenuItem("Paste"));

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setMenuBar(menuBar);

        // --- Mouse Event Label ---
        label = new Label("Interact with the window using your mouse!");
        add(label);

        // Add mouse listener to the frame
        addMouseListener(this);

        // Close window on click
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // --- Mouse Event Methods ---
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the window.");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the window.");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed.");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released.");
    }

    public static void main(String[] args) {
        new SimpleAWTMenuMouse();
    }
}
