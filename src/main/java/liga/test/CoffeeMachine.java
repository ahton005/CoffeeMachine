package liga.test;

import java.util.ArrayList;

public class CoffeeMachine {

    private static ArrayList<Coffee> coffees = new ArrayList<>() {{
        add(new Coffee("ristretto", 50, 50, 0));
        add(new Coffee("espresso", 30, 70, 0));
        add(new Coffee("lungo", 15, 85, 0));
        add(new Coffee("cappuccino", 15, 40, 45));
        add(new Coffee("latte", 10, 30, 60));
    }};
    private int coffeeVolume;
    private int waterVolume;
    private int milkVolume;

    public CoffeeMachine(int coffeeVolume, int waterVolume, int milkVolume) {
        this.coffeeVolume = coffeeVolume;
        this.waterVolume = waterVolume;
        this.milkVolume = milkVolume;
    }

    public CoffeeMachine() {
    }

    @Override
    public String toString() {
        return "Кофе = " + coffeeVolume +
                " мл, Вода = " + waterVolume +
                " мл, Молоко = " + milkVolume + " мл.";
    }

    public void addCoffee(int n) {
        if (n > 0) {
            coffeeVolume += n;
            System.out.println(this);
        }
    }

    public void addWater(int n) {
        if (n > 0) {
            waterVolume += n;
            System.out.println(this);
        }
    }

    public void addMilk(int n) {
        if (n > 0) {
            milkVolume += n;
            System.out.println(this);
        }
    }

    public void makeCoffee(String type, int volume) {
        if (volume < 10) {
            System.out.println("Минимальный объем кофе 10 мл");
            return;
        }
        for (Coffee c : coffees) {
            int cf, wt, ml;
            if (c.getName().equalsIgnoreCase(type)) {
                if ((cf = c.getCoffee() * volume / 100) > coffeeVolume) {
                    System.out.println("Недостаточно кофе. Добавьте кофе и попробуйте еще раз или завершите программу.");
                    return;
                } else if ((wt = c.getWater() * volume / 100) > waterVolume) {
                    System.out.println("Недостаточно воды. Добавьте воды и попробуйте еще раз или завершите программу.");
                    return;
                } else if ((ml = c.getMilk() * volume / 100) > milkVolume) {
                    System.out.println("Недостаточно молока. Добавьте молока и попробуйте еще раз или завершите программу.");
                    return;
                } else {
                    coffeeVolume -= cf;
                    waterVolume -= wt;
                    milkVolume -= ml;
                    System.out.println("Ваш кофе готов. Приятного аппетита :)");
                    System.out.println(this);
                    return;
                }
            }
        }
        System.out.println("Ведены некорректные данные. Попробуйте еще раз или завершите программу.");
        return;
    }
}
