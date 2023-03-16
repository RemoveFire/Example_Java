package Work02.Unit05.PhoneBook;

import java.util.Scanner;

public class Menu {
    public static void mainMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Отобразить справочник");
        System.out.println("2 - Выгрузить данные");
        System.out.println("3 - Загрузить данные");

        System.out.println(". ".repeat(15));
        System.out.println("Выберите действие: ");

        int input=in.nextInt();
        Filemanager run=new Filemanager();
        Adressbook phones=new Adressbook();
        phones.Adressbook();

        switch(input){
            case 1:
                phones.showAddressBook();
                break;
            case 2:
                run.ExportFile(phones.pb);
                System.out.println("Export finish");
                break;
            case 3:
                run.ImportFile(phones.pb);
                phones.showAddressBook();
                break;


        }
    }
}