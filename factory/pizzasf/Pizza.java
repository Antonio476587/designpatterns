import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.print("Making a " + name + " pizza\n");
        System.out.print("Tossing dough...\n");
        System.out.print("Adding sauce...\n");
        System.out.print("Adding toppings: \n");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.print("  " + toppings.get(i) + "\n");
        }
    }

    void bake() {
        System.out.print("Baking for 25 minutes at 350\n");
    }

    void cut() {
        System.out.print("Cutting the pizza into diagonal slices\n");
    }
    
    void box() {
        System.out.print("Place pizza in official PizzaStore box\n");
    }

    public String getName() {
        return name;
    }

}