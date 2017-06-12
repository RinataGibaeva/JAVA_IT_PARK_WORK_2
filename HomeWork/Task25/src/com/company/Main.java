package com.company;
import java.util.Scanner;

public class Main {

    public static void sortAge(human []humans) {
        int min = humans[0].getAge();
        for (int i = 1; i < humans.length; i++) {
            if (humans[i].getAge() < min) {
                human humanCopy = new human(humans[i]);
                humans[i] = humans[i - 1];
                humans[i - 1] = humanCopy;
            }
        }
    }

    public static void sortHeight(human []humans) {
        int min = humans[0].getHeight();
        for (int i = 1; i < humans.length; i++) {
            if (humans[i].getHeight() < min) {
                human humanCopy = new human(humans[i]);
                humans[i] = humans[i - 1];
                humans[i - 1] = humanCopy;
            }
        }
    }

    public static void sortWeight(human []humans) {
        int min = humans[0].getWeight();
        for (int i = 1; i < humans.length; i++) {
            if (humans[i].getWeight() < min) {
                human humanCopy = new human(humans[i]);
                humans[i] = humans[i - 1];
                humans[i - 1] = humanCopy;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        human []humans = new human[2];

        for (int i = 0; i < humans.length; i++ ) {
            System.out.println("Введите имя");
            String name = scanner.next();

            System.out.println("Введите возраст");
            int age = scanner.nextInt();

            System.out.println("Введите пол");
            String sex = scanner.next();

            System.out.println("Введите рост");
            int height = scanner.nextInt();

            System.out.println("Введите вес");
            int weight = scanner.nextInt();

            humans[i] = new human(name, age, sex, height, weight);
        }

        System.out.println("Введите номер сортировки: ");
        int a = scanner.nextInt();

        if (a == 1) {
            sortAge(humans);
        }

        if (a == 2) {
            sortHeight(humans);
        }

        if (a == 3) {
            sortWeight(humans);
        }

        for (human human: humans) {
            System.out.print(human.getName() + ' ');
            System.out.print(human.getAge() + ' ');
            System.out.print(human.getSex() + ' ');
            System.out.print(human.getHeight() + ' ');
            System.out.println(human.getWeight() + ' ');

        }

    }
}
