import java.util.*;

public class BatallaConjuntos {
    public static void main(String[] args) {
//HashSet sin orden
        Set<Integer> guerreros = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        
// Eliminar múltiplos de 3
        guerreros.removeIf(n -> n % 3 == 0);
        
        System.out.println("Sobrevivientes A: " + guerreros);
    }
}