package DesignPatterns.Decorator.withoutPattern;

public class Main {
    public static void main(String[] args)
    {
        Coffee c = new Coffee();
        Tea t = new Tea();
        c.description();
        System.out.println("This coffee will cost you: "+c.cost() + "$");
    }
}
