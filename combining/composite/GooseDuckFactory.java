package composite;

public class GooseDuckFactory extends AbstractGooseDuckFactory {
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
