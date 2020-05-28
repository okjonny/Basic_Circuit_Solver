package circuitAnalysis;

import java.util.LinkedList;
import java.util.Map;

public class FindValues {

    public static double findVoltageDrop(CircuitBoardGraph circuit) {
            double voltage = 0;
            double rValue = 0;
        for (Map.Entry<Integer, Components> entry : circuit.getMap().entrySet()) {
            voltage = entry.getValue().getValue();
            rValue = 0;
            for (Components edge : entry.getValue().getEdges()) {
                rValue += edge.getValue();
            }


        }

        double current= voltage / rValue;
        return current * rValue;
    }
}
