<<<<<<< HEAD
import java.util.List;

public class Reto1 {

    public static void main(String[] args) {

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
=======
mport java.util.List;
import java.util.stream.Collectors;
 
public class Reto1 {
 
    public static void main(String[] args) {
 
        List<Estudiante> estudiantes = List.of(
            new Estudiante("Juan Manuel Villegas", 23, 6, "juan.villegas@mail.escuelaing.edu.co"),
            new Estudiante("Juan Jose Laverde", 22, 6, "juan.laverde@mail.escuelaing.edu.co")
        );
 
        MensajeBienvenida bienvenida = (lista) ->
            "¡Hola, bienvenidos! " +
            lista.stream()
                .map(e -> e.nombre)
                .collect(Collectors.joining(" y "));
 
        System.out.println(bienvenida.generar(estudiantes));
    }
}
 
// Interfaz funcional
@FunctionalInterface
interface MensajeBienvenida {
    String generar(List<Estudiante> estudiantes);
}
>>>>>>> feature/reto_numero_1_LaverdeJuan_2026-1
