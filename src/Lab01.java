import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Lab01 is a class that creates a GUI from Java Swing. This GUI holds a
 * JMenuBar and a JPanel formatted as a 2x2 grid to hold different
 * colored sub panels. Once instantiated, then the user would have to call
 * createAndShowGUI() to create and view the GUI. The class contains a main
 * that demonstrates the instantiation and call of the function; creating
 * the GUI. Extends JFrame to call the functions to set up the GUI.
 *
 * @author Matthew Wingerden
 * @author Pablo Nguyen
 * @author Juan Custodio
 * @author Kevin Henderson
 * @author Harkaran Mann
 * @author Nathan Ho
 * @version 1.0
 * @since 2023-16-01
 */

public class Lab01 extends JFrame implements WindowListener, ActionListener {

    static private JFrame frame;

    public Lab01() {
        frame = this;
    }

    /**
     * A main that demonstrates the Lab 01 GUI.
     */
    public static void main(String[] args) {
        Lab01 lab02 = new Lab01();
        lab02.createAndShowGUI();
    }

    /**
     * Sets up the window and adds the menu bar and colored panels, creating
     * a standard GUI.
     */
    public void createAndShowGUI() {
        //Create and set up window.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content.
        setJMenuBar(createMenuBar());
        add(createTabs());
//        addWindowListener(this);
        //Establish misc.
        setTitle("Lab 01");
        setSize(450, 350);
        setVisible(true);
    }

    /**
     * Creates and returns a menu bar for the window. The menu bar just holds
     * a File and About menu with File containing just three menu items: Open
     * Save, and Quit. None of the options in the menu bar work when clicked.
     *
     * @return a JMenuBar with the current menu and menu items as described
     * above
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
     * Creates and returns a Panel for the window. The panel is formatted in a
     * 2x2 grid and contains colored sub panels(in order: cyan, pink, yellow, and orange) that
     * contains a word.
     *
     * @return a JPanel as described above.
     */
    public ArrayList<JPanel> createColoredBoxes() {
        ArrayList<JPanel> jPanels = new ArrayList<>();

        //instantiate
        JPanel cyan = new JPanel(new GridLayout(1, 1));
        JPanel pink = new JPanel(new GridLayout(1, 1));
        JPanel yellow = new JPanel(new GridLayout(1, 1));
        JPanel orange = new JPanel(new GridLayout(1, 1));
        
        
        //create button to put in Cyan
        JButton jButton = new JButton("Click For Dialog");
        cyan.add(jButton);
        jButton.addActionListener(this);
        jButton.setSize(40,20);
        jButton.setBounds(50,50,20,20);
        cyan.add(jButton);

        //Yellow
        yellow.add(new JLabel("Hello"));
        yellow.setBackground(Color.YELLOW);
        //Pink
        pink.add(new JLabel("World!"));
        pink.setBackground(Color.PINK);
        //Cyan
        cyan.add(new JLabel("Hola"));
        cyan.setBackground(Color.CYAN);
        //Orange
        orange.add(new JLabel("Mundo!"));
        orange.setBackground(Color.ORANGE);

        jPanels.add(yellow);
        jPanels.add(pink);
        jPanels.add(cyan);
        jPanels.add(orange);

        return jPanels;
    }

    JTabbedPane createTabs() {
        JTabbedPane tabbedPane = new JTabbedPane();
        ArrayList<JPanel> jPanels = createColoredBoxes();

        tabbedPane.addTab("Tab 1", null, jPanels.get(0),
                "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        tabbedPane.addTab("Tab 2", null, jPanels.get(1),
                "Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        tabbedPane.addTab("Tab 3", null, jPanels.get(2),
                "Still does nothing");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        tabbedPane.addTab("Tab 4", null, jPanels.get(3),
                "Does nothing at all");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        return tabbedPane;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(
                frame,
                "Eggs are not supposed to be green.",
                "Inane warning",
                JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"Dialog");
    }
}
