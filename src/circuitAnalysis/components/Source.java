package circuitAnalysis.components;

import circuitAnalysis.Components;

/*
 * Important for our circuit to have voltage, without voltage our circuit
 * would have no power and nothing will come about it.
 */
public class Source extends Components {
    private String name;
    private String measurement;
    private double value;

    public Source(String name, double value) {
        super(name, value);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
