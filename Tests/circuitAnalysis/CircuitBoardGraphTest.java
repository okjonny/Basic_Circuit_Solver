package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.Source;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircuitBoardGraphTest {
    private CircuitBoardGraph tester = new CircuitBoardGraph();
    private Components source1 = new Source("Vs1", 5);
    private Components source2 = new Source("Vs2", 5);
    private Components rs1 = new Resistor("R1", 5e3);
    private Components rs2 = new Resistor("R2", 5e3);

    @Test
    public void testSimpleCircuitWithOneResistorSource() {
        source1.setValue(10);
        tester.addVertex(source1);
        source1.addEdge(rs1);
        // v/r = i => 10/5k = 2mA; v=ir => 5k(2mA) = 10
        assertEquals(10, FindValues.findVoltageDropAcrossResistor(tester, rs1), 0);
    }

    @Test
    public void testCircuitWithResistorsInSeries() {
        tester.addVertex(source1);
        source1.addEdge(rs1);
        source1.addEdge(rs2);
        assertEquals(2.5, FindValues.findVoltageDropAcrossResistor(tester, rs1), 0);
    }

    @Test
    public void testCircuitWithTwoVoltageSources() {
        tester.addVertex(source1);
        source1.addEdge(source2);
        source1.addEdge(rs1);
        assertEquals(2.5, FindValues.findVoltageDropAcrossResistor(tester, rs1), 0);
    }



}