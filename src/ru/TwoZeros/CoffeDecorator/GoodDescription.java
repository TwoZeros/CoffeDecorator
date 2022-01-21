package ru.TwoZeros.CoffeDecorator;

public class GoodDescription extends CondimentDecorator {
    public GoodDescription(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return "\n!------------------------\nСвежий " + beverage.getDescription() + " готов!\n------------------------\n";
    }
}
