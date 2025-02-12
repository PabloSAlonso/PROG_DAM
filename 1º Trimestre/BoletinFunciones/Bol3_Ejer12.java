import java.util.Scanner;

public class Bol3_Ejer12 {

    /**
     * Funcion que devuelve una opcion aleatoria entre las disponibles (1, 2 , X)
     * @return La opcion aleatoria entre las disponibles
     */
    public static char quiniela(){
        double numAleatorio = Math.ceil(Math.random()*3);
        return numAleatorio == 1 ? '1' : numAleatorio == 2 ? '2' : 'X';
    }

    /**
     * Funcion que devuelve una opcion aleatoria entre las disponibles (1, 2, X) según la ponderación indicada
     * @return La opcion aleatoria entre las disponibles
     */
    public static char quinielaPonderada(){
        double numAleatorio = Math.ceil(Math.random()*100 + 1);
        return numAleatorio <= 60 ? '1' : numAleatorio >= 61 && numAleatorio <= 85? '2' : 'X';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int contador=1;

        do{
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.- Generar quiniela.");
            System.out.println("2.- Generar quiniela ponderada.");
            System.out.println("3.- Salir.");
            System.out.println("Teclee opción (1-3)");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Quiniela número "+contador+": "+quiniela());
                    contador++;
                    break;
                case 2:
                    System.out.println("Quiniela ponderada número "+contador+": "+quinielaPonderada());
                    contador++;
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            
        
        } while (opcion != 3);
        sc.close();


    }
}
