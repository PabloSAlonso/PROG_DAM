public class Sumabucle {

    public static int sumaHastaN(int n) {

        int acumulador = 0;
        for (int contador = 1; contador <= n; contador++) {
            acumulador += contador;
        }

        return acumulador;

    }

    public static void main(String[] args) {

        int resultado = sumaHastaN(10);
        System.out.println(resultado);

        System.out.println(sumaHastaN(10000));
    }
}
