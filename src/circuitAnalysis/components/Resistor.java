package circuitAnalysis.components;

import circuitAnalysis.Components;

/*
 * Resistors are important for controlling voltage through a certain branch
 * in the circuit. Without resistance an LED would explode if connected to a 5V
 * source. So we add resistors to restrict current flow given by voltage (hence
 * Ohm's Law V=IR).
 */
public class Resistor extends Components {
    private String measurement;

    public Resistor(String name, double value) {
        super(name, value);
        this.measurement = "Ohm's";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getElementValue() {
        return super.getElementValue();
    }

    /**
     * Returns this measurement
     * @return units
     */
    public String getMeasurement() {
        return this.measurement;
    }

}