package DesignPatterns.Decorator.withoutPattern;

public class Coffee extends Beverages{
    private double price = 100;
    public Coffee()
    {
//        this.price = price;
    }
    public void description(){
        System.out.println("This is a coffee beverage");
    }

    public double cost()
    {
        return this.price;
    }
}
