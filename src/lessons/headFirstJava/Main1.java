package lessons.headFirstJava;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Admin on 25.07.16.
 */
public class Main1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        Cat cat = new Cat();
        Hippo hippo = new Hippo();
        animals[0] = cat;
        animals[1] = hippo;
        cat.voice();
        hippo.voice();
        for (Animal animal : animals) {
            animal.voice();
        }
        Crocodile crocodile = new Crocodile();
        Crocodile crocodile1 = new Crocodile(12);
        System.out.println(crocodile.getLenght());
        System.out.println(crocodile1.getLenght());

        System.out.printf("Ololo %.3f trololo", 2344234.233443322);
        System.out.println();
        System.out.println(String.format("%tc", new Date()));
        System.out.println(String.format("%tr", new Date()));
        Date today = new Date();
        System.out.println(String.format("%tA, %tB %td", today,today,today));
        System.out.println(String.format("%tA, %<tB %<td", today));


        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.getTime());
    }
}
