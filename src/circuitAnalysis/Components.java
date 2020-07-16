package circuitAnalysis;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Purpose of this class is for all elements (Wires, Power Sources, Resistors, etc.)
 * Can extend this  class so that the CircuitBoardGraph class can add 'Components' without
 * having to worry if the element is a wire or something specific.
 */
public abstract class Components implements Node {
    /**
     * Private Instance Variables
     */
    private String name;
    private int nodeID;
    private double value;
    private LinkedList<Components> adj;

    /**
     * Default Constructor for children classes to take values from.
     *
     * @param name  - title of element
     * @param value - can represent (Volts, Resistance, etc.)
     */
    public Components(String name, double value) {
        this.name = name;
        this.value = value;
        this.adj = new LinkedList<>();
    }

    /**
     * Default Constructor for children classes to take values from.
     *
     * @param name   - title of element
     * @param value  - can represent (Volts, Resistance, etc.)
     * @param nodeID - unique ID to retrieve data from {@code vertexmap} in CircuitBoardGraph class.
     */
    public Components(String name, double value, int nodeID) {
        this.name = name;
        this.value = value;
        this.nodeID = nodeID;
        this.adj = new LinkedList<>();
    }

    /**
     * Retrieves unique ID
     *
     * @return this nodeID
     */
    public int getNodeID() {
        return this.nodeID;
    }

    public double getElementValue() {
        return this.value;
    }

    @Override
    public <T extends Components> void addEdge(T otherNode) {
        adj.add(otherNode);
    }

    /**
     * Retrieves neighbor objects
     *
     * @return iterator of {@code adj} linked-list
     */
    public Iterator<Components> edges() {
        return adj.iterator();
    }

    /**
     * Makes this Node readable showing its neighbors
     *
     * @return s - name of node
     */
    @Override
    public String toString() {
        Iterator<Components> itr = adj.iterator();
        StringBuilder s = new StringBuilder("[" + this.getName() + ((itr.hasNext()) ? " : " : "]"));
        while (itr.hasNext()) {
            s.append(itr.next() + ((itr.hasNext()) ? " -> " : "]"));
        }
        return s.toString();
    }

    /**
     * Retrieves the entire list of neighbors this has
     *
     * @return this edges list
     */
    public LinkedList<Components> getEdges() {
        return adj;
    }

    /**
     * Gets the name of this
     *
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Changes Name of Node this
     *
     * @param name - change label of this
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setNodeID(int id) {
        this.nodeID = id;
    }

    public void setValue(double value){
        this.value =  value;
    }
}
