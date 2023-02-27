package Work01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static Work01.Unit01.Task1.*;
import static Work01.Unit01.Task2.*;
import static Work01.Unit01.Task3.*;

public class MainUnit01 {

    public static void main(String[] args) {
        System.out.println("\n\tЗадание 1.\n");
        System.out.println("Задать одномерный массив и найти в нем минимальный и максимальный элементы.");
        System.out.println("\n\tРешение 'Задание 1': \n");

        int ASize = 20, Min = 1, Max = 99;
        int[] arr = FormArray(ASize, Min, Max);
        System.out.println("Задан массив: " + Arrays.toString(arr));
        System.out.printf("Наибольшее значение массива: %d. Наименьшее значение массива: %d.\n-----------", findMax(arr), findMin(arr));

        System.out.println("\n\tЗадание 2.\n");
        System.out.println("""
                Написать метод, который определяет, является ли введенный пользователем год високосным,\s
                и возвращает в консоль boolean (високосный - true, не високосный - false).\s
                Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.""");
        System.out.println("\n\tРешение 'Задание 2': \n");
        System.out.print("Введите год: ");
        int InputYear = ScannerNumber();
        System.out.println("Ответ: " + CheckLeapYear(InputYear) + "\n-----------");

        System.out.println("\n\tЗадание 3.\n");
        System.out.println("""
                Дан массив nums = [3,2,2,3] и число val = 3.
                Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
                Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
                а остальные - равны ему.""");
        System.out.println("\n\tРешение 'Задание 3': \n");

        System.out.println("Задайте размер массива (счет идет от 0): ");
        ASize = ScannerNumber();
        Min = 1;
        Max = 3;
        System.out.printf("Введите число, которое нужно переместить (%d-%d): ", Min, Max);
        int inputDigit = ScannerNumber();
        int[] arr3 = FormArray(ASize, Min, Max);
        System.out.println("Исходный массив: " + Arrays.toString(arr3) + "\n");
        System.out.println("Ответ: " + Arrays.toString(TransferringArrayElements(arr3, inputDigit)) + "\n-----------");
    }

    private static int[] FormArray(int ArraySize, int MinNumber, int MaxNumber) {
        Random rnd = new Random();
        int[] TempArr = new int[ArraySize + 1];
        for (int i = 0; i <= ArraySize; i++) {
            TempArr[i] = rnd.nextInt(MinNumber, MaxNumber + 1);
        }
        return TempArr;
    }

    private static int ScannerNumber() {
        int Temp;
        Scanner readL = new Scanner(System.in);
        Temp = readL.nextInt();
        return Temp;
    }
}
