package practicos;
import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Tamaño" + nombres.size());
        // Añade un elemento al final de la lista
        nombres.add("a");
        nombres.add("p");
        // El numero determina en que posicion introduce el caracter
        nombres.add(1, "w");
        System.out.println("Tamaño" + nombres.size());
        System.out.println(nombres.get(1));
    }
}
