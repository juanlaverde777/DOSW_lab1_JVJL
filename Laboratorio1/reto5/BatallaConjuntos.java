import java.util.*;

public class BatallaConjuntos {
    public static void main(String[] args) {
        

        List<Integer> datosA = Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5);
        List<Integer> datosB = Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4);

        // 2. Lógica Estudiante A (Villegas): HashSet, eliminar múltiplos de 3
        Set<Integer> equipoA = new HashSet<>(datosA);
        equipoA.removeIf(n -> n % 3 == 0); 

        // 3. Lógica Estudiante B (Laverde): TreeSet, eliminar múltiplos de 5
        Set<Integer> equipoB = new TreeSet<>(datosB);
        equipoB.removeIf(n -> n % 5 == 0); 

        Set<Integer> unionFinal = new TreeSet<>();
        unionFinal.addAll(equipoA);
        unionFinal.addAll(equipoB);


        System.out.println("--- Resultado Final de la Batalla ---");
        unionFinal.forEach(numero -> System.out.println("Número en arena: " + numero));
    }
}