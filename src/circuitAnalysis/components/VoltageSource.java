// Jonny Palacios-Torres - 2020

package circuitAnalysis.components;
import circuitAnalysis.Components;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Important for our circuit to have voltage, without voltage our circuit
 * would have no power and nothing will come about it.
 */
public class VoltageSource extends Components {

    /**
     * Private Instance Variables
     */
    private String name, measurement = "V";
    private double value;
    private LinkedList<Components> connectedComponents;

    public VoltageSource(String _name, double _value) {
        name = _name;
        value = _value;
        connectedComponents = new LinkedList<>();
    }

    public double getElementValue() {
        return this.value;
    }

    public <T extends Components> void addEdge(T otherNode) {
        connectedComponents.add(otherNode);
    }

    public Iterator<Components> edges() {
        return connectedComponents.iterator();
    }

    @Override
    public String toString() {
        Iterator<Components> itr = connectedComponents.iterator();
        StringBuilder s = new StringBuilder("[" + this.getName() + ((itr.hasNext()) ? " : " : "]"));
        while (itr.hasNext()) {
            s.append(itr.next() + ((itr.hasNext()) ? " -> " : "]"));
        }
        return s.toString();
    }

    public LinkedList<Components> getConnections() {
        return connectedComponents;
    }

    public String getName() {
        return name;
    }

    public void setNodeName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
