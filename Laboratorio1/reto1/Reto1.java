import java.util.List;
import java.util.stream.Collectors;
 
public class Reto1 {
 
    public static void main(String[] args) {
 
        List<Estudiante> estudiantes = List.of(
            new Estudiante("Juan Manuel Villegas", 23, 6, "juan.villegas@mail.escuelaing.edu.co"),
            new Estudiante("Juan Jose Laverde", 22, 6, "juan.laverde@mail.escuelaing.edu.co")
        );
 
        MensajeBienvenida bienvenida = (lista) ->
            "¡Hola, bienvenidos! Nosotros somos la pareja conformada por " +
            lista.stream()
                .map(e -> e.nombre + ", estudiante de la escuela de " + e.semestre + ".° semestre de " + e.edad + " años")
                .collect(Collectors.joining(" y ")) +
            ". Nuestros correos institucionales son " +
            lista.stream()
                .map(e -> e.correo)
                .collect(Collectors.joining(" y ")) + ".";
 
        System.out.println(bienvenida.generar(estudiantes));
    }
}
 
class Estudiante {
    String nombre;
    int edad;
    int semestre;
    String correo;
 
    public Estudiante(String nombre, int edad, int semestre, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.correo = correo;
    }
}
 
@FunctionalInterface
interface MensajeBienvenida {
    String generar(List<Estudiante> estudiantes);
}