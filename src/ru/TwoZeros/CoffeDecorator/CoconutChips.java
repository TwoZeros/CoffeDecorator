package ru.TwoZeros.CoffeDecorator;

public class CoconutChips extends CondimentDecorator {
    public CoconutChips(Beverage beverage) {
        this.description = "Кокосовая стружка";
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Кокосовая стружка";
    }
}
