package circuitAnalysis;

import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.VoltageSource;

import java.util.Map;

public class FindValues {

    /*    *//**
     * Find missing current I with given voltage source and resistor values to find voltage drop across resistor,
     * this method assumes 1 loop around, does not contain calculations for advanced schematics.
     *
     * @param circuit  - circuit containing main parent node that connects all components
     * @param resistor - desired resistor to find voltage drop across
     * @return double - voltage across resistor
     *//*
    public static double findVoltageDropAcrossResistor(CircuitGraph circuit, Resistor resistor) {
        double voltage = 0;
        double totalResistance = 0;
        for (Map.Entry<String, T> entry : circuit.getMap().entrySet()) {
            if (entry.getValue().getClass().isAssignableFrom(Resistor.class)) {
                totalResistance = entry.getValue().getElementValue();
            } else if (entry.getValue().getClass().isAssignableFrom(VoltageSource.class)) {
                voltage = entry.getValue().getElementValue();
            }
            for (Components edge : entry.getValue().getConnections()) {
                if (edge.getClass().isAssignableFrom(VoltageSource.class)) {
                    voltage += edge.getElementValue();
                } else if (edge.getClass().isAssignableFrom(Resistor.class)) {
                    totalResistance += edge.getElementValue();
                }
            }
        }
        double current = (voltage / totalResistance);
        return (current * resistor.getElementValue());
    }*/
}
