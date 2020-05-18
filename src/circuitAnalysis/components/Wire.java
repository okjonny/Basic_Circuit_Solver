package circuitAnalysis.components;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;


public class Wire extends JComponent {
    /**
     * Each line represents a "wire" used within the circuit.
     */
    private static class Line {
        final int x1,x2,y1,y2;
        final Color color;

        public Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.color = Color.black;
        }
    }

    private final LinkedList<Line> lines = new LinkedList<Line>();

    public void addLine(int x1, int x2, int x3, int x4) {
        lines.add(new Line(x1, x2, x3, x4));
        repaint();
    }

    /**
     * Clear all wires
     */
    public void clearAllWires() {
        lines.clear();
        repaint();
    }

    /**
     * Draw all wires
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Line line : lines) {
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }
    }
}


