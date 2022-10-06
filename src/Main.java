import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(25);
        persona.setNombre("Elizabeth");
        persona.setTelefono("3452354");

        System.out.println("Edad de la persona: " + persona.getEdad());
        System.out.println("Nombre de la persona: " + persona.getNombre());
        System.out.println("Telefono de la persona: " + persona.getTelefono());
    }
}
