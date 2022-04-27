package ducks;

import java.util.Random;

public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        this.rand = new Random();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
		if (rand.nextInt(5) == 0) {
            duck.fly();
       }
       System.out.print("rand nextInt(5) is equal to:" + rand.nextInt(5));
    }
}
