package circuitAnalysis.components;

/*
 * Resistors are important for controlling voltage through a certain branch
 * in the circuit. Without resistance an LED would explode if connected to a 5V
 * source. So we add resistors to restrict current flow given by voltage (hence
 * Ohm's Law V=IR).
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