package reto2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CarreraParalela {
    
    public static void main(String[] args) {
        // Lista de prueba
        List<Integer> numeros = Arrays.asList(5, 12, 3, 8, 21, 7, 15);
        
        // Lambda para calcular el número más grande
        Function<List<Integer>, Integer> calcularMaximo = lista -> 
            lista.stream()
                 .max(Integer::compareTo)
                 .orElse(0);
        
        // Probar la función
        Integer maximo = calcularMaximo.apply(numeros);
        System.out.println("Número más grande: " + maximo);
    }
}