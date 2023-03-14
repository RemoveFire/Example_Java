package Work02.Unit04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * Задание 4
     * С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
     * Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
     * <p>
     * Например:
     * определить уровень приоритетов: низкий, средний, немедленное выполнение
     * выделить компоненту для хранения данных
     * выделить компоненту для организации импорта\экспорта данных
     * Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
     * данные хранятся в файле csv/jsom/xml
     * другие компоненты
     **/
    public static void mainTask04() throws IOException {

        // создал объект класса PrintPlaner
        // отвечает за форматирование файла csv и вывод в консоль планера
        PrintPlaner printPlaner = new PrintPlaner();
        ArrayList<String> planer = printPlaner.planerArrayList();
        ArrayList<String[]> planerSplite = printPlaner.planerSplite(planer);

        // создал объект класса PrintTaskInPlaner
        // отвечает за вывод задач определенного уровня
        PrintTaskInPlaner printTaskInPlaner = new PrintTaskInPlaner(planerSplite);

        // создал объект класса AddTask
        // отвечает за добавление задачи в csv файл
        AddTask addTask = new AddTask();

        // создал объект класса Talking
        // отвечает за прием данных от пользователя
        Talking ask = new Talking();

        Scanner in = new Scanner(System.in);

        // вывел на экран первый диалог
        ask.firstQuestion();

        // считал, что ввел пользователь
        int chois = in.nextInt();
        if (chois == 1) { // "1. Распечатать планер"
            printPlaner.printPlaner(planerSplite);
        } else if (chois == 2) { // "2. Вывести на экран задачи с определённым уровнем приоритета"

            // вопрос о том, какого уровня задачи нужно вывести
            ask.choisTask();
            int choisTask = in.nextInt();
            // запустил метод в классе PrintTaskInPlaner,
            // отвечающий за вывод зада определенного уровня
            printTaskInPlaner.printTask(choisTask);

        } else if (chois == 3) { // "3. Добавить задачу в планер"
            addTask.writeInPlaner();

        } else
            System.out.println("Выш выбор непонятен");
    }
}
