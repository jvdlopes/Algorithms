
package InsertRemove;

import java.util.ArrayList;


public class FruitExampleArrayList {

    static ArrayList<String> fruit = new ArrayList();
    public static void main(String[] args) {
        fruit.add("Apple");
        fruit.add("Cherry");
        fruit.add("Mango");
        fruit.add("Pear");
        
        System.out.println("I have " + fruit.size() + " fruits");
        
        for (String f: fruit) {
            System.out.println(f);
        }
        
        System.out.println("The first fruit is " + fruit.get(0));
        System.out.println("Changing apple to avacado");
        fruit.set(0, "Avacado");
        
        System.out.println("Adding Banana to location 1:");
        fruit.add(1, "Banana");
        
        System.out.println("Taking out Mango");
        fruit.remove(3);
        
        System.out.println("-----------------");
        
        for (String f : fruit) {
            System.out.println(f);
        }
    }
    
}
