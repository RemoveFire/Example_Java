import static Unit05.WavePro.*;

import java.io.IOException;
import java.util.Scanner;


public class MainUnit05 {
    public static String ReStr() {
        Scanner readL = new Scanner(System.in);
        return readL.next();
    }
    public static void main(String[] args) throws IOException, InterruptedException {
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
                        Задача: Реализовать алгоритм волновой.
                        """);
                System.out.println("""
                        Вводите размер массива = 11
                        Вводите сам массив, где:\s
                            0 - проход;
                            1 - стена.
                        К примеру такой:\s
                        0 0 0 0 0 0 0 0 0 0 0
                        0 1 1 0 0 0 1 1 1 1 0
                        0 1 1 1 1 0 0 1 1 1 0
                        0 1 0 0 1 1 0 0 0 0 0
                        0 1 1 0 1 1 1 1 1 0 0
                        0 0 0 0 1 0 1 1 1 1 0
                        0 0 1 1 1 0 0 1 0 0 0
                        0 0 1 0 1 1 0 1 0 1 0
                        0 1 1 0 0 1 0 0 0 0 0
                        0 1 1 0 0 1 1 1 1 1 0
                        0 0 0 0 0 0 0 0 0 0 0
                        Вводите начальные корординаты с учетом -1 от фактического необходимого расположения:
                        Точка А [строка, столбец] = 3 2
                        Точка В [строка, столбец] = 5 5
                        \n\t\u001B[31mРешение 'Задание 1':\u001B[0m \n
                        """);
                WaveAlgoritm();
                System.out.println("\n-----------\nВведите выбранную команду:");
            }
        }
    }
}
