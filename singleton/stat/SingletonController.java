public class SingletonController {
    public static void main(String args[]) {
        Singleton single = Singleton.getInstance();

        Singleton single2 = Singleton.getInstance();
    }
}