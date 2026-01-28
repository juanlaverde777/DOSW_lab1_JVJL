package reto2;

import java.util.Arrays;
import java.util.List;

public class CarreraParalela {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 12, 3, 8, 21, 7, 15);
        
 
        Resultados res = procesarDatos(numeros);
        
        System.out.println("Resultados (Carril 1): " + res);
    }

   

public static Resultados procesarDatos(List<Integer> lista) {
    int max = lista.stream().max(Integer::compareTo).orElse(0);
    return new Resultados(max, 0, 0);
}
}

class Resultados {
    int max, min, cantidad;
    public Resultados(int max, int min, int cantidad) {
        this.max = max; this.min = min; this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Máximo: " + max + ", Mínimo: " + min + ", Cantidad: " + cantidad;
    }
}




