package reto2;
 
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
 
public class CarreraParalela {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(5, 12, 3, 8, 21, 7, 15);
        /
        Function<List<Integer>, Integer> calcularMaximo = lista -> 
            lista.stream()
                 .max(Integer::compareTo)
                 .orElse(0);
      
        Function<List<Integer>, Integer> calcularMinimo = lista -> 
            lista.stream()
                 .min(Integer::compareTo)
                 .orElse(0);
       
        Function<List<Integer>, Integer> contarDatos = lista -> lista.size();
      
        Integer maximo = calcularMaximo.apply(numeros);
        Integer minimo = calcularMinimo.apply(numeros);
        Integer cantidad = contarDatos.apply(numeros);
        System.out.println("Número más grande: " + maximo);
        System.out.println("Número más pequeño: " + minimo);
        System.out.println("Cantidad de datos: " + cantidad);
    }
}