package Work02.Unit05.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void mainCalculator() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите первое число: ");
            int n1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int n2 = scanner.nextInt();
            int sum = n1 + n2;
            int minus = n1 - n2;
            int multiply = n1 * n2;
            int divide = n1 / n2;
            int rnums = n1 % n2;
            System.out.printf("""
                    Результат суммы = %d
                    Результат вычитания = %d
                    Результат умножения = %d
                    Результат деления = %d
                    Остаток от деления = %d
                    \s""", sum, minus, multiply, divide, rnums);
        }
    }
}
