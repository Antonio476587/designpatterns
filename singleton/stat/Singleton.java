public class Singleton{
    private static Singleton uniqueInstace = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
		System.out.print("Returning instance of Chocolate Boiler");
        return uniqueInstace;
    }
}