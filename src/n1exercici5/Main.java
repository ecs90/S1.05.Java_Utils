package n1exercici5;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File directorio = new File("/Users/agustinaheredia/Documents");
        SerialitzarObjecte so = new SerialitzarObjecte();
        so.serializarDirectorio(directorio);
        so.deserializarDirectorio();
    }
}
