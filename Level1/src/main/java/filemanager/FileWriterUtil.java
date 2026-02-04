package filemanager;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {

    public void writeToFile(String filename, String content) {

        try (FileWriter writer = new FileWriter(filename)) {

            writer.write(content);
            System.out.println("File saved successfully: " + filename);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}