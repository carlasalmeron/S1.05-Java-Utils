package filemanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {

    public void readFile(String filename) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String line;
            System.out.println("File contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}