package dog;

public class Dog {

    private String name;
    private int age;
    private String kind;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getInfo() {

        return "강아지의 이름은 " + this.name + "이고 " + this.age + "살이며 종은 " + this.kind + "이다.";
    }

}
