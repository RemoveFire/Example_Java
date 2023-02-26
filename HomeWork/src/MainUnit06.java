import java.io.IOException;
import java.util.Scanner;

import static Unit05.WavePro.*;
import static Unit05.WavePro.yellow;
import static java.awt.Color.cyan;
import static Unit06.Main.*;

public class MainUnit06 {
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
                \n1) Команда - "1" запускает выполнение задачи  № 1;
                1) Команда - "2" запускает выполнение задачи  № 2;
                3) Команда - "0" запускает выхода в предыдущее меню.
                                    
                Введите выбранную команду:""" + reset);

        int checkExit = 3;
        while (checkExit != 0) {
            checkExit = userIntegerInput("\nВведите номер команды. Для выхода в предыдущее меню нажмите 0.\nВвод: ");
            switch (checkExit) {
                case 1 -> {
                    System.out.println("\nВыполнение Задание №1 ... ");
                    MainNoteBook();
                }
                case 2 -> {
                    System.out.println("\nВыполнение Задание №2 ... ");
                    System.out.println("\nТут пусто. В уроке было только одна задача");
                }
            }
            System.out.println(yellow + "\nВыполненеие завершено." + reset);
        }
    }

    public static void getAllItems() { // Выводит текстом какие задачи есть
        System.out.println("\n\tЗадание 1.\n");
        System.out.println("""
                Урок 6. Хранение и обработка данных ч3: множество коллекций Set
                  1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
                      методы. Реализовать в java.
                  2. Создать множество ноутбуков (ArrayList).
                  3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
                      условиям. Например, спросить у пользователя минимальный размер оперативной
                       памяти или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию
                """);
    }

    public static void main(String[] args) throws IOException {
        int checkExit = 3;
        while (checkExit != 0) {
            System.out.println(cyan + """
                    \n
                    1) Команда - "1" запускает меню выбора задач;
                    2) Команда - "0" запускает выход и завершение программы.
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
                1) Команда - "1" запускает выполнение задачи  № 1;
                2) Команда - "0" запускает выход и завершение программы.
                                
                Введите выбранную команду:""");

    }
}
