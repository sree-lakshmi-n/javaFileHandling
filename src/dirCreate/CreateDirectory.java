package dirCreate;

import java.io.File;
import java.io.IOException;

public class CreateDirectory {
    public static void main(String[] args) {
        File directory = new File("src/dirCreate/myDir");
        directory.mkdir();
        System.out.println("Directory created");
        File directiories = new File("src/dirCreate/myDir/basics/fileHandling");
        directiories.mkdirs();
        File directores = new File("src/dirCreate/myDir/basics/serialization");
        directores.mkdirs();
        File directories = new File("src/dirCreate/myDir/advanced");
        directories.mkdirs();
        System.out.println("Directories created");
        File file = new File("src/dirCreate/myDir/basics/fileHandling/myFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File created");
    }
}
