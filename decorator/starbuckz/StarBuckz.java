public class StarBuckz {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.print(beverage.getDescription() + "$" +
        beverage.cost() + "\n");

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.print(beverage2.getDescription() + "$" +
        beverage2.cost() + "\n");

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.print(beverage3.getDescription() + "$" +
        beverage3.cost() + "\n");
    }
}