package Unit06;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteBook ChuwiAH401 = new NoteBook("Chuwi", "AH-401", "Black", 15.6, "LCD", 8, 256, "SSD");
        NoteBook SamsungS101 = new NoteBook("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "SSD");
        NoteBook SamsungS150 = new NoteBook("Samsung", "S-150", "Green", 17.0, "TFT", 16, 512, "SSD");
        NoteBook AsusTUF504 = new NoteBook("ASUS", "TUF-504", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0");
        NoteBook AsusTUF555 = new NoteBook("ASUS", "TUF-555", "White", 15.6, "TFT", 16, 1024, "SSD");

        List<NoteBook> NoteBookList = List.of(ChuwiAH401, SamsungS101, SamsungS150, AsusTUF504, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (NoteBook color : NoteBookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2){
            for (NoteBook brand : NoteBookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();


    }
}
