package Unit06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static Unit05.WavePro.*;
import static java.awt.Color.cyan;

public class Main {
    static String filename = "C:\\Users\\sivvi\\Java\\Example_Java\\HomeWork\\src\\Unit06\\notebooks_database.csv";
    static int itemQuant;
    static String property;
    static ArrayList<NoteBook> items = new ArrayList<>(itemQuant);

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

    private static String userStringInput(String msg) {
        String inputStr;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(msg);
            try {
                inputStr = sc.next();
                break;
            } catch (NumberFormatException e) {
                System.out.println(red + "Неверный ввод!" + reset);
            }
        }
        return inputStr;
    }

    public static void dbReader(String filename) throws IOException {       // Метод читает базу
        BufferedReader fp = new BufferedReader(new FileReader(filename));
        while (fp.readLine() != null) {
            itemQuant++;
        }

        fp = new BufferedReader(new FileReader(filename));
        for (int i = 0; i < itemQuant; i++) {
            items.add(new NoteBook());
        }

        String[] currStr;
        while (fp.ready()) {
            for (int i = 0; i < itemQuant; i++) {
                currStr =fp.readLine().split(",");
                items.get(i).setManufacturer(currStr[0]);
                items.get(i).setModel(currStr[1]);
                items.get(i).setPrice(Integer.parseInt(currStr[2]));
                items.get(i).setPriceNotDiscounted(Integer.parseInt(currStr[3]));
                items.get(i).setDiscount(Integer.parseInt(currStr[4]));
                items.get(i).setProcessor(currStr[5]);
                items.get(i).setDiscreteGraphicsCard(currStr[6]);
                items.get(i).setIntegratedGraphics(currStr[7]);
                items.get(i).setRamSize(currStr[8]);
                items.get(i).setSSD(currStr[9]);
                items.get(i).setHdd(currStr[10]);
                items.get(i).setScreen(currStr[11]);
                items.get(i).setOsType(currStr[12]);
                items.get(i).setLink(currStr[13]);
            }
        }
    }

    public static void itemSelect() {  // Метод выбора по параметрам
        System.out.println(yellow + """
                \n1. Производитель
                2. Модель
                3. Цена
                4. Цена без скидки
                5. Скидка
                6. Процессор
                7. Дискретная видеокарта
                8. Встроенная видеокарта
                9. Оперативная память
                10. SSD
                11. HDD
                12. Экран
                13. ОС
                14. Ссылка""" + reset);

        int checkExit = 15;
        while (checkExit != 0) {
            checkExit = userIntegerInput("\nВведите номер параметра для поиска. Для выхода в предыдущее меню нажмите 0. \n Ввод: ");
            switch (checkExit) {
                case 1 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getManufacturer(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 2 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getModel(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 3 -> {
                    property = String.valueOf(userIntegerInput("\nВведите значение параметра: "));
                    for (int i = 0; i < itemQuant; i++) {
                        if (items.get(i).getPrice() == Integer.parseInt(property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 4 -> {
                    property = String.valueOf(userIntegerInput("\nВведите значение параметра: "));
                    for (int i = 0; i < itemQuant; i++) {
                        if (items.get(i).getPriceNotDiscounted() == Integer.parseInt(property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 5 -> {
                    property = String.valueOf(userIntegerInput("\nВведите значение параметра: "));
                    for (int i = 0; i < itemQuant; i++) {
                        if (items.get(i).getDiscount() == Integer.parseInt(property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 6 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getProcessor(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 7 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getDiscreteGraphicsCard(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 8 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getIntegratedGraphics(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 9 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getRamSize(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 10 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getSSD(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 11 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getHdd(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 12 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getScreen(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 13 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getOsType(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
                case 14 -> {
                    property = userStringInput("\nВведите значение параметра: ");
                    for (int i = 0; i < itemQuant; i++) {
                        if (Objects.equals(items.get(i).getLink(), property)) {
                            items.get(i).printFullInfo();
                        }
                    }
                }
            }
            System.out.println(yellow + "\nПоиск завершен." + reset);
        }
    }

    public static void getAllItems() {    // Выводит все из базы
        for (int i = 0; i < itemQuant; i++) {
            items.get(i).printFullInfo();
        }
    }


    public static void MainNoteBook() throws IOException {
        dbReader(filename);

        int checkExit = 3;
        while (checkExit != 0) {
            System.out.println(cyan + """
                    \n1. Найти по параметру:\s
                    2. Вывести все ноутбуки:""" + reset);
            checkExit = userIntegerInput("\nВведите номер действия. Для выхода нажмите 0. \nВвод: ");
            switch (checkExit) {
                case 1 -> itemSelect();
                case 2 -> getAllItems();
            }
        }
    }
}
