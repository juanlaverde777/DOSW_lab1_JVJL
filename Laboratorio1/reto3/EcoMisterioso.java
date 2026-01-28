import java.util.stream.IntStream;
import java.util.function.UnaryOperator;

public class EcoMisterioso {
    public static void main(String[] args) {
       
        UnaryOperator<String> eco = mensaje -> {
            StringBuilder sb = new StringBuilder();
            IntStream.range(0, 3).forEach(i -> sb.append(mensaje).append(" "));
            return sb.toString().trim();
        };

        System.out.println(eco.apply("Hola"));
    }
}