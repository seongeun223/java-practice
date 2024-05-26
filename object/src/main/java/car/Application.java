package car;

public class Application {
    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("Tesla Model S");
        car.setYear(2022);
        car.setEngine("전기");

        System.out.println(car.getInfo());
    }
}
