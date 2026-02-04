package filemanager;

public class Main {
    public static void main(String[] args) {
        String path = "testFolder";

        // Task 1
        DirectoryLister lister = new DirectoryLister();
        lister.listDirectory(path);

        // Task 2
        DirectoryTreePrinter tree = new DirectoryTreePrinter();
        tree.printTree(path);

        // Task 3
        FileWriterUtil writer = new FileWriterUtil();
        String content = tree.getTreeAsText(path);
        writer.writeToFile("output.txt", content);

        // Task 4
        FileReaderUtil reader = new FileReaderUtil();
        reader.readFile("output.txt");

        // Task 5
        SerializerUtil serializer = new SerializerUtil();

        Person person = new Person("Carla", 27);

        serializer.serialize("person.ser", person);

        Person recovered = serializer.deserialize("person.ser");
        System.out.println("Recovered object: " + recovered);
    }
}