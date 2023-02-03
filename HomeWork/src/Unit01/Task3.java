package Unit01;


public class Task3 {
    /**
     * Задание 3
     * Дан массив nums = [3,2,2,3] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
     * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
     * а остальные - равны ему.
     */
    public static int[] TransferringArrayElements(int[] TempArr, int Input) {
        int Left = 0, Right = TempArr.length - 1, Temp;
        while (Left < Right) {
            if (TempArr[Left] != Input) {
                Left++;
            }
            if (TempArr[Right] == Input) {
                Right--;
            }
            if (TempArr[Left] == Input && TempArr[Right] != Input) {
                Temp = TempArr[Right];
                TempArr[Right] = TempArr[Left];
                TempArr[Left] = Temp;
                Left++;
                Right--;
            }
        }
        return TempArr;
    }
}
