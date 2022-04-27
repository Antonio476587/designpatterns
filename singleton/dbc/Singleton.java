public class Singleton{
    private static Singleton uniqueInstace;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstace == null) {
            synchronized (Singleton.class) {
                if (uniqueInstace == null) {
                    System.out.print("Creating unique instance of Chocolate Boiler");
                    uniqueInstace = new Singleton();
                }
            }
        }
		System.out.print("Returning instance of Chocolate Boiler");
        return uniqueInstace;
    }
}