package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

  public static void pedirDato() throws Exception {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    try {
      System.out.println("Introduce un nº positivo");
      numero = sc.nextInt();
      if (numero < 0) {
        throw new Exception("No se admiten valor negativo");
      }
    } catch (InputMismatchException e) {
      System.out.println("Ha introducido un dato que no es un número entero");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    sc.close();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Fecha fecha = new Fecha();
    boolean error;
    do {
      try {
        error = false;
        System.out.println("Dime un mes");
        int mes = sc.nextInt();
        fecha.setMes(mes);
      } catch (InputMismatchException e) {
        System.out.println("Debes meter un valor numerico");
        error = true;
      } catch (IllegalArgumentException e) {
        System.out.println("El mes debe estar entre 1 y 12");
        error = true;
      }
      sc.nextLine();
    } while (error);
    sc.close();
  }
}
