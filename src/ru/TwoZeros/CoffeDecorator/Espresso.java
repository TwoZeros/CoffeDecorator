package ru.TwoZeros.CoffeDecorator;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double getPrise() {
        double prise = 0;
        switch (size) {
            case M:
                prise = 100;
                break;
            case L:
                prise = 150;
                break;
            case Xl:
                prise = 200;
                break;
        }
        return prise;
    }

    @Override
    public double cost() {
        return getPrise();
    }

}
