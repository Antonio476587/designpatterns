public class Singleton{
    private static Singleton uniqueInstace;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstace == null) {
            uniqueInstace = new Singleton();
        }
        return uniqueInstace;
    }
}