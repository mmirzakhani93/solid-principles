package io.github.mmirzakhani93.solid.interfacesegregation;

import io.github.mmirzakhani93.solid.openclosed.IAreaCalculator;

public class Cube implements IAreaCalculator, IVolumeCalculator {

    @Override
    public double calculateVolume() {

        // calculate volume

        return 0;
    }

    @Override
    public double area() {

        // calculate area

        return 0;
    }
}
