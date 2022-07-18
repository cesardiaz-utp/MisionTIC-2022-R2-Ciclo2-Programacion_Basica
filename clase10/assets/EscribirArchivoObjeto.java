import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EscribirArchivoObjeto {
    public static void main(String[] args) {
        var nombre = "Objetos.dat";
        try {
            var oos = new ObjectOutputStream(new FileOutputStream(nombre));
            oos.writeObject(new Persona("552871883", "Maria", "Ruiz Ramos"));
            oos.writeObject(new Persona("403020104", "Juan", "Gonzalez Lopez"));
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
