package reto2;
 
import java.util.Arrays;
import java.util.List;
 
public class CarreraParalela {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5, 12, 3, 8, 21, 7, 15);

        Resultados res = procesarDatos(numeros);
        System.out.println("Resultados (Carril 2 - Laverde): " + res);
    }

    public static Resultados procesarDatos(List<Integer> lista) {

        int min = lista.stream().min(Integer::compareTo).orElse(0);

        int cantidad = lista.size();

        return new Resultados(0, min, cantidad);
    }
}
 

class Resultados {
    int max;
    int min;
    int cantidad;
 
    public Resultados(int max, int min, int cantidad) {
        this.max = max;
        this.min = min;
        this.cantidad = cantidad;
    }
 
    @Override
    public String toString() {
        return "Máximo: " + max + ", Mínimo: " + min + ", Cantidad: " + cantidad;
    }
}