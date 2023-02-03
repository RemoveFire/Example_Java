package Unit01;

public class Task1 {
    /**
     * Задание 1
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
