package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.VoltageSource;
import org.junit.Test;

public class ResistorTests {

    private VoltageSource voltageSource1 = new VoltageSource("vs1", 1);

    private Resistor resistor1 = new Resistor("r1", 100);
    private Resistor resistor2 = new Resistor("r2", 100);

    @Test
    public void testParallelResistance() {
    }

    @Test
    public void testToStringWithMultipleEdges() {
    }

    @Test
    public void testToStringWithNoEdges() {
    }
}