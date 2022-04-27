package observer;

public class RedHeadDuck implements Quackable {
    Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.print("Quack!\n");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
