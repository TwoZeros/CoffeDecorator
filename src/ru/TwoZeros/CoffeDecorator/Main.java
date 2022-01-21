package ru.TwoZeros.CoffeDecorator;

public class Main {

    public static void main(String[] args) {
        Beverage latte = new LatteCofee();
        latte.setSize(Beverage.Size.Xl);
        latte = new CoconutMilk(latte);
        latte = new GoodDescription(latte);
        System.out.printf("%s\n с вас %.2f", latte.getDescription(), latte.cost());
    }
}
