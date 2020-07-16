package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.Source;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponentsTest {

    private Source source1 = new Source("vs1", 1);
    private Source source2 = new Source("vs2", 2);
    private Source source3 = new Source("vs3", 3);


    private Resistor resistor1 = new Resistor("r1", 100);
    private Resistor resistor2 = new Resistor("r2", 100);

    @Test
    public void testAddEdge() {
        source1.addEdge(source2);
        assertEquals("[vs1 : [vs2]]", source1.toString());
    }

    @Test
    public void testToStringWithMultipleEdges() {
        source1.addEdge(source2);
        source1.addEdge(source3);
        assertEquals("[vs1 : [vs2] -> [vs3]]", source1.toString());
    }

    @Test
    public void testToStringWithNoEdges() {
        assertEquals("[vs1]", source1.toString());
    }

    @Test
    public void testParralelResistance(){
       assertEquals(.02, resistor1.isParrallelWithOtherResistor(resistor2), 0);
    }
}