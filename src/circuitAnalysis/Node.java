package circuitAnalysis;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * The point of the Node interface was for the circuit elements to implement these methods
 * in each of their classes. I then decided to add a parent class that implemented the methods
 * (inside of Components). However, I'm not sure if this is the most effective/efficient way to
 * go about extending this interface to its children.
 */
public interface Node {

    /**
     * Retrieves unique ID
     *
     * @return this nodeID
     */
    int getNodeID();

    /**
     * Adds a neighbor to the current element
     *
     * @param otherNode - adjacent neighbor of this
     */
    public <T extends Components> void addEdge(Components otherNode);

    /**
     * Retrives neighbor objects
     *
     * @return iterator of {@code adj} linked-list
     */
    public Iterator<Components> edges();

    /**
     * Makes this Node readable showing its neighbors
     *
     * @return s - name of node
     */
    String toString();

    /**
     * Retrieves the entire list of neighbors this has
     *
     * @return this edges list
     */
    LinkedList<Components> getEdges();

    /**
     * Gets the name of this
     *
     * @return name
     */
    String getName();

    /**
     * Changes Name of Node this
     *
     * @param name - change label of this
     */
    void setName(String name);

}


