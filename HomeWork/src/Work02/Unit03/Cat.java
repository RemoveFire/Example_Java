package Work02.Unit03;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void catComeIn(String name){
        System.out.println("кошка " + name + " подходит и говорит: 'мяу'");
    }

    public void catComeOut(String name){
        System.out.println("кошка " + name + " не отозвалась");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
