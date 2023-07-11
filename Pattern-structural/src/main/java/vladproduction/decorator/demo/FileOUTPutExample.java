package vladproduction.decorator.demo;

import java.io.*;

public class FileOUTPutExample {
    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("text from: public class FileOUTPutExample;");

        dataOutputStream.close();
        outputStream.close();

    }
}
