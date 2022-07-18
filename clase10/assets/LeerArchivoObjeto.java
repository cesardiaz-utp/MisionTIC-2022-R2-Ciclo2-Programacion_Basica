import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerArchivoObjeto {
    public static void main(String[] args) {
        var nombre = "Objetos.dat";
        try {
            var ois = new ObjectInputStream(new FileInputStream(nombre));

            var p1 = (Persona) ois.readObject();
            var p2 = (Persona) ois.readObject();

            ois.close();

            System.out.println("Cedula\t\tNombre Completo");
            System.out.println(p1);
            System.out.println(p2);
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
