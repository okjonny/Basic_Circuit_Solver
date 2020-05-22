package circuitAnalysis;

import java.util.*;

/*
 * Graph representation of our circuit.
 */
public class CircuitBoardGraph {
    /*
     * Private members
     */
    private static Node[][] matrix;
    private static Node startNodePos;
    private static Map<Integer, Components> vertexMap;
    private static String sspSource;
    private static int nodeId;

    /**
     * Graph representation of circuit
     */
    public CircuitBoardGraph() {
        vertexMap = new HashMap<>();
        sspSource = "";
        nodeId = 0;
    }

    /**
     * Creates a Wire to connect to other element
     */
    public void addVertex(int nodeID, Components node) {
        assert !vertexMap.containsKey(nodeID) : "Violation of label is not a node of this graph";
        vertexMap.put(nodeID, node);
        sspSource = ""; // adding vertex invalidates previous run
        nodeId++;
    }

    @Override
    public String toString() {
        String toText = "";
        for (Map.Entry<Integer, Components> entry : vertexMap.entrySet()) {
            toText += entry.getKey() + " : " + entry.getValue();
        }
        return toText;
    }
}
