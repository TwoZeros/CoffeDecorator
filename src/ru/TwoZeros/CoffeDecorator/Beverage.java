package ru.TwoZeros.CoffeDecorator;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public enum Size {Xl, L, M}

    
    Size size = Size.L;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
