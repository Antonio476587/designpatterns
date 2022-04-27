package barista;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    public CoffeeWithHook() { }

    public void brew() {
        System.out.print("Dripping coffee through filter\n");
    }
    
    public void addCondiments() {
        System.out.print("Adding sugar and milk\n");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        
        System.out.print("Would you like milk and sugar with your coffee (y/n)?");

        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.print("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
