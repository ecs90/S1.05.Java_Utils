package n1exercici2;

import java.io.File;

public class ReadFolder {
    public void readFlderFiles(String directori){
        File folderFile = new File(directori);
        if (folderFile.exists()) {
            File[] files = folderFile.listFiles();
            assert files != null;
            for (File file : files) {
                boolean isFolder = file.isDirectory();
                System.out.println((isFolder ? "FOLDER: " : "  FILE: ") + file.getName());
                if (isFolder) {
                    System.out.println("new folder [");
                    readFlderFiles(directori + "/" + file.getName());
                    System.out.println("] end of folder");
                }
            }
        }
    }
}
