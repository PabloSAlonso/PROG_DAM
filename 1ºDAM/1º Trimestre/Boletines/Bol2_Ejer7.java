import java.util.Scanner;
public class Bol2_Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantNumeros = 0;
        double sumatorio = 0;
        double media = 0;
        double num=1;
        while ( num !=0) {
            System.out.println("Introduce un número");
            num = sc.nextDouble();
            cantNumeros = cantNumeros + 1;
            sumatorio = sumatorio + num;
            //if (num==0) {
            //    System.out.println("Hasta otra!"); //Valido pero menos óptimo
            //    cantNumeros=cantNumeros - 1;
            //}
        } 
        media = sumatorio / (cantNumeros-1);   //Para que no cuente el 0 al introducirlo le quita 1 a la cantidad de números
        System.out.println("La media es: " + media);
        if (num==0) {
            System.out.println("Hasta otra!");
        }
         
    }
}
