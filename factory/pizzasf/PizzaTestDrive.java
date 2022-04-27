public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = chicagoStore.orderPizza("cheese");
        System.out.print("Joel ordered" + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("cheese");
        System.out.print("Ethan ordered " + pizza.getName() + "\n");
    }
}