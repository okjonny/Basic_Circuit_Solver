// Jonny Palacios-Torres - 2020
package circuitAnalysis.components;

import circuitAnalysis.Components;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Resistors are important for controlling voltage through a certain branch
 * in the circuit. Without resistance an LED would explode if connected to a 5V
 * source. So we add resistors to restrict current flow given by voltage (hence
 * Ohm's Law V=IR).
 */
public class Resistor extends Components {

    /**
     * Private Instance Variables
     */
    private String name;
    private double value;
    private LinkedList<Components> connectedComponents;
    private String measurement = "Ω";

    public Resistor(String name, double value) {
        name = name;
        value = value;
        connectedComponents = new LinkedList<>();
    }

    /**
     * Adds a parralel resistor to this
     *
     * @param rOther - array of parralel resistors that come in contact with this
     */
    public double parrallelWithResistor(Resistor rOther) {
        return 1 / rOther.getElementValue() + (1 / this.getElementValue());
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