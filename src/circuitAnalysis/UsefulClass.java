package circuitAnalysis;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class UsefulClass <T> implements Node {
    /**
     * Private Instance Variables
     */
    private String name;
    private int nodeID;
    private double dFromStart, value;
    private boolean visited;
    private Node previous;
    private LinkedList<Node> adj;
    private final Class<T> stateClass;

    public UsefulClass(String name, double value, Class<T> stateClass){
        this.name = name;
        this.value = value;
        this.stateClass = stateClass;
    }
    /**
     * Retrieves unique ID
     *
     * @return this nodeID
     */
    public int getNodeID() {
        return this.nodeID;
    }


    public <T extends UsefulClass> void addEdge(Class<T> otherNode) {
        assert otherNode != null : "cant add, it's null";
        adj.add((otherNode.getName(), otherNode.getNodeID()));
    }

    /**
     * Retrives neighbor objects
     *
     * @return iterator of {@code adj} linked-list
     */
    public Iterator<Node> edges() {
        return adj.iterator();
    }

    /**
     * Makes this Node readable showing its neighbors
     *
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
     *
     * @return this edges list
     */
    public LinkedList<Node> getEdges() {
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
     * Gets this visit state
     *
     * @return if visited
     */
    public boolean getVisited() {
        return visited;
    }

    /**
     * Changes the state of this
     *
     * @param b - change of visited state
     */
    public void setVisited(boolean b) {
        visited = b;
    }

    /**
     * Gets Node that called this
     *
     * @return previous called neighbor
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     * Changes Name of Node this
     *
     * @param name - change label of this
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Changes {@code dFromStart} to infinity from start
     *
     * @param positiveInfinity - set distance to infinity for this
     */
    public void setDistanceFromStart(double positiveInfinity) {
        dFromStart = positiveInfinity;
    }

    /**
     * Set previous adjacent neighbor
     *
     * @param x - neighbor that called this
     */
    public void setPrevious(Node x) {
        this.previous = x;
    }

    /**
     * Gets the current distant from start
     *
     * @return {@code dFromStart} containing total steps from start
     */
    public double getDistanceFromStart() {
        return dFromStart;
    }
}
