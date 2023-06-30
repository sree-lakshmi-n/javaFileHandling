package fileWrite;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("src/fileWrite/sample.txt");
            myWriter.write("In OOP, classes are blueprints or templates for objects. " +
                    "We use them to describe types of entities.\n" +
                    "\n" +
                    "On the other hand, objects are living entities, created from classes. " +
                    "They contain certain states within their fields and present certain behaviors " +
                    "with their methods.\n");
            myWriter.append("The File class of the java.io package is used to perform various operations on files and directories.");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
