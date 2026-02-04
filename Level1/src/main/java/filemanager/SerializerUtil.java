package filemanager;

import java.io.*;

public class SerializerUtil {

    public void serialize(String filename, Person person) {

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(filename))) {

            out.writeObject(person);
            System.out.println("Serialized object in: " + filename);

        } catch (IOException e) {
            System.out.println("Error while serializing: " + e.getMessage());
        }
    }

    public Person deserialize(String filename) {

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(filename))) {

            return (Person) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while serializing: " + e.getMessage());
        }

        return null;
    }
}