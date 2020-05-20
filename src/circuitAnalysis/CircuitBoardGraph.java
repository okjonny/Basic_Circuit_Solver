package circuitAnalysis;

import java.util.HashMap;
import java.util.Map;

/*
 * Graph representation of our circuit.
 */
public class CircuitBoardGraph {
    /*
     * Private members
     */
    private static Node[][] matrix;
    private static Node startNodePos;
    private static Map<Integer, Node> vertexMap;
    private static String sspSource;
    private static int nodeId;

    /**
     * Graph representation of circuit
     */
    public CircuitBoardGraph() {
        vertexMap = new HashMap<>();
        sspSource = "";
    }

    /**
     * Creates a Wire to connect to other element
     *
     */
    public void addVertex(int nodeID, Node node) {
        assert !vertexMap.containsKey(nodeID) : "Violation of label is not a node of this graph";
        vertexMap.put(nodeID, node);
        sspSource = ""; // adding vertex invalidates previous run
    }

    @Override
    public String toString() {
        String result = "";
        return result;
    }
}
