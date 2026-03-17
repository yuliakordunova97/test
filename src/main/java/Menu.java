public class Menu {
    private String name;
    private double price;

    public Menu(String name,double price ) {
        this.name = name;
        this.price=price;

    }
    public void setname(String name) throws MenunameException {
        if (name.equals(null) || name.isEmpty()) { // Перевірка на null або порожній рядок
            throw new MenunameException();
        }
        this.name = name;
    }


    public void setprice (double price) throws MenuException {
        if (price < 0 || price > 100)
            throw new MenuException();
    }

}