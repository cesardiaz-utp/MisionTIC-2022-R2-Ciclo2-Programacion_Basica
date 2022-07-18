import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivoTexto {
    public static void main(String[] args) {
        int[][] numeros = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        var archivo = "Numeros.txt";
        try {
            var salida = new PrintWriter(archivo);
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    if (j != 0) {
                        salida.print(",");
                    }
                    salida.print(numeros[i][j]);
                }
                salida.println("");
            }
            salida.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
