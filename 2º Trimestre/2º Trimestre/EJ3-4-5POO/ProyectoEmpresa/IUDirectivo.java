import java.util.Scanner;
public class IUDirectivo {
    Scanner sc = new Scanner(System.in);
    public Directivo directivo;// = new Directivo();

    public IUDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }
    public void mostrar(){
        System.out.println("Nombre: " + directivo.getNombre());
        System.out.println("Apellido: " + directivo.getApellidos());
        System.out.println("Edad: " + directivo.getEdad());
        System.out.println("DNI: " + directivo.getDni());
        System.out.println("Nombre del Departamento: " + directivo.getDepartamento());
        System.out.println("Beneficios: " + directivo.getPorcentajeBeneficios());
        System.out.println("Beneficios totales: " + directivo.getPorcentajeBeneficios());
    }

    public void pedir(){
        System.out.print("Introduzca el nombre: ");
        directivo.setNombre(sc.nextLine());
        System.out.print("Introduzca el apellido: ");
        directivo.setApellidos(sc.nextLine());
        System.out.print("Introduzca la edad: ");
        directivo.setEdad(sc.nextInt());
        sc.nextLine(); // Salto de línea para INT
        System.out.print("Introduzca el DNI: ");
        directivo.setDni(sc.nextLine());
        System.out.print("Introduzca el nombre del departamento: ");
        directivo.setDepartamento(sc.nextLine());
        System.out.print("Introduzca los beneficios: ");
        directivo.setPorcentajeBeneficios(sc.nextDouble());
    }
}
