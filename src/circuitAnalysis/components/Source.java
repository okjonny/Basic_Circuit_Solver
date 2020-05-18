package circuitAnalysis.components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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


}
