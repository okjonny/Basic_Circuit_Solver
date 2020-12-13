// Jonny Palacios-Torres - 2020

package circuitAnalysis;

import circuitAnalysis.components.CurrentSource;
import circuitAnalysis.components.Resistor;
import circuitAnalysis.components.VoltageSource;

import java.util.HashMap;

/*
 * Graph representation of a simple circuit.
 */
public class CircuitGraph {

    // holds components for the 3 main elements
    public HashMap<String, CurrentSource> currentSourceMap;
    public HashMap<String, Resistor> resistorMap;
    public HashMap<String, VoltageSource> voltageSourceMap;

    /**
     * Default constructor for graph representation of a circuit
     */
    public CircuitGraph() {
        currentSourceMap = new HashMap<>();
        resistorMap = new HashMap<>();
        voltageSourceMap = new HashMap<>();
    }

    /**
     * Adds a new Vertex to this
     *
     * @param current - current source
     */
    public void addCurrentSource(CurrentSource current) {
        if (current == null)
            return;
        if (!currentSourceMap.containsKey(current.getName()))
            currentSourceMap.put(current.getName(), current);
    }

    /**
     * Adds a new Vertex to this
     *
     * @param voltage - voltage source
     */
    public void addVoltageSource(VoltageSource voltage) {
        if (voltage == null)
            return;
        if (!voltageSourceMap.containsKey(voltage.getName()))
            voltageSourceMap.put(voltage.getName(), voltage);
    }

    /**
     * Adds a new Vertex to this
     *
     * @param resistor - resistor component
     */
    public void addResistor(Resistor resistor) {
        if (resistor == null)
            return;
        if (!resistorMap.containsKey(resistor.getName()))
            resistorMap.put(resistor.getName(), resistor);
    }

    /*
     * Loop until original element is found, gather data, then display  missing information.
     *
     * For example - vs1 -> wire ->  rs1 -> wire -> vs1
     *
     * So, we save value of voltage of the loop in int - [vs1.getElementValue(), ...,n]
     * Same with resistors - [rs1.getElementValue(), ..., n]
     * Wires are  decorative backend but helpful to see with images for a user-friendly experience
     */

}
