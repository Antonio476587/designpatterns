package barista;

public class Tea extends CaffeineBeverage {
    public Tea() { }

    public void brew() {
        System.out.print("Stepping the tea\n");
    }
    
    public void addCondiments() {
        System.out.print("Adding lemon\n");
    }
}
