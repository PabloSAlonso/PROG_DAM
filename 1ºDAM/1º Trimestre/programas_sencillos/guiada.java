import java.util.Scanner;

/**
 * guiada
 */
public class guiada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int anosDeCarnet;
        int precio;

        System.out.println("Dime tu edad");
        edad = sc.nextInt();
        System.out.println("Dime los años de carnet");
        anosDeCarnet = sc.nextInt();

        if (edad < 21) {
            precio = 300 + 100;
        } else {
            if (anosDeCarnet <= 10) {
                precio = 300;
            } else {
                precio = 270;
            }
        }
        System.out.println("El precio del seguro es de "+precio+"Euros");
        

    }

}