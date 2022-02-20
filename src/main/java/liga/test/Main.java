package liga.test;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));

        System.out.println(coffeeMachine);

        while (true) {
            String temp = scanner.nextLine();
            int volume;

            if (temp.equalsIgnoreCase("turn off")) return;

            String[] strings = temp.split(" ");
            if (strings.length != 2) {
                System.out.println("Ведены некорректные данные. Попробуйте еще раз или завершите программу.");
                continue;
            }

            try {
                volume = Integer.parseInt(strings[1]);
            } catch (Exception e) {
                System.out.println("Ведены некорректные данные. Попробуйте еще раз или завершите программу.");
                continue;
            }

            if (strings[0].equalsIgnoreCase("water")) {
                coffeeMachine.addWater(volume);
            } else if (strings[0].equalsIgnoreCase("coffee")) {
                coffeeMachine.addCoffee(volume);
            } else if (strings[0].equalsIgnoreCase("milk")) {
                coffeeMachine.addMilk(volume);
            } else coffeeMachine.makeCoffee(strings[0], volume);
        }
    }
}
