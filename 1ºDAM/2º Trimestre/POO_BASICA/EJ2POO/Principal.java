import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha f = new Fecha();
        System.out.println("Introduce el dia, el mes y el año de una fecha");
        System.out.print("Día: ");
        f.setDia(sc.nextInt());
        System.out.print("Mes: ");
        f.setMes(sc.nextInt());
        System.out.print("Año: ");
        f.setAño(sc.nextInt());
        System.out.println("----------------");
        System.out.println("Ahora introduce otra fecha (día mes y año):");
        Fecha f2 = new Fecha(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("----------------");
        System.out.println("Fechas en formato Corto:");
        System.out.println("Fecha 1: " + f.fechaFormateada(true));
        System.out.println("Fecha 2: " + f2.fechaFormateada(true));
        System.out.println("----------------");
        System.out.println("Fechas en formato Largo:");
        System.out.println("Fecha 1: " + f.fechaFormateada(false));
        System.out.println("Fecha 2: " + f2.fechaFormateada(false));
        System.out.println("La diferencia de años entre las fechas es " + Fecha.diferenciaFechas(f, f2)); //Accedemos a la funcion estatica mediante el nombre de la clase
        System.out.println("----------------");
        sc.close();
    }
}
