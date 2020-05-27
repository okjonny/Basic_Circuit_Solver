package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.Source;
import circuitAnalysis.components.Wire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircuitBoardGraphTest {
    private CircuitBoardGraph tester = new CircuitBoardGraph();
    private Components source1 = new Source("Vs", 5);
    private Components source2 = new Source("Vs2", 10);
    private Components rs1 = new Resistor("R1", 100);

    @Test
    public void testConstructor() {
        tester.addVertex(source1);
        tester.addVertex(source1);
        assertEquals("[Vs]\n[Vs2]\n", tester.toString());
    }

    @Test
    public void testSuperSimpleCircuit() {
    }

}