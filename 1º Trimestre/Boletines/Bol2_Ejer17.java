import java.util.Scanner;

public class Bol2_Ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int acumulador = 0;
        boolean opcionRepetir = true;
        String opcion;
        
        do{
            do {
                System.out.print("Introduce un número entre 1 y 50: ");
                numero = sc.nextInt();
                if (numero < 1 || numero > 50) {
                    System.out.println("El número debe estar entre 1 y 50.");
                }
            } while (numero < 1 || numero > 50);

            for(int i = 1; i <= 100; i++){
                if(i % numero == 0){
                    System.out.println(i);
                    acumulador += i;
                }
            }
            System.out.println("La suma total es: " + acumulador);
            acumulador = 0;
            System.out.print("Quieres continuar? (S/N): ");
            sc.nextLine();
            opcion = sc.nextLine().toUpperCase();
            if (opcion.equals("S")){
                opcionRepetir = true;
            } else if(opcion.equals("N")){
                opcionRepetir = false;
                System.out.println("Adiós!");
            } else {
                System.out.println("Introduce un carácter válido!");
                opcionRepetir = false;  
            }
        }
        while (opcionRepetir==true);
        sc.close();
    }
}
