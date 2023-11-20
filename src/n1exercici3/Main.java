package n1exercici3;

import n1exercici2.ReadFolder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String directori;
        InsideFolder insideFolder = new InsideFolder();
        PrintStream printStream = System.out;

        System.out.println("Introduzca la ruta del directorio a leer:");
        Scanner scanner = new Scanner(System.in);
        directori = scanner.nextLine();
        boolean result = insideFolder.createFile(directori + "\\Java_utils\\src\\n1exercici3", "outPut.txt");
        if (result) {
            try {
                printStream = new PrintStream(new File(directori + "\\Java_utils\\src\\n1exercici3\\outPut.txt"));
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }
            insideFolder.readFolderFiles(directori, printStream);
        }
    }
}

/*PrintStream printStream = System.out;
    boolean result = javaIOUtils.createFile(folder, "outPut.txt");
    if (result) {
        try {
            printStream = new PrintStream(new File(folder + "/outPut.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        javaIOUtils.readFolderFiles(folder, false, printStream);
    }
    javaIOUtils.readFolderFiles(folder);*/
