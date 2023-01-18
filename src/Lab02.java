import javax.swing.*;
import java.awt.*;

/**
 * <p>Lab01 is a class that creates a GUI from Java Swing. This GUI holds a
 * JMenuBar and a JPanel formatted as a 2x2 grid to hold different
 * colored sub panels. Once instantiated, then the user would have to call
 * createAndShowGUI() to create and view the GUI. The class contains a main
 * that demonstrates the instantiation and call of the function; creating
 * the GUI. Extends JFrame to call the functions to set up the GUI.<p>
 *
 * @author      Matthew Wingerden
 * @author      Pablo Nguyen
 * @author      Juan Custodio
 * @author      Kevin Henderson
 * @author      Harkaran Mann
 * @author      Nathan Ho
 * @version     1.0
 * @since       2023-16-01
 */

public class Lab02 extends JFrame{

    /**
     * <p>Creates and returns a menu bar for the window. The menu bar just holds
     * a File and About menu with File containing just three menu items: Open
     * Save, and Quit. None of the options in the menu bar work when clicked.<p>
     *
     * @return      a JMenuBar with the current menu and menu items as described
     *              above
     */
    public JMenuBar createMenuBar() {
        //Create and Add MenuBar
        JMenuBar jMenuBar = new JMenuBar();

        //Create Menu
        JMenu file = new JMenu("File");
        JMenu about = new JMenu("About");

        //Create and Add Items to Appropriate Menus
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");
        file.add(open);
        file.add(save);
        file.add(quit);

        //Add Menus to MenuBar
        jMenuBar.add(file);
        jMenuBar.add(about);

        //Return MenuBar
        return jMenuBar;
    }

    /**
     * <p>Creates and returns a Panel for the window. The panel is formatted in a
     * 2x2 grid and contains colored sub panels(in order: cyan, pink, yellow, and orange) that
     * contains a word.<p>
     *
     * @return      a JPanel as described above.
     */
    public JPanel createColoredBoxes() {
        //Create JPanel to Hold Colors
        JPanel boxes = new JPanel(new GridLayout(2, 2));

        //instantiate
        JPanel cyan = new JPanel(new GridLayout(1, 1));
        JPanel pink = new JPanel(new GridLayout(1, 1));
        JPanel yellow = new JPanel(new GridLayout(1, 1));
        JPanel orange = new JPanel(new GridLayout(1, 1));

        //Cyan
        cyan.add(new JLabel("Hola"));
        cyan.setBackground(Color.CYAN);
        //Pink
        pink.add(new JLabel("World!"));
        pink.setBackground(Color.PINK);
        //Yellow
        yellow.add(new JLabel("Hello"));
        yellow.setBackground(Color.YELLOW);
        //Orange
        orange.add(new JLabel("Mundo!"));
        orange.setBackground(Color.ORANGE);

        //Add to Boxes
        boxes.add(yellow);
        boxes.add(pink);
        boxes.add(cyan);
        boxes.add(orange);

        //Return Colored Boxes
        return boxes;
    }

    /**
     * <p>Sets up the window and adds the menu bar and colored panels, creating
     * a standard GUI.<p>
     *
     */
    public void createAndShowGUI() {
        //Create and set up window.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content.
        setJMenuBar(createMenuBar());
        add(createColoredBoxes());

        //Establish misc.
        setTitle("Lab 02");
        setSize(450, 350);
        setVisible(true);
    }

    /**
     * <p>A main that demonstrates the Lab 01 GUI.<p>
     *
     */
    public static void main(String [] args) {
        Lab02 lab02 = new Lab02();
        lab02.createAndShowGUI();
    }
}
