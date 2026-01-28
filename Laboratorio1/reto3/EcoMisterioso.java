import java.util.function.UnaryOperator;
 // a
public class EcoMisterioso {
    public static void main(String[] args) {
        UnaryOperator<String> eco = mensaje -> {
            StringBuffer sbuffer = new StringBuffer(mensaje);
            return sbuffer.reverse().toString();
        };
 
        System.out.println(eco.apply("Hola"));
    }
}