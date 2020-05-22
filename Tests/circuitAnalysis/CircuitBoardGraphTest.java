package circuitAnalysis;

import circuitAnalysis.components.Source;
import circuitAnalysis.components.Wire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircuitBoardGraphTest {
    private CircuitBoardGraph tester = new CircuitBoardGraph();
    private Source source1 = new Source("Vs", 5);

    @Test
    public void constructor() {
        tester.addVertex(0, source1);
        assertEquals("{}", tester.toString());
    }
}