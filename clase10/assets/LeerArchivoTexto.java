import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LeerArchivoTexto {
    public static void main(String[] args) {
        String nombre = "Numeros.txt";
        var archivo = new File(nombre);
        if (archivo.exists()) {
            try {
                var lector = new Scanner(archivo);
                System.out.println("Numeros del archivo:");
                while (lector.hasNext()) {
                    var numeros = new StringTokenizer(lector.next(), ",");
                    while (numeros.hasMoreTokens()) {
                        System.out.print(numeros.nextToken() + "\t");
                    }
                    System.out.println("");
                }
                lector.close();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        } else {
            System.out.println("¡El fichero no existe!");
        }
    }
}
