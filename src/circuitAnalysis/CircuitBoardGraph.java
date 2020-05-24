package circuitAnalysis;

import java.util.*;

/*
 * Graph representation of a simple circuit builder.
 */
public class CircuitBoardGraph {
    /*
     * Private members
     * {@code matrix} - is a 2D array to hold a one of the 4 components
     * {@code  vertexMap} -  Given a special nodeID, return corresponding Component in circuit
     * {@code sspSource} - used for invalidating previous ssp run when adding a new Vertex (?)
     * {@code nodeId} - each Component used in this graph, contains their own unique ID
     */
    private static Node[][] matrix;
    private static Node startNodePos;
    private static Map<Integer, Components> vertexMap;
    private static String sspSource;
    private static int nodeId;

    /**
     * Default constructor for graph representation of a circuit
     */
    public CircuitBoardGraph() {
        vertexMap = new HashMap<>();
        sspSource = "";
        nodeId = 0;
    }

    /**
     * Adds a new Vertex to this
     * @param nodeID
     * @param node
     */
    public void addVertex(int nodeID, Components node) {
        assert !vertexMap.containsKey(nodeID) : "Violation of label is not a node of this graph";
        vertexMap.put(nodeID, node);
        sspSource = ""; // adding vertex invalidates previous run
        nodeId++;
    }

    @Override
    /*
     *  Test toString still under construction lol
     */
    public String toString() {
        String toText = "";
        for (Map.Entry<Integer, Components> entry : vertexMap.entrySet()) {
            toText += entry.getKey() + " : " + entry.getValue();
        }
        return toText;
    }
}
