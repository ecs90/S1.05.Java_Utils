package n1exercici5;

import java.io.*;

public class SerialitzarObjecte implements Serializable {
    public void serializarDirectorio(File directorio) {
        try (FileOutputStream fos = new FileOutputStream("directorio.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(directorio);
            System.out.println("Directorio serializado correctamente en el archivo directorio.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deserializarDirectorio() {
        try {
            FileInputStream fis = new FileInputStream("directorio.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            File[] contenido = (File[]) ois.readObject();
            ois.close();
            fis.close();
            // Aquí se puede hacer algo con el objeto deserializado, como imprimirlo en consola
            for (File archivo : contenido) {
                System.out.println(archivo.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
