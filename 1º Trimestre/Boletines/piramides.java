public class piramides {
    //Función para dibujar una piramide con asteriscos
    public static void piramideAsteriscos(int n) {
        // Piramide con asteriscos
        for (int i = 1; i <= n; i++) {
            // Los espacios que va a pintar
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Los asteriscos que va a pintar
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Piramide hecha de asteriscos
        piramideAsteriscos(10);
    }
}