package Work01.Unit03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    /**
     * Задание 2
     *  Задан целочисленный список ArrayList.
     *  Найти минимальное, максимальное и среднее арифметическое из этого списка.
     */
    public static void InputArrayList(int ArrSize, int Min, int Max) {
        ArrayList<Integer> ArrList = ListFromArray(ArrSize, Min, Max);
        System.out.printf("Сформирован список: \u001B[32m%s \u001B[0m\n", ArrList);
        double ArithmeticMean = 0;
        for (int elem : ArrList) {
            ArithmeticMean += elem;
        }
        ArithmeticMean = ArithmeticMean / ArrList.size();
        Collections.sort(ArrList);
        System.out.printf("""
                Max = \u001B[34m%s\u001B[0m,
                Min = \u001B[34m%s\u001B[0m,
                Avg = \u001B[34m%.2f\u001B[0m.
                """, ArrList.get(ArrList.size() - 1), ArrList.get(0), ArithmeticMean);
    }

    private static ArrayList<Integer> ListFromArray(int ArraySize, int MinNumber, int MaxNumber) {
        Random rnd = new Random();
        ArrayList<Integer> TempArrList = new ArrayList<>(ArraySize + 1);
        for (int i = 0; i <= ArraySize; i++) {
            TempArrList.add(rnd.nextInt(MinNumber, MaxNumber + 1));
        }
        return TempArrList;
    }
}
