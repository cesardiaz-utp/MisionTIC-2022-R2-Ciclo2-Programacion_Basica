import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class EntradaSalida1 {
    public static void main(String[] args) {
        String línea = null;
        try {
            var entrada = new BufferedReader(new InputStreamReader(System.in));
            var salida = new PrintWriter(System.out, true);

            salida.println("Escribe el texto: ");
            línea = entrada.readLine();

            salida.print("La linea escrita es: ");
            salida.println(línea);

            entrada.close();
            salida.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
