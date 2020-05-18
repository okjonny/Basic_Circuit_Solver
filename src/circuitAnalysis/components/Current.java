package circuitAnalysis.components;

/*
 * Current path going through series elements
 */
public class Current{
    private String name;
    private double value;
    private String measurement;


    public Current(String name, int value) {
        this.name = name;
        this.value = value;
        this.measurement = "A";

    }
}
