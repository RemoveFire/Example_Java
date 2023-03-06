package Work02.Unit02;

public class Person {
    public String fullName;
    public int age;
    private String name;
    private String status;

    public Person(String fullName, int age, String name, String status) {
        this.fullName = fullName;
        this.age = age;
        this.name = name;
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void kisKis(String name) {
        System.out.println(name + " зовет кошку: кис-кис");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
