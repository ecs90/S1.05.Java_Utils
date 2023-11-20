package n1exercici4;

import java.io.*;

public class PrintTXT {
    File file;

    public PrintTXT(String file) {
        this.file = new File(file);
    }

    public void printFullTXT() {
        if (this.file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(this.file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("file doesn't exist");
        }
    }
}
