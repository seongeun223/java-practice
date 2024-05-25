package cafe;

public class Order {

    private String menuName;
    private String option;
    private int count;

    public Order (String menuName, String option, int count) {
        this.menuName = menuName;
        this.option = option;
        this.count = count;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getOption() {
        return option;
    }

    public int getCount() {
        return count;
    }
}
