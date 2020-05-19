package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.Source;
import circuitAnalysis.components.Wire;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Graph representation of our circuit.
 */
public class CircuitBoardGraph {


    /*
     * Private members
     */
    private ArrayList<LinkedList<Object>> graph;
    private int nodeId = 0;


    /**
     * Graph representation of circuit
     */

    public CircuitBoardGraph() {
        graph = new ArrayList<>();
    }

    /**
     * Creates a Wire to connect to other element
     *
     * @param from
     * @param to
     */
    public void addEdge(Object from, Object to) {
        if (from != null && to != null) {
            if (!graph.contains(from)) {
                graph.get(nodeId++).add(from);
            }
            if (!graph.contains(to)) {
                graph.get(nodeId++).add(to);
            }
            int index = graph.indexOf(from);
            graph.get(index).add(to);
            // list[pos].add(0, (new Wire(element)));
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < graph.size(); i++) {
            result += i + "=>" + graph.get(i).toString() + "\n";
        }
        return result;
    }


    public static void main(String[] args) {
        CircuitBoardGraph test = new CircuitBoardGraph();
        Resistor r1 = new Resistor("Rb", 100);
        Source source = new Source("Vs", 5);
        Wire w0 = new Wire("w1");
        Wire w1 = new Wire("w2");


        test.addEdge(0, source);
        test.addEdge(0, r1);

        test.addEdge(1, source);
        test.addEdge(1, r1);

        test.addEdge(2, w0);

        System.out.println(test);
    }

}
