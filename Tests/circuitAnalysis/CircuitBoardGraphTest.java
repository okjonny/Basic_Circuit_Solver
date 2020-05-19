package circuitAnalysis;

import circuitAnalysis.components.Source;
import circuitAnalysis.components.Wire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircuitBoardGraphTest {
    private CircuitBoardGraph tester = new CircuitBoardGraph();
    private Wire wire1 = new Wire("wire1");
    private Source  source1 = new Source("Vs", 5);

    @Test
    public void addWire() {
        tester.addEdge(source1,wire1);
        assertEquals("Vs => wire1",tester.toString());
    }
}