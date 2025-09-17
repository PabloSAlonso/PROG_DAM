public class Bol2_Ejer1 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 50) {
            System.out.printf("%5d", contador);
            contador += 2;
        }
        contador = 1;
        while (contador <= 20) {
            System.out.println(contador);
            contador += 1;
        }
        contador = 0;
        do {
            System.out.println(contador);
            contador += 1;

        } while (contador < 20);
        for (contador = 0; contador < 20; contador++) {
            System.out.println(contador);
        }
        
    }
}
