
import java.io.PrintWriter;

public class EscrituraArchivos {
   public static void main (String[] a) throws Exception {    
           // Apertura
           PrintWriter f = new PrintWriter("prueba.txt"); 
            
           // Escritura
            f.print("Prueba de archivos");
            f.println("Hola que tal. \n\n");
            f.printf("%5.2f\n",Math.PI);
            for (int i=10; i<=20; i++){
                f.printf("%4d",i);

            //Cierre
            f.close();
   }
}
}
