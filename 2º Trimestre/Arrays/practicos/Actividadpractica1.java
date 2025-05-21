package practicos;
import java.util.Scanner;
public class Actividadpractica1 {

    public static double media(int[] vector){
        double num = 0;
        for (int numero : vector){
            num = num + numero;
        }
        return num/vector.length;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número: ");
            numeros[i] = sc.nextInt();
        }
        /*for (int i = 0; i < numeros.length; i++){
            num = num + numeros[i];
        }
        media = num/numeros.length;*/

        //////////////////////////////////////////////////////////
        double num = 0;
        for (int numero : numeros){
            num = num+numero;
        }
        media = num/numeros.length;
        //////////////////////////////////////////////////////////
        
        /*for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("Media: "+media);*/
        for (int numero : numeros){
            System.out.println(numero);
        }
        System.out.println("Media: "+ media);
        sc.close();
    }
}
/*Actividad:
Ha un programa con las siguientes características (todo en el main salvo que
se indique otra cosa):
a) Mediante un bucle pide 10 números enteros al usuario y almacénalos en un
array.
Mediante un segundo bucle calcula la media de los números (como real). 
Finalmente, mediante un tercer bucle, muestra el contenido del array y luego
la media (Esta ya fuera del bucle, claro). 
b) Cambia los bucles que puedas por for mejorado (deja comentado el clásico
y hazlo justo debajo con el foreach).
c) Pasa la parte del cálculo de las medias a una función con parámetro el
vector y que devuelva un double.
Si acabas este ejercicio puedes comenzar el ejercicio 1 del boletín.
 */