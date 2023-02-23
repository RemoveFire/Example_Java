import java.util.Scanner;



public class MainUnit06 {
    public static String ReStr() {
        Scanner readL = new Scanner(System.in);
        return readL.next();
    }
    public static void main(String[] args){
        System.out.println("""
                1) Команда - "1" запускает выполнение задачи  № 1;
                2) Команда - "0" запускает выход и завершение программы.
                                
                Введите выбранную команду:""");
        String InputStringMain;
        while (true) {
            InputStringMain = ReStr();

            if (InputStringMain.equals("0")) {
                System.out.println("Выход");
                break;
            }

            /////////////////////////////////////////
            /////          ЗАДАЧА 1           ///////
            /////////////////////////////////////////

            if ((InputStringMain).equals("1")) {
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
                System.out.println("""
                        \n\t\u001B[31mРешение 'Задание 1':\u001B[0m \n
                        """);



                System.out.println("\n-----------\nВведите выбранную команду:");
            }
        }
    }
}
