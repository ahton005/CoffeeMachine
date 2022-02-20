package liga.test;

public class Coffee {
    private String name;
    private int coffee;
    private int water;
    private int milk;

    public Coffee(String name, int coffee, int water, int milk) {
        this.name = name;
        this.coffee = coffee;
        this.water = water;
        this.milk = milk;
    }

    public String getName() {
        return name;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }
}
