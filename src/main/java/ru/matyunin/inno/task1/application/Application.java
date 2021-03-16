package ru.matyunin.inno.task1.application;

import ru.matyunin.inno.task1.model.MathBox;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        MathBox<Number> mathBox = new MathBox<>(new Number[]{1.0, 10, 45, 1.21, 10.2, 10000, 2.3f, 153842L, 15, -15, 0});
        System.out.println("Объект: " + mathBox);
        Scanner scanner = new Scanner(System.in);

        int command = 0;
        while (command != 4) {
            System.out.println("Введите 1 для вызова метода получения суммы элементов, 2 для для удаления элемента, 3 для деления элементов, 4 для выхада");
            command = scanner.nextInt();
            scanner.nextLine();
            userCommand(mathBox, scanner, command);
        }
    }

    private static void userCommand(MathBox<Number> mathBox, Scanner scanner, int command) {
        switch (command) {
            case 1:
                System.out.println("сумма элементов " + mathBox.summator());
                break;
            case 2:
                System.out.println("Введите число(целое), которое хотите удалить");
                int dElement;
                dElement = scanner.nextInt();
                mathBox.del(dElement);
                System.out.println(mathBox);
                break;
            case 3:
                System.out.println("Введите делитель (целое число, не равное 0)");
                long divElement;
                divElement = scanner.nextLong();
                mathBox.div(divElement);
                System.out.println(mathBox);
                break;
        }
    }
}
