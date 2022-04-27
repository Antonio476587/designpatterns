package poo.strategy.duck;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.print("<< Silence >>\n");
    }
}