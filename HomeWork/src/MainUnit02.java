import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static Unit02.Task1.*;
import static Unit02.Task2.*;

public class MainUnit02 {
    public static void main(String[] args) {
        System.out.println("\n\tЗадание 1.\n");
        System.out.println("""
                Напишите метод, который принимает на вход строку (String) и\s
                определяет является ли строка палиндромом (возвращает boolean значение).""");
        System.out.println("\n\tРешение 'Задание 1': \n");

        System.out.print("Введите строку на проверку палиндрома: ");
        char[] InString = ReStr().toLowerCase().toCharArray();


        if (isPalindrome(Arrays.toString(InString))) {
            System.out.println("Строка является палиндромом\n-----------");
        } else {
            System.out.println("Строка не является палиндромом\n-----------");
        }

        System.out.println("\n\tЗадание 2.\n");
        System.out.println("""
                Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
                который запишет эту строку в простой текстовый файл, обработайте исключения.""");
        System.out.println("\n\tРешение 'Задание 2': \n");


        System.out.println("Введите слово, которое хотите записать в файл: ");
        String InputString = ReStr();
        System.out.printf("Введите сколько нужно повторить слово %s раз: ",  InputString);
        int InputNumber = Integer.parseInt(ReStr());
        System.out.println("Введите название файла (без .txt и т.п. формата файла): ");
        String FileName = ReStr();



        System.out.println("Решение: ");
        AppMainTask2(InputNumber, InputString, FileName);
        System.out.println("\n-----------");
    }

    private static String ReStr() {
        Scanner readL = new Scanner(System.in);
        return readL.next();
    }
}
