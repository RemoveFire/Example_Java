package Work02.Unit03;

import java.util.ArrayList;

import static Work02.Unit03.Printer.*;

public class Main {
    /**
     * Задание 2
     * Используйте предыдущие задачи из прошлого домашнего задания. Необходимо гарантированно продумать иерархию компонент
     * и взаимодействия их между собой.
     * Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
     * конкретным экземпляром генеалогического древа, а с интерфейсом “генеалогическое древо”
     * <p>
     * Продумать возможность ухода от конкретных "котиков", к интерфейсу “котик”, лучше уйти от взаимодействия
     * с конкретными питомцами и повысить уровень абстракции до взаимодействия с котиком, собачкой или хомяком т е
     * с интерфейсом “животное”
     **/

    public static void mainTask02(){ // для удобства выведенно отдельно
        System.out.print("\n");
        System.out.print("\n");
        Person person = new Person("Андрей", 18,"Андрей","owner");
        Person person2 = new Person("Петр", 20, "Пётр","no owner");
        Cat cat = new Cat("Мурзик");
        Call call = new Call(person, cat);
        call.call();

        System.out.print("\n");
        Call call2 = new Call(person2, cat);
        call2.call();
    }
    public static void mainTask01() {
        Person irina = new Person("Ирина", 56, "Ирина", "parents");
        Person igor = new Person("Игорь", 60, "Игорь", "parents");
        Person viktor = new Person("Виктор", 26, "Виктор", "parents");
        Person tatyana = new Person("Татьяна", 27, "Татьяна", "parents");
        Person vasya = new Person("Вася", 30, "Вася", "parents");
        Person masha = new Person("Маша", 27, "Маша", "child");
        Person jane = new Person("Женя", 10, "Женя", "child");
        Person ivan = new Person("Ваня", 8, "Ваня", "child");
        Person sasha = new Person("Саша", 3, "Саша", "child");
        Tree gt = new Tree();
        gt.appendPerentsChild(irina, vasya); // Ирина родитель Васи
        gt.appendPerentsChild(irina, masha); // Ирина родитель Маши
        gt.appendPerentsChild(vasya, jane); // Вася родитель Жени
        gt.appendPerentsChild(vasya, ivan); // Вася родитель Ивана
        gt.appendWifeHusband(irina, igor); // Ирина жена Игоря
        gt.appendPerentsChild(igor, vasya); // Игорь родитель Васи
        gt.appendPerentsChild(igor, masha); // Игорь родитель Маши
        gt.appendWifeHusband(tatyana, viktor); // Татьяна жена Виктора
        gt.appendPerentsChild(viktor, sasha); // Виктор родитель Саши
        gt.appendPerentsChild(tatyana,sasha); // Татьяна родитель Саши


        // Поиск детей Ирины
        System.out.println("Дети Ирины: ");
        ArrayList<String> childIrina = new Research(gt).spend(irina, Relationship.parents);
        printchildsRelInfo(String.valueOf(childIrina));
        // Поиск детей Игоря
        System.out.println("Дети Игоря: ");
        ArrayList<String> childIgor = new Research(gt).spend(igor, Relationship.parents);
        printchildsRelInfo(String.valueOf(childIgor));
        // Поиск мужа Ирины
        System.out.println("Муж Ирины: ");
        ArrayList<String> husbandIrina = new Research(gt).spend(irina, Relationship.wife);
        printGetPopulationInfo(String.valueOf(husbandIrina));
        System.out.println("Дети Татьяны: ");
        ArrayList<String> childTatina = new Research(gt).spend(tatyana, Relationship.parents);
        printchildsRelInfo(String.valueOf(childTatina));
        System.out.println("Дети Виктора: ");
        ArrayList<String> childViktor = new Research(gt).spend(viktor, Relationship.parents);
        printchildsRelInfo(String.valueOf(childViktor));

        System.out.println("Муж Татьяны: ");
        ArrayList<String> husbandTatina = new Research(gt).spend(tatyana, Relationship.wife);
        printGetPopulationInfo(String.valueOf(husbandTatina));
        // Поиск определенного возраста
        System.out.println(new Research(gt).searchAge());

    }
}
