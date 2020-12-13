// Jonny Palacios-Torres - 2020

package circuitAnalysis;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Purpose of this class is for all elements (Wires, Power Sources, Resistors, etc.)
 * Can extend this  class so that the CircuitGraph class can add 'Components' without
 * having to worry if the element is a wire or something specific.
 */
public abstract class Components {

    /**
     * Returns the number value of measurement
     * @return
     */
    public abstract double getElementValue();


    /**
     * Adds a connection to the current node
     */
    public abstract <T extends Components> void addEdge(T otherNode);


    /**
     * Retrieves neighbor objects
     *
     * @return iterator of {@code connectedComponents} linked-list
     */
    public abstract Iterator<Components> edges();


    /**
     * Makes this Node readable showing its neighbors
     *
     * @return s - name of node
     */
    @Override
    public abstract String toString();


    /**
     * Retrieves the entire list of neighbors this has
     *
     * @return this edges list
     */
    public abstract LinkedList<Components> getConnections();


    /**
     * Gets the name of this
     *
     * @return name
     */
    public abstract String getName();


    /**
     * Changes Name of Node this
     *
     * @param name - change label of this
     */
    public abstract void setNodeName(String name);


    /**
     * Sets new value for this
     *
     * @param value
     */
    public abstract void setValue(double value);
}
