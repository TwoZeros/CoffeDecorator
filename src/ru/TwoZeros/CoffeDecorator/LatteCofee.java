package ru.TwoZeros.CoffeDecorator;

public class LatteCofee extends Beverage {
    public LatteCofee() {
        this.description = "Лате";
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
    public String getDescription() {
        return super.getDescription() + " Размером " + size.toString();
    }

    @Override
    public double cost() {
        return getPrise();
    }

}
