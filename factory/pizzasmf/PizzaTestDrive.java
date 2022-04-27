public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();

        nyPizzaStore.orderPizza("cheese");

        nyPizzaStore.orderPizza("veggie");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        chicagoPizzaStore.orderPizza("clam");
    }
}