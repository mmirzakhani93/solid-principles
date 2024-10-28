package io.github.mmirzakhani93.solid.interfacesegregation.violated;

public class shape implements IShapeAreaCalculator {

    @Override
    public double calculateArea() {

        // some implementation

        return 0;
    }

    @Override
    public double calculateVolume() {

        // dummy implementation
        return 0;
    }
}
