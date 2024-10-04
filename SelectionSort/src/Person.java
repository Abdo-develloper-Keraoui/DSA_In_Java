
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name + " : " + this.age;
    }
}