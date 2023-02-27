package Work01.Unit02;

public class Task1 {
    /**
     * Задание 1
     * Напишите метод, который принимает на вход строку (String)
     * и определяет является ли строка палиндромом (возвращает boolean значение).
     */

//    public static boolean isPalindrome(String text) {
//        text = text.replaceAll("\\W","");//удаляем все ненужное
//        StringBuilder strBuilder = new StringBuilder(text);
//        strBuilder.reverse(); //переворачиваем строку
//        String invertedText = strBuilder.toString();//присваиваем перевернутую строку
//
//        return text.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра
//
//    }
    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse().toString());
    }

}
