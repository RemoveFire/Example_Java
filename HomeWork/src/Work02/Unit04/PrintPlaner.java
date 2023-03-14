package Work02.Unit04;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintPlaner {

    ArrayList<String> planer = new ArrayList<>();
    ArrayList<String[]> planerSplite = new ArrayList<>();
    private Scanner file;

    public PrintPlaner() {

    }

    // метод переброса csv файла в ArrayList
    public ArrayList<String> planerArrayList() throws IOException {
        FileReader inFile = new FileReader("C:\\Users\\sivvi\\Java\\Example_Java\\HomeWork\\src\\Work02\\Unit04\\Data\\planer.csv");
        file = new Scanner(inFile);

        while (file.hasNextLine()) {
            String line = file.nextLine();
            planer.add(line);
        }

        return planer;

    }

    // метод преобразования базы из ArrayList<String> в ArrayList <String[]>
    public ArrayList<String[]> planerSplite(ArrayList<String> planer) {
        for (String element : planer) {

            String[] lineTemp = element.split(";");
            planerSplite.add(lineTemp);

        }
        return planerSplite;
    }

    // метод печати планера
    public void printPlaner(ArrayList<String[]> planerSplite) {
        for (String[] element : planerSplite) {

            for (int i = 0; i < element.length; i++) {
                System.out.print(element[i] + " ");
            }
            System.out.print("\n");
        }
    }
}
