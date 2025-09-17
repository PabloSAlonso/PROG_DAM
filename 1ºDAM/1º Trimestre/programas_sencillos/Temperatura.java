import java.util.Scanner;
public class Temperatura {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Dime tu nombre");
String nombre;
nombre = sc.nextLine();
System.out.print("Ahora tu edad");
int edad;
edad = sc.nextInt();
System.out.print("Y por ultimo la temeperatura actual");
float temperatura;
temperatura = sc.nextFloat();
System.out.print("Por lo tanto \n te llamas "+ nombre + "\n tienes "+ edad+ " años y\n hacen "+ temperatura + "grados");

}
}