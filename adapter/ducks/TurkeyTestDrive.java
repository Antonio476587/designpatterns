package ducks;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.print("\nThe duck says...\n");
        duck.quack();
        duck.fly();

        System.out.print("The turkey says...\n");
        testTurkey(turkey);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);

    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
