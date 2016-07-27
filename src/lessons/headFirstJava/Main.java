package lessons.headFirstJava;

import java.util.ArrayList;

/**
 * Created by Admin on 25.07.16.
 */
public class Main {
    public static void main(String[] args) {
        int x = 5;
        ArrayList dogs = new ArrayList();
        ArrayList l = new ArrayList();
        dogs.add( new Dog(30, "Gav"));
        dogs.add( new Dog(31, "Pes"));
        System.out.println(dogs.toString());
        System.out.println(dogs.size());
        dogs.remove(0);
        System.out.println(dogs.toString());
        System.out.println(dogs.size());
        l.add(123);
        l.add("sdsdsd");
        l.add('s');
        System.out.println(l.toString());
    }
}
