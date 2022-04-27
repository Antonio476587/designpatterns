package barista;

public class Coffee extends CaffeineBeverage {
    public Coffee() {}

    public void brew() {
        System.out.print("Dripping coffee through filter\n");
    }
    
    public void addCondiments() {
        System.out.print("Adding sugar and milk\n");
    }
}
