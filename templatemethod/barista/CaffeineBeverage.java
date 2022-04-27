package barista;

abstract public class CaffeineBeverage {
    public CaffeineBeverage() {
    }

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCoup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.print("Boiling water\n");
    }

    public void pourInCoup() {
        System.out.print("Pouring into cup\n");
    }

}
