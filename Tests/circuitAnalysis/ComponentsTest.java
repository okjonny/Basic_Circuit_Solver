package circuitAnalysis;

import circuitAnalysis.components.Source;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponentsTest {

    private Components source1 = new Source("vs1", 1);
    private Components source2 = new Source("vs2", 2);
    private Components source3 = new Source("vs3", 3);

    @Test
    public void testAddEdge() {
        source1.addEdge(source2);
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
}