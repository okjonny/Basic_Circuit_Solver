package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.Source;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircuitBoardGraphTest {
    private CircuitBoardGraph tester = new CircuitBoardGraph();
    private Components source1 = new Source("Vs", 5);
    private Components source2 = new Source("Vs2", 0);

    private Components rs1 = new Resistor("R1", 5e3);

    @Test
    public void testConstructor() {
        tester.addVertex(source1);
        tester.addVertex(source1);
        assertEquals("[Vs]\n[Vs2]\n", tester.toString());
    }


    @Test
    public void testSimpleCircuitWithOneResistorSource() {
        source1.setValue(10);
        tester.addVertex(source1);
        source1.addEdge(rs1);
        assertEquals(100.0, FindValues.findVoltageDrop(tester), 0);
    }

    @Test
    public void testCircuitWithResistorsInSeries() {
        tester.addVertex(source1);
        source1.addEdge(rs1);
        source1.addEdge(rs1);

        assertEquals(10.0, FindValues.findVoltageDrop(tester), 0);
    }

}