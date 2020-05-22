package circuitAnalysis.components;

import circuitAnalysis.Components;

/*
 * Power/Direct voltage source
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
