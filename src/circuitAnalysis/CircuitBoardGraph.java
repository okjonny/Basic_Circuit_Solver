package circuitAnalysis;

import java.util.HashMap;
import java.util.Map;

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
   // private static Node[][] matrix;
    //private static Node startNodePos;
    public static Map<Integer, Components> vertexMap;
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
     *
     * @param element
     */
    public void addConnection(Components element) {
        nodeId++;
        assert !vertexMap.containsKey(element.getNodeID()) : "Node ID already exists";
        element.setNodeID(nodeId);
        vertexMap.put(nodeId, element);
        sspSource = ""; // adding vertex invalidates previous run
    }

    @Override
    /*
     *
     */
    public String toString() {
        String toText = "";
        for (Map.Entry<Integer, Components> entry : vertexMap.entrySet()) {
            toText += entry.getValue() + "\n";
        }
        return toText;
    }

    /**
     * Loop until original element is found, gather data, then display  missing information.
     *
     * For example - vs1 -> wire ->  rs1 -> wire -> vs1
     *
     * So, we save value of voltage of the loop in int - [vs1.getElementValue(), ...,n]
     * Same with resistors - [rs1.getElementValue(), ..., n]
     * Wires are  decorative backend but helpful to see with images for a user-friendly experience
     *
     *
     */


    public Map<Integer, Components> getMap() {
        return vertexMap;
    }
}
