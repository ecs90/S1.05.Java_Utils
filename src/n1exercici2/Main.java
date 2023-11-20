package n1exercici2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String directori;
        ReadFolder readFolder = new ReadFolder();

        System.out.println("Introduzca la ruta del directorio a leer:");
        Scanner scanner = new Scanner(System.in);
        directori = scanner.nextLine();
        readFolder.readFlderFiles(directori);
    }
}
