package fileCreate;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File myObj = new File("src/fileCreate/file.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        }
        myObj = new File("src/fileCreate/sample.txt");
        if (myObj.exists()) {
            System.out.println("File size of " + myObj.getName() + " in bytes: " + myObj.length());
        }
    }
}
