package by.belhard.j2.lesson8.les;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathInput = "resources/example.data";
        String pathOutput = "resources/exampleOut.data";

        /*File nonExistFile = new File("resources/nonExist.ex");
        nonExistFile.createNewFile();*/
        File fileInput = new File(pathInput);
        File fileOutput = new File(pathOutput);
        System.out.println(fileInput.getParent());

        InputStream inputStream = new FileInputStream(fileInput);
        OutputStream outputStream = new FileOutputStream(fileOutput);

        int read;
        while ((read = inputStream.read()) != -1) {

            outputStream.write(read + 1);
        }

        outputStream.flush();

//        System.out.println("\nend of stream");

    }
}
