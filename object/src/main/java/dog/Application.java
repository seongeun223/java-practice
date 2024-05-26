package dog;

public class Application {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("MAX");
        dog.setAge(5);
        dog.setKind("골든리트리버");

        System.out.println(dog.getInfo());
    }
}
