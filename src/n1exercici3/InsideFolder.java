package n1exercici3;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class InsideFolder {
    public boolean createFile(String filePath, String fileName) {
        boolean result;
        File newFile = new File(filePath, fileName);
        if ((result = !newFile.exists())) {
            try {
                result = newFile.createNewFile();
            } catch (IOException ex) {
                result = false;
                System.out.println("File create exception (Excepción al crear el fichero): \n     " + ex);
            }
        }
        return result;
    }

    public void readFolderFiles(String folder, PrintStream output) {
        File folderFile = new File(folder);
        if (folderFile.exists()) {
            File[] files = folderFile.listFiles();
            for (File file : files) {
                boolean isFolder = file.isDirectory();
                output.println((isFolder ? "FOLDER: " : "  FILE: ") + file.getName());
                if (isFolder) {
                    readFolderFiles(folder + "/" + file.getName(), output);
                }
            }
        }
    }
}
