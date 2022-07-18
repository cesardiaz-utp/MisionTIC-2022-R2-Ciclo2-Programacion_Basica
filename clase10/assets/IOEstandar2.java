import java.io.IOException;

public class IOEstandar2 {
    public static void main(String args[]) {
        byte[] buffer = new byte[255];
        System.out.print("Escribe el texto: ");
        try {
            System.in.read(buffer, 0, 255);
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.print("\nLa linea escrita es: ");
        System.out.println(new String(buffer));
    }
}
