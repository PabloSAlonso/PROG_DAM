import java.util.Scanner;

public class Bol3_Ejer14 {

    /**
     * Funcion que tira un dado
     * @param numeroCarasDado numero de caras del dado
     * @return el resultado del dado
     */
    public static int tirarDado(int numeroCarasDado) {
        numeroCarasDado = 6;
        double randomNumber = (int) Math.random() * numeroCarasDado + 1;
        return (int) Math.round(randomNumber);
    }
    /**
     * Funcion que suma los numeros de dos dados
     * @param dadoJugador1 el primer dado tirado
     * @param dadoJugador2 el segundo dado tirado
     * @return la suma de los dos dados
     */
    public static int suma(int dadoJugador1, int dadoJugador2) {
        dadoJugador1 = tirarDado(6);
        dadoJugador2 = tirarDado(6);
        int sumaJugador = dadoJugador1 + dadoJugador2;
        return sumaJugador;
    }
    /**
     * Funcion que comprueba el resultado de la suma de los dados
     * @param suma la suma anterior de los dados tirados
     * @return el resultado de la ronda del juego segun la suma de los dados
     */
    public static int comprobacion(int suma) {
        suma=suma(tirarDado(6),tirarDado(6));
        if (suma == 7 || suma == 11) {
            return 0; // gana
        } 
        else if (suma >= 4 && suma <= 10 && suma != 7) {
            return suma; // puntos
        } 
        else {
            return -1; // pierde
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntosJugador = 0;
        int puntosCPU = 0;
        int tiradaJugador = 0;
        int tiradaCPU = 0;
        int opcion = 1;
        do {
            int sumaJugador = suma(tirarDado(6), tirarDado(6));
            puntosJugador=comprobacion(sumaJugador);
            int sumaCPU = suma(tirarDado(6), tirarDado(6));
            puntosCPU=comprobacion(sumaCPU);
            System.out.println("Suma jugador: " + sumaJugador);
            System.out.println("Suma CPU: " + sumaCPU);
            if (puntosJugador == 0){
                System.out.println("El jugador gana esta ronda");
                puntosJugador += 1;
            }
            else if (puntosJugador == puntosJugador - 1){
                System.out.println("El jugador pierde esta ronda");
                puntosJugador -= 1;
            }
            else {
                puntosJugador = comprobacion(sumaJugador);
                System.out.printf("El jugador gana esta ronda con %2d puntos", puntosJugador);
            }
            System.out.println("¿Quieres seguir jugando?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = sc.nextInt();

        } while (opcion != 2);
        System.out.printf("El jugador ha terminado el juego con %2d puntos", puntosJugador);

    }
}
// 14. Juego Craps: Se desea simular este juego de dados. Para ello:
// • Se simula que el jugador tira dos dados de seis caras y se calcula la suma
// de ambos.
// • Si la suma es 7 u 11 en la primera tirada el jugador gana.
// • Si la suma es 2, 3 o 12 en la primera tirada (se denomina craps) el jugador
// pierde (gana la CPU).
// • Si la suma es un nº entre 4 y 10 salvo el 7, dicha suma son los puntos del
// jugador.
// • Luego tira la CPU con las mismas reglas. Si al final ambos sacan puntuación
// gana la de mayor valor o empate en caso de igualdad.
// Deben existir al menos las siguientes funciones:
// • tirada: Tira dos dados, muestra sus valores en pantalla y devuelve la suma.
// • comprobacion: Se el pasa un valor y devuelve -1 si pierde, 0 si gana o la
// puntuación en otro caso.
// Como siempre haz otras para organizar código y evitar repetir código.