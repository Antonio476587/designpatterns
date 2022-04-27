package barista;

abstract public class CaffeineBeverageWithHook {
    public CaffeineBeverageWithHook() { }

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCoup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.print("Boiling water\n");
    }

    void pourInCoup() {
        System.out.print("Pouring into cup\n");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
