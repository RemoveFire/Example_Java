import java.util.Scanner;

import static Unit03.Task2.InputArrayList;
import static Unit04.Task1.*;

public class MainUnit04 {
    public static void main(String[] args) {
        System.out.println("""
                1) Команда - "1" запускает выполнение задачи  № 1;
                2) Команда - "2" запускает выполнение задачи  № 2;
                3) Команда - "Exit" запускает выход и завершение программы.
                
                Введите выбранную команду:""");
        String InputStringMain;
        while (true) {
            InputStringMain = ReStr();

            if (InputStringMain.equalsIgnoreCase("Exit")) {
                System.out.println("Выход");
                break;
            }
            // Вызов функции с вызовом метода из 3 юнита 1 задачей
            if ((InputStringMain).equals("1")) {
                System.out.println("\n\tЗадание 1.\n");
                System.out.println("""
                        Реализовать консольное приложение, которое:
                             Принимает от пользователя и “запоминает” строки.
                             Если введено print, выводит строки так, чтобы последняя введенная была
                                первой в списке, а первая - последней.
                             Если введено revert, удаляет предыдущую введенную строку из памяти.
                        \n\t\u001B[31mРешение 'Задание 1':\u001B[0m \n""");

                System.out.println("""
                        1) Введите в строку через Enter любые слова, цифры - для сохранения;
                        2) Команда - "Print" выводит список сохраненных строк;
                        3) Команда - "Revert" удаляет последнюю введённую строку;
                        4) Команда - "U3T1" запускает выполнение задачи № 1 в двух вариантах;
                        5) Команда - "U3T2" запускает выполнение задачи  № 2;
                        6) Команда - "Exit" запускает выход и завершение программы.
                        
                        Введите выбранную команду:""");
                RealizationFunction();
                System.out.println("\n-----------\nВведите выбранную команду:");
            }
            // Вызов функции с вызовом метода из 3 юнита 2 задачей
            if ((InputStringMain).equals("2")) {
                System.out.println("\n\tЗадание 2.\n");
                System.out.println("""
                        Пусть дан LinkedList с несколькими элементами.
                        Реализуйте метод, который вернет “перевернутый” список.
                        \n\tРешение 'Задание 2': \n""");

                /////////////////////////////////////////
                /////          ЗАДАЧА 2           ///////
                /////////////////////////////////////////

                System.out.println("\n\tЗадание 2.\n");
                System.out.println("""
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
                InputArrayList(ASize, Min, Max);
                System.out.println("\n-----------\nВведите выбранную команду:");
            }
        }
    }

//    private static int ScannerNumber() {
//        int Temp;
//        Scanner readL = new Scanner(System.in);
//        Temp = readL.nextInt();
//        return Temp;
//    }

//    private static String ReStr() {
//        Scanner readL = new Scanner(System.in);
//        return readL.next();
//    }
}
