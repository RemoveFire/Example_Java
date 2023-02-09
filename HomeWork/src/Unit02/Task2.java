package Unit02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    /**
     * Задание 2
     * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
     * который запишет эту строку в простой текстовый файл, обработайте исключения.
     */
    public static void AppMainTask2(int InputNumber, String InputString, String FileName) {
        String AppPath = System.getProperty("user.dir").concat("/" + FileName + ".txt");
        ChekFile(AppPath, InputNumber, InputString);

    }

    public static void ChekFile(String AppPath, int InputNumber, String InputString) {
        File NewFile = new File(AppPath);
        if (NewFile.exists()) {
            if (NewFile.canWrite()) {
                System.out.println("Файл найден и может быть отредактирован.");
            } else {
                System.out.println("Файл найден, но к нему нет доступа.");
                System.exit(0);
            }
        } else {
            System.out.println("Файл не найден и будет создан.");
            try {
                if (NewFile.createNewFile()) {
                    System.out.println("Создан новый файл.");
                }
            } catch (Exception e) {
                System.out.printf("Возникла ошибка: %s", e);
                System.exit(0);
            }
        }
        // Первый способ
        Writer(AppPath, GenerateString(InputNumber, InputString).toString());
        // Второй способ
//        Writer(AppPath, GenerateString2(InputNumber, InputString));
    }

    //Первый способ
    private static StringBuilder GenerateString(int InputNumber, String InputString) {
        StringBuilder TEST = new StringBuilder(InputNumber * InputString.length());
        for (int i = 0; i < InputNumber; i += 1) {
            TEST.append(InputString);
        }
        return TEST;
    }

    // Второй способ
//    private static String GenerateString2(int InputNumber, String InputString) {
//        return InputString.repeat(InputNumber);
//
//    }

    private static void Writer(String AppPath, String InputString) {
        try (FileWriter FileOutput = new FileWriter(AppPath, false)) {
            FileOutput.write(InputString);
            FileOutput.flush();
            System.out.println("Данные записаны в файл :)");
        } catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();
        }
    }
}

