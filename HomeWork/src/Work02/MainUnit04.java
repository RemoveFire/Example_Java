package Work02;

import java.io.IOException;
import java.util.Scanner;


import static Work02.Unit04.Main.*;

public class MainUnit04 {

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
                \n1) Команда - "1" запускает выполнение Урок 4, задача № 1;
                1) Команда - "2" запускает выполнение Урок ?, задача  № ?;
                3) Команда - "0" запускает выхода в предыдущее меню.
                                    
                Введите выбранную команду:""" + reset);

        int checkExit = 3;
        while (checkExit != 0) {
            checkExit = userIntegerInput("\nВведите номер команды. Для выхода в предыдущее меню нажмите 0.\nВвод: ");
            switch (checkExit) {
                case 1 -> {
                    System.out.println("\nВыполнение: Урок 4, Задание №1 ... ");
                    mainTask04();
                }
                case 2 -> {
                    //System.out.println("\nВыполнение: Урок 2, Задание №2 ... ");
                    System.out.println("\nТут пусто. В уроке было только одна задача");

                }
            }
            System.out.println(yellow + "\nВыполненеие завершено." + reset);
        }
    }

    public static void getAllItems() { // Выводит текстом какие задачи есть
        System.out.println(red + "\n\tUnit 4, Задание 1.\n" + reset);
        System.out.println("""
                Урок 4. ООП: Обобщения. ч1
                    С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
                    Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
                    
                    Например:
                    определить уровень приоритетов: низкий, средний, немедленное выполнение
                    выделить компоненту для хранения данных
                    выделить компоненту для организации импорта\\экспорта данных
                    Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
                    данные хранятся в файле csv/jsom/xml
                    другие компоненты
                """);
        System.out.println(red + "\n\tUnit ?, Задание ?.\n" + reset);
        System.out.println("""
                Условие задачи пустое.
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
