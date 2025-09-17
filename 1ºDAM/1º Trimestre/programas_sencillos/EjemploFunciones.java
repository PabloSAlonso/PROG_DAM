public class EjemploFunciones {

    public static void estrellas1() {
        System.out.print("************************\n");
    }

    public static void estrellas2(int n) {
        // int n = 23;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // estrellas1(); //Para utilizar esta funcion en otro archivo pondriamos antes
        // de llamar a la funcion el nombre del archivo con un . despues, la extension
        // del archivo no es necesaria
        // estrellas2(40);
        // estrellas2(23);
        // estrellas2(5);
        System.out.println();
        for (int i = 0; i < 5; i++) {
            estrellas2(i+1);
        }
        System.out.println();
        estrellas2(40);
        System.out.println("FIN");
    }
}
