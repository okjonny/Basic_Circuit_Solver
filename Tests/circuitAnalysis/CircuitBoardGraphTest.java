package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.VoltageSource;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircuitBoardGraphTest {
    private CircuitGraph tester = new CircuitGraph();
    private VoltageSource voltageSource1 = new VoltageSource("Vs1", 5);
    private VoltageSource voltageSource2 = new VoltageSource("Vs2", 5);
    private Resistor rs1 = new Resistor("R1", 5e3);
    private Resistor rs2 = new Resistor("R2", 5e3);

    @Test
    public void testSimpleCircuitWithOneResistorSource() {
        voltageSource1.setValue(10); // 10V
        tester.resistorMap.put(voltageSource1.getName(), rs1); // Src > Resistor > back to Src
        voltageSource1.addEdge(rs1); // 5k
        // v/r = i => 10/5k = 2mA; v=ir => 5k(2mA) = 10
//        assertEquals(2.5, FindValues.findVoltageDropAcrossResistor(tester, rs1), 0);
    }
/*
    @Test
    public void testCircuitWithResistorsInSeries() {
        tester.addConnection(voltageSource1); // 5V
        voltageSource1.addEdge(rs1); // 5k
        voltageSource1.addEdge(rs2); // 5k
        // i = 5/10k = .5mA; .5mA*5k = 2.5
        assertEquals(2.5, FindValues.findVoltageDropAcrossResistor(tester, rs1), 0);
    }

    @Test
    public void testCircuitWithTwoVoltageSources() {
        tester.addConnection(voltageSource1); // 5 V
        voltageSource1.addEdge(voltageSource2); // 5 V
        voltageSource1.addEdge(rs1); // 5k
        // i = 10/5k = 2mA, 2mA*5k = 10
        assertEquals(10, FindValues.findVoltageDropAcrossResistor(tester, rs1), 0);
    }

    @Test
    public void testCircuitWithThreeResistorsAndSource() {
        tester.addConnection(voltageSource1);
        voltageSource1.addEdge(rs1); // 5k
        voltageSource1.addEdge(rs1); // 5k
        voltageSource1.addEdge(rs2); // 5k
        assertEquals(1.665, FindValues.findVoltageDropAcrossResistor(tester, rs1), 1);
    }*/
}