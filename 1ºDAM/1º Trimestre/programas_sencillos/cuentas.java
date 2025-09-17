import java.util.Scanner;
public class cuentas {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero real");
        float num1;
        num1 = sc.nextFloat();
        System.out.print("Ahora dime otro");
        float num2;
        num2 = sc.nextFloat();
        float suma;
        suma = (num1+num2);
        float resta;
        resta = (num1-num2);
        float multiplicacion;
        multiplicacion = (num1*num2);
        float division;
        division = (num1/num2);
        System.out.print("La suma de tus numeros es " +suma+ "\nla resta es "+resta+ "\nla multiplicacion " +multiplicacion+ "\ny la division "+division);
}
}