public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook(" Anna", "Melnyk", "cooking", "5 years", 100, 70);
        Waiter waiter = new Waiter("Bogdan", "Kholod", "accept order", "2 years", 1000, 7);
        Administrator administrator = new Administrator("Nastya", "Kholod", "solves organizational issues", "8 years", 10000, 2);
        System.out.println("The cook earns:" + cook.salaryCalculation());
        System.out.println("The waiter earns:" + waiter.salaryCalculation());
        System.out.println("The administrator earns:" + administrator.salaryCalculation());
        cook.performanceOfwork();
        waiter.performanceOfwork();
        administrator.performanceOfwork();
        cook.aboutExperience();
        waiter.aboutExperience();
        administrator.aboutExperience();

        Menu menu1 = new Menu("Борщ", 80);
        Menu menu2 = new Menu("Вареники", 60);
        Menu menu3 = new Menu("Салат ", 50);

        Customer customer1 = new Customer("Роман");


        customer1.addToOrder(menu1);
        customer1.addToOrder(menu2);
        customer1.addToOrder(menu3);


        System.out.println(customer1);

        Menu menu=new Menu("Бургер",200);
        try {
            menu.setprice(-45);
        }catch (MenuException xx){
            System.err.println(xx.getMessage());
        }

        Menu men=new Menu("",150);
        try {
            men.setname("");
        }catch (MenunameException ee){
            System.err.println(ee.getMessage());


        }



    }
}

