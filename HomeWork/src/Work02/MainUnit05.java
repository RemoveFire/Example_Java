package Work02;

import Work02.Unit05.Calculator.*;
import Work02.Unit05.PhoneBook.*;
import Work02.Unit05.InfoSystem.*;

import java.io.IOException;
import java.util.Scanner;



public class MainUnit05 {

    private static int userIntegerInput(String msg) {
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true) {
            System.out.print(msg);
            try {
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println(red + "Неверный ввод! Введите целое число!" + reset);
            }
        }
        return inputStr;
    }

    public static void itemSelect() throws IOException {  // Метод выбора по параметрам
        System.out.println(yellow + """
                \n1) Команда - "1" запускает выполнение Урок 5, задача № 1;
                2) Команда - "2" запускает выполнение Урок 5, задача  № 2;
                3) Команда - "3" запускает выполнение Урок 5, задача  № 3;
                4) Команда - "0" запускает выхода в предыдущее меню.
                                    
                Введите выбранную команду:""" + reset);

        int checkExit = 3;
        while (checkExit != 0) {
            checkExit = userIntegerInput("\nВведите номер команды. Для выхода в предыдущее меню нажмите 0.\nВвод: ");
            switch (checkExit) {
                case 1 -> {
                    System.out.println("\nВыполнение: Урок 5, Задание №1 ... ");
                    Calculator.mainCalculator();
                    CmplxNmbr.mainCmplxNmbr();
                    ComplexNum.mainComplexNum();

                }
                case 2 -> {
                    System.out.println("\nВыполнение: Урок 5, Задание №2 ... ");
                    //System.out.println("\nТут пусто. В уроке было только одна задача");
                    Main.mainPhoneBook();
                }
                case 3 -> {
                    System.out.println("\nВыполнение: Урок 5, Задание №3 ... ");
                    //System.out.println("\nТут пусто. В уроке было только одна задача");
                    Employee.EmployeeManagement();

                }
            }
            System.out.println(yellow + "\nВыполненеие завершено." + reset);
        }
    }

    public static void getAllItems() { // Выводит текстом какие задачи есть
        System.out.println(red + "\n\tUnit 5, Задание 1.\n" + reset);
        System.out.println("""
                Урок 5. От простого к практике
                
                    1. Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования.

                """);
        System.out.println(red + "\n\tUnit 5, Задание 2.\n" + reset);
        System.out.println("""
                Урок 5. От простого к практике
                
                    2. Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
                    под форматами понимаем структуру файлов, например:
                    - в файле на одной строке хранится одна часть записи, пустая строка - разделитель
                    
                """);
        System.out.println(red + "\n\tUnit 5, Задание 3.\n" + reset);
        System.out.println("""
                Урок 5. От простого к практике
               
                   3. Создать информационную систему позволяющую работать с сотрудниками некой компании \\ студентами вуза \\ учениками школы                
                """);
    }

    public static void main(String[] args) throws IOException {
        int checkExit = 3;
        while (checkExit != 0) {
            System.out.println(cyan + """
                    \n
                    1) Команда - "1" запускает меню с выбором выполнения задач;
                    2) Команда - "2" запускает отображение текста задач и их нумерацию;
                    3) Команда - "0" запускает выход и завершение программы.
                    """ + reset);
            checkExit = userIntegerInput("""
                    Введите номер действия. Для выхода нажмите 0. \nВвод:\s
                    """);
            switch (checkExit) {
                case 1 -> itemSelect();
                case 2 -> getAllItems();
            }
        }
        System.out.println("""
                1) Команда - "1" запускает меню с выбором выполнения задач;
                2) Команда - "2" запускает отображение текста задач и их нумерацию;
                3) Команда - "0" запускает выход и завершение программы.
                                
                Введите выбранную команду:""");

    }

    public static final String reset = "\u001B[0m";
    public static final String red = "\u001B[31m";
    public static final String yellow = "\u001B[33m";
    public static final String cyan = "\u001B[36m";
}

