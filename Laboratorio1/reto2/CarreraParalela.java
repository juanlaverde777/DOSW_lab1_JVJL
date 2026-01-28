package reto2;
 
import java.util.Arrays;
import java.util.List;
 
public class CarreraParalela {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 12, 3, 8, 21, 7, 15);
        System.out.println(procesarDatos(numeros));
    }
 
    public static Resultados procesarDatos(List<Integer> lista) {

        int max = lista.stream().max(Integer::compareTo).orElse(0);
        int min = lista.stream().min(Integer::compareTo).orElse(0);
        int cantidad = lista.size();
 

        String analisisMax = (max != 0 && 2 % max == 0) ? "Es Divisor de 2" : "No es divisor";

        String analisisCant = (cantidad % 2 != 0) ? "Cantidad Impar" : "No es impar";
 
        return new Resultados(max, min, cantidad, analisisMax, analisisCant);
    }
}
 

class Resultados {
    int max, min, cantidad;
    String analisisMax, analisisCant;
 
    public Resultados(int max, int min, int cantidad, String analisisMax, String analisisCant) {
        this.max = max; 
        this.min = min; 
        this.cantidad = cantidad;
        this.analisisMax = analisisMax;
        this.analisisCant = analisisCant;
    }
 
    @Override
    public String toString() {
        return "Max: " + max + " | Min: " + min + " | Cant: " + cantidad + 
               "\nAnálisis: " + analisisMax + " | " + analisisCant;
    }
}