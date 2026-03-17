import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Menu> order;

    public Customer(String name) {
        this.name = name;
        this.order = new ArrayList<>();
    }

    public void addToOrder(Menu menuItem) {

        order.add(menuItem);
    }

    public List<Menu> getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Замовник: " + name + ", Замовлення: " + order;
    }
}