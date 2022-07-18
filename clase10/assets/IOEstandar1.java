import java.io.IOException;

public class IOEstandar1 {
    public static void main(String args[]) {
        int numBytes = 0;
        char caracter;
        System.out.print("Escribe el texto: ");
        try {
            do {
                caracter = (char) System.in.read();
                System.out.print(caracter);
                numBytes++;
            } while (caracter != '\n');
            System.err.printf("%d bytes leidos %n", numBytes);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
