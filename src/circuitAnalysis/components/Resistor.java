package circuitAnalysis.components;

/*
 * Resistor element
 */
public class Resistor {
    private String name;
    private double value;
    private String measurement;


    public Resistor(String name, int value) {
        this.name = name;
        this.value = value;
        this.measurement = "Ω";
    }
}