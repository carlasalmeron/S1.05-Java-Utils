package filemanager;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public void listDirectory(String path) {

        File directory = new File(path);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The directory does not exist");
            return;
        }

        String[] files = directory.list();

        if (files == null) {
            System.out.println("The content cannot be read");
            return;
        }

        Arrays.sort(files);

        System.out.println("Directory contents:");
        for (String name : files) {
            System.out.println(" - " + name);
        }
    }
}