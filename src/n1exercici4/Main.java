package n1exercici4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserte la ruta del archivo a leer:");
        Scanner scanner = new Scanner(System.in);
        PrintTXT printTXT = new PrintTXT(scanner.nextLine());
        printTXT.printFullTXT();
    }
}
