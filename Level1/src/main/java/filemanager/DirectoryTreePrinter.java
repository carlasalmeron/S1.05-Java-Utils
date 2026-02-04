package filemanager;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryTreePrinter {

    public void printTree(String path) {
        File root = new File(path);
        printRecursive(root, 0);
    }

    private void printRecursive(File file, int level) {

        if (!file.exists()) {
            return;
        }

        String type = file.isDirectory() ? "(D)" : "(F)";
        String date = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss")
                .format(new Date(file.lastModified()));

        System.out.println("  ".repeat(level) + type + " " + file.getName() + " - " + date);

        if (file.isDirectory()) {

            File[] children = file.listFiles();
            if (children == null) {
                return;
            }

            Arrays.sort(children);

            for (File child : children) {
                printRecursive(child, level + 1);
            }
        }
    }

    //Task 3
    public String getTreeAsText(String path) {

        File root = new File(path);
        StringBuilder sb = new StringBuilder();

        buildRecursive(root, 0, sb);

        return sb.toString();
    }

    private void buildRecursive(File file, int level, StringBuilder sb) {

        String type = file.isDirectory() ? "(D)" : "(F)";

        sb.append("  ".repeat(level))
                .append(type)
                .append(" ")
                .append(file.getName())
                .append("\n");

        if (file.isDirectory()) {

            File[] children = file.listFiles();
            if (children == null) return;

            Arrays.sort(children);

            for (File child : children) {
                buildRecursive(child, level + 1, sb);
            }
        }
    }
}