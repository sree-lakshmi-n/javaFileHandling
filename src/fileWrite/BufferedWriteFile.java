package fileWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteFile {
    public static void main(String[] args) {
        File file = new File("src/fileWrite/demo.txt");
        BufferedWriter bw;
        {
            try {
                bw = new BufferedWriter(new FileWriter(file, true));
                bw.write("Writes text to a character-output stream, buffering characters so as to provide for the " +
                        "efficient writing of single characters, arrays, and strings.");
                bw.newLine();
                bw.write("The buffer size may be specified, or the default size may be accepted. " +
                        "The default is large enough for most purposes.");
                bw.close();
                System.out.println("Successfully wrote to the file");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
