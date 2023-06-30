package fileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File myObj = new File("src/fileWrite/sample.txt");
        try {
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}
