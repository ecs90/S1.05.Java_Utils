package n1exercici5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person persona = new Person("Eze", 32);
        serializarDirectorio(persona);
        deserializarDirectorio();
    }

    public static void serializarDirectorio(Person persona) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            out.writeObject(persona);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deserializarDirectorio() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person person = (Person) in.readObject();
            System.out.println(person.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
