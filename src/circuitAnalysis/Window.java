package circuitAnalysis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    private static int WIDTH = 640;
    private static int HEIGHT = 440;
    private int currSelection = 1;
    private JButton newLineBut, clearBut, vSourceBut;

    /**
     * In charge of setting up JFrame window and printing circuit on screen where the
     * user can create their circuit.
     *
     * @param args -
     */
    public static void main(String[] args) {
        new Window();
    }

    public Window() {
        // Setup JFrame
        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Test | Circuit Builder");

        // Menu toolbar
        Box menu = Box.createVerticalBox();
        JPanel buttonsPanel = new JPanel();

        // icons
        newLineBut = createButtons("img/Wire-PNG-Pic.png", 1);
        clearBut = createButtons("img/1200px-Crystal_Clear_action_button_cancel.svg.png", 2);
        vSourceBut = createButtons("img/voltage_power_source.jpg", 3);

        menu.add(newLineBut);
        menu.add(clearBut);
        menu.add(vSourceBut);

        buttonsPanel.add(menu);
        this.add(buttonsPanel, BorderLayout.WEST);
        this.add(new DrawingBoard(), BorderLayout.CENTER);
        this.setVisible(true);
    }

    public JButton createButtons(String iconDir, final int selection) {
        JButton but = new JButton();
        Icon butIcon = new ImageIcon(iconDir);
        but.setIcon(butIcon);

        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currSelection = selection;
            }
        });
        return but;
    }

    private class DrawingBoard extends JComponent {
    }
}



