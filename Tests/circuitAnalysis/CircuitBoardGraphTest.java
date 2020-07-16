package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.Source;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircuitBoardGraphTest {
    private CircuitBoardGraph tester = new CircuitBoardGraph();
    private Source source1 = new Source("Vs1", 5);
    private Source source2 = new Source("Vs2", 5);
    private Resistor rs1 = new Resistor("R1", 5e3);
    private Resistor rs2 = new Resistor("R2", 5e3);

    @Test
    public void testSimpleCircuitWithOneResistorSource() {
        source1.setValue(10); // 10V
        tester.addConnection(source1); // Src > Resistor > back to Src
        source1.addEdge(rs1); // 5k
        // v/r = i => 10/5k = 2mA; v=ir => 5k(2mA) = 10
        assertEquals(10, FindValues.findVoltageDropAcrossResistor(tester, rs1), 0);
    }

    @Test
    public void testCircuitWithResistorsInSeries() {
        tester.addConnection(source1); // 5V
        source1.addEdge(rs1); // 5k
        source1.addEdge(rs2); // 5k
        // i = 5/10k = .5mA; .5mA*5k = 2.5
        assertEquals(2.5, FindValues.findVoltageDropAcrossResistor(tester, rs1), 0);
    }

    @Test
    public void testCircuitWithTwoVoltageSources() {
        tester.addConnection(source1); // 5 V
        source1.addEdge(source2); // 5 V
        source1.addEdge(rs1); // 5k
        // i = 10/5k = 2mA, 2mA*5k = 10
        assertEquals(10, FindValues.findVoltageDropAcrossResistor(tester, rs1), 0);
    }

    @Test
    public void testCircuitWithThreeResistorsAndSource() {
        tester.addConnection(source1);
        source1.addEdge(rs1); // 5k
        source1.addEdge(rs1); // 5k
        source1.addEdge(rs2); // 5k
        assertEquals(1.665, FindValues.findVoltageDropAcrossResistor(tester, rs1), 1);
    }



}