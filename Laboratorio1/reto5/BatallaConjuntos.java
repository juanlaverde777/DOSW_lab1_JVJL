import java.util.*;

public class BatallaConjuntos {
    public static void main(String[] args) {
        // Lógica A: HashSet (Sin orden) y eliminar múltiplos de 3
        Set<Integer> equipoA = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        equipoA.removeIf(n -> n % 3 == 0);
        
        System.out.println("Sobrevivientes A: " + equipoA);
    }
}
