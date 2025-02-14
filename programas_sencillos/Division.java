import java.util.Scanner;
public class Division {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Dime un numero entero");
int num1;
num1 = sc.nextInt();
System.out.println("Dime otro numero entero");
int num2;
num2 = sc.nextInt();
int num3;
num3 = (num1+num2);
System.out.println("La suma de estos numeros es "+ num3 );
int cociente;
cociente = (num1/num2);
System.out.println("Ademas el cociente de su division es "+ cociente);
int resto;
resto = (num1%num2);
System.out.println("Y su resto es "+ resto);
}
}