package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.Source;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindValues {

    public static <E extends Components> double findVoltageDropAcrossResistor(CircuitBoardGraph circuit, E resistor) {
        double voltage = 0;
        double totalResistance = 0;
        for (Map.Entry<Integer, Components> entry : circuit.getMap().entrySet()) {
            if (entry.getValue() instanceof Resistor) {
                totalResistance = entry.getValue().getElementValue();
            } else if (entry.getValue() instanceof Source) {
                voltage = entry.getValue().getElementValue();
            }
            for (Components edge : entry.getValue().getEdges()) {
                if (checkForType(edge, Source.class)) {
                    voltage += edge.getElementValue();
                }
                if (checkForType(edge, Resistor.class)) {
                    totalResistance += edge.getElementValue();
                }
            }
        }
        double current = (voltage / totalResistance);
        return (current * resistor.getElementValue());
    }

    public static boolean checkForType(Object candidate, Class<?> type) {
        return type.isInstance(candidate);
    }
}
