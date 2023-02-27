package Work01.Unit04;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Task2 {
    /**
     * Задание 2
     * Пусть дан LinkedList с несколькими элементами.
     * Реализуйте метод, который вернет “перевернутый” список.
     */

    public static void LinkedList() {
        String str = Scanner();
        // Строка неизменна
        str = reverse(str);

        System.out.println("\nРеверс данной строки: \n" + str);
    }

    public static String reverse(String str) {
        // базовый случай: если строка нулевая или пустая
        if (str == null || str.equals("")) {
            return str;
        }
        // создаем пустой список символов
        List<Character> list = new ArrayList<>();
        // помещаем туда каждый символ заданной строки
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        // обратный список с использованием `java.util.Collections` `reverse()`
        Collections.reverse(list);
        // преобразовать `ArrayList` в строку с помощью `StringBuilder` и вернуть ее
        StringBuilder builder = new StringBuilder(list.size());
        for (Character c : list) {
            builder.append(c);
        }
        return builder.toString();
    }

    public static String Scanner() {
        InputStream is = Task2.class.getResourceAsStream("/Data/test.txt");
        assert is != null;
        BufferedReader file = new BufferedReader(new InputStreamReader(is));
//        File file = new File("/Data/test.txt");
        String line = null;
//        try {
        Scanner scanner = new Scanner(file);
        // обрабатываем файл пока в нем еще есть токен
        // в данном случае - есть ли новая строка
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            // печатаем построчно
            System.out.println(line);
        }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        return line;
    }
}
