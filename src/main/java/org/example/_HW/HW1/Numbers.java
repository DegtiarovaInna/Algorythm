package org.example._HW.HW1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();


        double sum = number1 + number2 + number3;
            System.out.println("Сумма чисел: " + sum);

    }
}
