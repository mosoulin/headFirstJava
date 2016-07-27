package lessons.headFirstJava;

/**
 * Created by Admin on 25.07.16.
 */
public class Dog {
    int size;
    String name;

    public Dog(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
