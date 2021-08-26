import java.io.*;
import java.util.Scanner;

public class CopyFile {

    public static void copyFile(String originalFile, String copyFile) throws IOException {
        File fromFile = new File(originalFile);
        File destinationFile = new File(copyFile);

        FileReader fileReader = new FileReader(fromFile);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(destinationFile, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line = null;

        while ((line = reader.readLine()) != null) {
            writer.write(line + "\n");
        }

        reader.close();
        writer.close();
        fileReader.close();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file gốc :");
        String formFilePath = sc.nextLine();
        System.out.println("Nhập đường dẫn file copy :");
        String destinationFile = sc.nextLine();
        copyFile(formFilePath, destinationFile);
    }
}
