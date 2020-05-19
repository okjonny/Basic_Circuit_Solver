package circuitAnalysis.components;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

/**
 * Wire acts as an edge that connects different components together
 */
public class Wire extends JComponent {
    /*
     * Private members connecting objects
     */
    private Object o1, o2;

    public Wire(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public Wire(Object o1) {
        this.o1 = o1;
    }

    /**
     * Clear all wires from {@code lines}
     */
    public void clearAllWires() {
        //lines.clear();
        repaint();
    }

    /**
     * remove the last wire the user put down.
     */
    public void deleteWire() {
        //lines.removeLast();
    }

    @Override
    public String toString() {
        String res = "";
        return "(" + o1 + ")";
    }
}


