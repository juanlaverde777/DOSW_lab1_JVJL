import java.util.*;
 
public class BatallaConjuntos {
    public static void main(String[] args) {
      
        Set<Integer> guerreros = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));
        
        guerreros.removeIf(n -> n % 5 == 0);
        System.out.println("Sobrevivientes B: " + guerreros);
    }
}