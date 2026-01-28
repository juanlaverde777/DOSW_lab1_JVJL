package reto2;
 
import java.util.Arrays;
import java.util.List;
 
public class CarreraParalela {
    public static void main(String[] args) {
   
        List<Integer> lista1 = Arrays.asList(5, 12, 3, 8, 21, 7, 15);
        List<Integer> lista2 = Arrays.asList(10, 4, 22, 1, 6); 
 
        System.out.println("====== REPORTE DE CARRERA (LAVERDE & VILLEGAS) ======");
        System.out.println("\n--- Análisis Lista 1 ---");
        System.out.println(procesarDatos(lista1));
        System.out.println("\n--- Análisis Lista 2 ---");
        System.out.println(procesarDatos(lista2));
    }
 
    public static Resultados procesarDatos(List<Integer> lista) {

        int max = lista.stream().max(Integer::compareTo).orElse(0);
        int min = lista.stream().min(Integer::compareTo).orElse(0);
        int cantidad = lista.size();
 
        String checkMaxVillegas = (max % 2 == 0) ? "Es Múltiplo de 2" : "No es múltiplo";

        String checkCantVillegas = (cantidad % 2 == 0) ? "Es Cantidad Par" : "No es Par";
 
        String checkMaxLaverde = (max != 0 && 2 % max == 0) ? "Es Divisor de 2" : "No es divisor";

        String checkCantLaverde = (cantidad % 2 != 0) ? "Es Cantidad Impar" : "No es Impar";
 
        String reporteMax = "Villegas dice: [" + checkMaxVillegas + "] | Laverde dice: [" + checkMaxLaverde + "]";
        String reporteCant = "Villegas dice: [" + checkCantVillegas + "] | Laverde dice: [" + checkCantLaverde + "]";
 
        return new Resultados(max, min, cantidad, reporteMax, reporteCant);
    }
}
 
class Resultados {
    int max, min, cantidad;
    String reporteMax, reporteCant;
 
    public Resultados(int max, int min, int cantidad, String reporteMax, String reporteCant) {
        this.max = max;
        this.min = min;
        this.cantidad = cantidad;
        this.reporteMax = reporteMax;
        this.reporteCant = reporteCant;
    }
 
    @Override
    public String toString() {
        return "Max: " + max + " | Min: " + min + " | Total Datos: " + cantidad + 
               "\n   >> Validación del Mayor: " + reporteMax + 
               "\n   >> Validación de Cantidad: " + reporteCant;
    }
}