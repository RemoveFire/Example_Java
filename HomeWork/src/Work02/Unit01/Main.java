package Work02.Unit01;

public class Main {
    /**
     * Задание 1
     * Реализовать, с учетом ооп подхода, приложение
     * Для проведения исследований с генеалогическим древом.
     * Идея: описать некоторое количество компонент, например:
     * - модель человека
     * - компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать
     * и про разные отношения
     * - компонент для проведения исследований
     * - дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл,
     * <p>
     * получение\построение отдельных моделей человека.
     * Под “проведением исследования” можно понимать получение всех детей выбранного человека.
     * * на первом этапе сложно применять сразу все концепты ООП, упор делается на инкапсуляцию.
     * Если получится продумать иерархию каких-то компонент - здорово. После первой лекции,
     * они не знают про абстракцию и интерфейсы
     * <p>
     * Продумать какие проблемы могут возникнуть в том, коде, который они написали.
     * Например, с генеалогическим древом, мы можем знать о двух людях, но не знаем в каких “отношениях” они были -
     * двоюродные или троюродные, или мы точно знаем как звали прапрабабушку, но совершенно не знаем прабабушку -
     * как хранить такие связи или что будет если в компоненту обхода передать ссылку на null-дерево.
     **/
    public static void MainTask() {
        Person irina = new Person("Ирина", 56);
        Person igor = new Person("Игорь", 60);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 27);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Tree gt = new Tree();
        gt.appendPerentsChild(irina, vasya); // Ирина родитель Васи
        gt.appendPerentsChild(irina, masha); // Ирина родитель Маши
        gt.appendPerentsChild(vasya, jane); // Вася родитель Жени
        gt.appendPerentsChild(vasya, ivan); // Вася родитель Ивана
        gt.appendWifeHusband(irina, igor); // Ирина жена Игоря
        gt.appendPerentsChild(igor, vasya); // Игорь родитель Васи
        gt.appendPerentsChild(igor, masha); // Игорь родитель Маши

        // Поиск детей Ирины
        System.out.println("Дети Ирины: ");
        System.out.println(new Research(gt).spend(irina, Relationship.parents));

        // Поиск детей Игоря
        System.out.println("Дети Игоря: ");
        System.out.println(new Research(gt).spend(igor, Relationship.parents));

        // Поиск мужа Ирины
        System.out.println("Муж Ирины: ");
        System.out.println(new Research(gt).spend(irina, Relationship.wife));

        // Поиск определенного возраста
        System.out.println(new Research(gt).searchAge());
    }
}
