package circuitAnalysis;

import java.util.Iterator;
import java.util.LinkedList;

public interface Node {

    /**
     * Retrieves unique ID
     *
     * @return this nodeID
     */
    int getNodeID();

    /**
     * Adds a neighbor
     *
     * @param otherNode - adjacent neighbor of this
     */
    public <T extends UsefulClass> void addEdge(T otherNode);

    /**
     * Retrives neighbor objects
     *
     * @return iterator of {@code adj} linked-list
     */
    public Iterator<Node> edges();

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
    LinkedList<Node> getEdges();

    /**
     * Gets the name of this
     *
     * @return name
     */
    String getName();

    /**
     * Gets this visit state
     *
     * @return if visited
     */
    boolean getVisited();

    /**
     * Changes the state of this
     *
     * @param b - change of visited state
     */
    void setVisited(boolean b);

    /**
     * Gets Node that called this
     *
     * @return previous called neighbor
     */
    Node getPrevious();

    /**
     * Changes Name of Node this
     *
     * @param name - change label of this
     */
    void setName(String name);

    /**
     * Gets x spot in {@code matrix}
     *
     * @return x position in {@code matrix}
     */
    public int getX();

    /**
     * Gets y spot in {@code matrix}
     *
     * @return y position in {@code matrix}
     */
    public int getY();


    /**
     * Set previous adjacent neighbor
     *
     * @param x - neighbor that called this
     */
    public void setPrevious(Node x);
}


