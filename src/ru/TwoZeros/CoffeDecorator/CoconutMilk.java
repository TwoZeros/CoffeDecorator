package ru.TwoZeros.CoffeDecorator;

public class CoconutMilk extends CondimentDecorator {
    public CoconutMilk(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Кокосовое молоко";
    }

    @Override
    public double cost() {
        return beverage.cost() + 50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Кокосовое молоко";
    }
}
