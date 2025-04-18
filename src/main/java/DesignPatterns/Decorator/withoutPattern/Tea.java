package DesignPatterns.Decorator.withoutPattern;

public class Tea extends Beverages{
    private double price  = 40;
    @Override
    public void description() {
        System.out.println("This is a Tea!!!");
    }

    @Override
    double cost() {
        return price;
    }
}
