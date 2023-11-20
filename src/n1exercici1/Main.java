package n1exercici1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String directori;

        System.out.println("Introduzca la ruta del directorio a leer:");
        Scanner scanner = new Scanner(System.in);
        directori = scanner.nextLine();
        File folderFile = new File(directori);
        if (folderFile.exists()) {
            File[] files = folderFile.listFiles();
            assert files != null;
            for (File file : files) {
                boolean isFolder = file.isDirectory();
                System.out.println(file.getName());
            }
        }
    }
}

