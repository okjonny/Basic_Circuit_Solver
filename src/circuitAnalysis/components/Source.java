package circuitAnalysis.components;

import circuitAnalysis.Node;

import javax.swing.*;
import java.awt.image.BufferedImage;

/*
 * Power/Direct voltage source
 */
public class Source extends JPanel {
    private String name;
    private String measurement;
    private double value;

    public Source(String name, int value) {
        this.name = name;
        this.value = value;
        this.measurement = "V";
    }

    private BufferedImage image;

    public Source() {
    }

    @Override
    public String getName() {
        return name;
    }

   @Override
   public String toString(){
        return getName();
   }
}
