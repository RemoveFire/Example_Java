import java.util.Scanner;

import static Unit03.Task1.*;
import static Unit03.Task2.*;

public class MainUnit03 {
    public static void main(String[] args) {
        System.out.println("\n\tЗадание 1.\n");
        System.out.println("""
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



        System.out.println("\n\tЗадание 2.\n");
        System.out.println("""
                Задан целочисленный список ArrayList.
                Найти минимальное, максимальное и среднее арифметическое из этого списка.""");
        System.out.println("\n\tРешение 'Задание 2': \n");


        System.out.print("Введите число, какого размера задать список: ");
        ASize = ScannerNumber();
        System.out.print("Введите число минимального значения массива: ");
        Min = ScannerNumber();
        System.out.print("Введите число максимального значения массива: ");
        Max = ScannerNumber();



        System.out.println("\n\t\u001B[31mОтвет:\u001B[0m ");
        InputArrayList(ASize,Min, Max);
        System.out.println("\n-----------");
    }

    private static int ScannerNumber() {
        int Temp;
        Scanner readL = new Scanner(System.in);
        Temp = readL.nextInt();
        return Temp;
    }
}
