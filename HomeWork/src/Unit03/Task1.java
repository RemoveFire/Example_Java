package Unit03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Iterator;

public class Task1 {
    /**
     * Задание 1
     * Пусть дан произвольный список целых чисел,
     * удалить из него четные числа
     * (в языке уже есть что-то готовое для этого)
     */

    public static ArrayList<Integer> ListArray(int ArrSize, int Min, int Max) {
        ArrayList<Integer> ArrayListTask2 = ListFromArray(ArrSize, Min, Max);
        System.out.printf("Сформирован список: \u001B[32m%s\u001B[0m\n", ArrayListTask2);

        for (Iterator<Integer> iterator = ArrayListTask2.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println("В списке это число четное: " + number);
                iterator.remove();
            }
        }
        Collections.sort(ArrayListTask2);
        return ArrayListTask2;
    }

    public static void Iterator(int ArrSize, int Min, int Max) {
        ArrayList<Integer> tempList = ListFromArray(ArrSize, Min, Max);
        System.out.printf("Сформирован список: \u001B[32m%s \u001B[0m\n", tempList);
        tempList.removeIf(x -> x % 2 == 0);
        System.out.printf("После удаления чётных чисел: \u001B[34m%s \u001B[0m\n", tempList);
    }

    public static ArrayList<Integer> ListFromArray(int ArraySize, int MinNumber, int MaxNumber) {
        Random rnd = new Random();
        ArrayList<Integer> TempArrList = new ArrayList<>(ArraySize + 1);
        for (int i = 0; i <= ArraySize; i++) {
            TempArrList.add(rnd.nextInt(MinNumber, MaxNumber + 1));
        }
        return TempArrList;
    }

}
