package circuitAnalysis;

import java.util.LinkedList;
import java.util.List;

/*
 * Graph representation of our circuit.
 */
public class CircuitBoardGraph<T> {


    /*
     * Private members
     */
    private List<T> list[];

    /**
     * Graph representation of circuit
     * @param n - number of elements that can be connected to
     */
    public CircuitBoardGraph(int n) {
        list = new LinkedList[n];
        for (int i = 0; i < list.length; i++) {
            list[n] = new LinkedList<T>();
        }
    }

    /**
     * Add connections to other elements
     * @param o1
     * @param o2
     */
    void addWire(T o1, T o2) {

    }






}
