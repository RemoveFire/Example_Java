package Unit06;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteBook {

        private final String reset = "\u001B[0m";
        private final String red = "\u001B[31m";
        private final String yellow = "\u001B[33m";
        private final String cyan = "\u001B[36m";

        private String Manufacturer;
        private String Model;
        private int Price;
        private int PriceNotDiscounted;
        private int Discount;
        private String Processor;
        private String DiscreteGraphicsCard;
        private String IntegratedGraphics;
        private String RamSize;
        private String SSD;
        private String Hdd;
        private String Screen;
        private String osType;
        private String Link;


        public NoteBook() {
        }

        public void printFullInfo(){            //  Метод выводит поля экземпляров
            System.out.println(yellow + "\n1. Производитель:  " + reset + Manufacturer);
            System.out.println(yellow + "2. Модель:  " + reset + Model);
            System.out.println(yellow + "3. Цена:  " + reset + Price);
            System.out.println(yellow + "4. Цена без скидки:  " + reset + PriceNotDiscounted);
            System.out.println(yellow + "5. Скидка:  " + reset + Discount);
            System.out.println(yellow + "6. Процессор:  " + reset + Processor);
            System.out.println(yellow + "7. Дискретная видеокарта:  " + reset + DiscreteGraphicsCard);
            System.out.println(yellow + "8. Встроенная видеокарта:  " + reset + IntegratedGraphics);
            System.out.println(yellow + "9. Оперативная память: " + reset + RamSize);
            System.out.println(yellow + "10. SSD: " + reset + SSD);
            System.out.println(yellow + "11. HDD: " + reset + Hdd);
            System.out.println(yellow + "12. Экран:  " + reset + Screen);
            System.out.println(yellow + "13. ОС:  " + reset + osType);
        }
}
