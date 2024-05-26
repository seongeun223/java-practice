package car;

public class Car {

    private String model;
    private int year;
    private String engine;

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getInfo() {
        return this.model + "은 " + this.year + "년식이며 " + this.engine + "차이다.";
    }
}
