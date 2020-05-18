package circuitAnalysis;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Node class to represent each box in circuit board
 */

public class Node {

    /**
     * Private Instance Variables
     */
    private String name;
    private int x, y, nodeID;
    public boolean visited;
    public Node previous;
    private LinkedList<Node> adj;

    /**
     * Default node with name and coordinates
     *
     * @param name - label of this
     * @param x    - x coordinate in {@code matrix}
     * @param y    - y coordiante in {@code matrix}
     */
    public Node(String name, int x, int y) {
        this.name = name;
        this.adj = new LinkedList<Node>();
        this.x = x;
        this.y = y;
    }

    /**
     * Node constructor with a node id and Default settings
     * @param name - label of this
     * @param nodeID - unique id to specify in {@code vertexMap}
     * @param x - x coordinate in {@code matrix}
     * @param y - y coordiante in {@code matrix}
     */
    public Node(String name, int nodeID, int x, int y) {
        this.name = name;
        this.adj = new LinkedList<Node>();
        this.x = x;
        this.y = y;
        this.nodeID = nodeID;
    }

    /**
     * Constructor of Node using nodeID
     * @param nodeID - unique id to specify in {@code vertexMap}
     */
    public Node(int nodeID) {
        this.nodeID = nodeID;
    }

    /**
     * Retrieves unique ID
     *
     * @return this nodeID
     */
    public int getNodeID() {
        return this.nodeID;
    }

    /**
     * Adds a neighbor
     * @param otherNode - adjacent neighbor of this
     */
    public void addEdge(Node otherNode) {
        adj.add(new Node(otherNode.getName(), otherNode.nodeID, otherNode.getX(), otherNode.getY()));
    }

    /**
     * Retrives neighbor objects
     * @return iterator of {@code adj} linked-list
     */
    public Iterator<Node> edges() {
        return adj.iterator();
    }

    /**
     * Makes this Node readable showing its neighbors
     * @return s - name of node
     */
    public String toString() {
        String s = "[Node: " + (getName().equals("X") ? "X" : getNodeID()) + ((this.edges().hasNext()) ? " -> " : "");
        Iterator<Node> itr = adj.iterator();
        while (itr.hasNext())
            s += itr.next() + " ";
        s += "]";
        return s;
    }

    /**
     * Retrieves the entire list of neighbors this has
     * @return this edges list
     */
    public LinkedList<Node> getEdges() {
        return adj;
    }

    /**
     * Gets the name of this
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets this visit state
     * @return if visited
     */
    public boolean getVisited() {
        return visited;
    }

    /**
     * Changes the state of this
     * @param b - change of visited state
     */
    public void setVisited(boolean b) {
        visited = b;
    }

    /**
     * Gets Node that called this
     * @return previous called neighbor
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     * Changes Name of Node this
     * @param name - change label of this
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets x spot in {@code matrix}
     * @return x position in {@code matrix}
     */
    public int getX() {
        return this.x;
    }

    /**
     * Gets y spot in {@code matrix}
     * @return y position in {@code matrix}
     */
    public int getY() {
        return this.y;
    }


    /**
     * Set previous adjacent neighbor
     * @param x - neighbor that called this
     */
    public void setPrevious(Node x) {
        this.previous = x;
    }
}
