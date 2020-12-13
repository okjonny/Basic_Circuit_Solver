package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.VoltageSource;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponentsTest {

    private VoltageSource voltageSource1 = new VoltageSource("vs1", 1);
    private VoltageSource voltageSource2 = new VoltageSource("vs2", 2);
    private VoltageSource voltageSource3 = new VoltageSource("vs3", 3);


    private Resistor resistor1 = new Resistor("r1", 100);
    private Resistor resistor2 = new Resistor("r2", 100);

    @Test
    public void testAddEdge() {
        voltageSource1.addEdge(voltageSource2);
        assertEquals("[vs1 : [vs2]]", voltageSource1.toString());
    }

    @Test
    public void testToStringWithMultipleEdges() {
        voltageSource1.addEdge(voltageSource2);
        voltageSource1.addEdge(voltageSource3);
        assertEquals("[vs1 : [vs2] -> [vs3]]", voltageSource1.toString());
    }

    @Test
    public void testToStringWithNoEdges() {
        assertEquals("[vs1]", voltageSource1.toString());
    }

}