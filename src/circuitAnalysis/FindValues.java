package circuitAnalysis;

import java.util.Map;

public class FindValues {

    public static <T extends Components> double findVoltageDropAcrossResistor(CircuitBoardGraph circuit, T resistor) {
        double voltage = 0;
        double totalResistance = 0;
        for (Map.Entry<Integer, Components> entry : circuit.getMap().entrySet()) {
            voltage = entry.getValue().getValue();
            totalResistance = 0;
            for (Components edge : entry.getValue().getEdges()) {
                totalResistance += edge.getValue();
            }
        }

        double current = (voltage / totalResistance);
        return (current * resistor.getValue());
    }
}
