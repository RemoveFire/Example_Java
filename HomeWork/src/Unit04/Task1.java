package Unit04;


import java.util.*;

import static Unit03.Task1.*;
import static Unit03.Task2.*;

public class Task1 {
    /**
     * Задание 1
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя и “запоминает” строки.
     * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * Если введено revert, удаляет предыдущую введенную строку из памяти.
     */

    public static void RealizationFunction() {

        ArrayDeque<String> InputMessage = new ArrayDeque<>();
        String InputString;
        while (true) {
            InputString = ReStr();

            if (InputString.equalsIgnoreCase("Exit")) {
                System.out.println("Выход");
                break;
            }
            // Вызов функции с вызовом метода из 3 юнита 1 задачей
            if ((InputString).equals("U3T1")){
                Unit3Task1();
            }
            // Вызов функции с вызовом метода из 3 юнита 2 задачей
            if ((InputString).equals("U3T2")){
                Unit3Task2();
            }

            if (InputString.equals("Print")) {
                System.out.println(InputMessage);
            } else if (InputString.equals("Revert")) {
                InputMessage.removeFirst();
            } else {
                InputMessage.addFirst(InputString);
            }
        }
    }

    private static void Unit3Task1(){
        System.out.println("""
                Запуск Unit 3, Task 1
                
                Пусть дан произвольный список целых чисел,
                удалить из него четные числа
                (в языке уже есть что-то готовое для этого).""");
        System.out.println("\n\tРешение 'Задание 1': \n");
        System.out.print("Введите число, какого размера задать список: ");
        int ASize = ScannerNumber();
        System.out.print("Введите число минимального значения массива: ");
        int Min = ScannerNumber();
        System.out.print("Введите число максимального значения массива: ");
        int Max = ScannerNumber();

        System.out.println("\n\t\u001B[31mРешение 1 (через итератор):\u001B[0m ");
        System.out.printf("Отсортированный список (удалены четные числа): " +
                "\u001B[34m%s\u001B[0m\n", ListArray(ASize,Min, Max));
        System.out.println("\n\t\u001B[31mРешение 2 (встроенное в язык):\u001B[0m ");
        NoIterator(ASize,Min, Max);
        System.out.println("\n-----------");
    }

    private static void Unit3Task2(){
        System.out.println("""
                Запуск Unit 3, Task 2
                
                Задан целочисленный список ArrayList.
                Найти минимальное, максимальное и среднее арифметическое из этого списка.""");
        System.out.println("\n\tРешение 'Задание 2': \n");
        System.out.print("Введите число, какого размера задать список: ");
        int ASize = ScannerNumber();
        System.out.print("Введите число минимального значения массива: ");
        int Min = ScannerNumber();
        System.out.print("Введите число максимального значения массива: ");
        int Max = ScannerNumber();

        System.out.println("\n\t\u001B[31mОтвет:\u001B[0m ");
        InputArrayList(ASize,Min, Max);
        System.out.println("\n-----------");
    }

    public static String ReStr() {
        Scanner readL = new Scanner(System.in);
        return readL.next();
    }

    public static int ScannerNumber() {
        int Temp;
        Scanner readL = new Scanner(System.in);
        Temp = readL.nextInt();
        return Temp;
    }
}

