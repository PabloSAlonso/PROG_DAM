import java.util.Scanner;

public class IUEmpleado {
    Scanner sc = new Scanner(System.in);
    //#region PROPIEDADES
    public Empleado empleado;
    
    public IUEmpleado(Empleado empleado){
        this.empleado = empleado;
    }
    //#endregion
    //#region MÉTODOS
    public void mostrar(){
        System.out.println("Nombre: "+empleado.getNombre());
        System.out.println("Apellidos: "+empleado.getApellido());
        System.out.println("Edad: "+empleado.getEdad());
        System.out.println("Dni: "+empleado.getDni());
        System.out.println("Salario: "+empleado.getSalarioAnual());
        System.out.println("IRPF: "+empleado.getIrpf());
    }
    public void pedir(){
        System.out.println("Porfavor introduce el nombre del empleado");
        empleado.setNombre(sc.nextLine());
        System.out.println("------------------------------------------");
        System.out.println("Ahora los apellidos");
        empleado.setApellido(sc.nextLine());
        System.out.println("------------------------------------------");
        System.out.println("Introduce la edad");
        empleado.setEdad(sc.nextInt());
        System.out.println("------------------------------------------");
        System.out.println("A continuacion el dni");
        sc.nextLine();
        empleado.setDni(sc.nextLine());
        System.out.println("------------------------------------------");
        System.out.println("Por último el salario");
        empleado.setSalarioAnual(sc.nextDouble());
        System.out.println("------------------------------------------");
    }
    public void mostrar(int opcion){
            switch (opcion) {
                case 1:
                    System.out.printf("El nombre del empleado es %s con apellidos %s\n"
                    , empleado.getNombre(),empleado.getApellido());
                    break;
                case 2:
                    System.out.printf("El empleado tiene %d años\n"
                    , empleado.getEdad());
                    break;
                case 3:
                    System.out.printf("El DNI del empleado es %s\n"
                    , empleado.getDni());
                    break;
                case 4:
                    System.out.printf("El salario del empleado son %.2f euros e irpf de %.2f por ciento\n"
                    , empleado.getSalarioAnual(),empleado.getIrpf());
                    break;
                case 5:
                    System.out.printf("Hacienda realizara un robo de %.2f euros a este empleado\n"
                    ,empleado.hacienda());
                    break;
                case 6:
                    System.out.printf("El empleado %s de apellidos %s de %3d años con DNI %s y salario %6.2f recibirá una puñalada de hacienda de %6.2f euros");
                default:
                    System.out.println("Opcion incorrecta");
                    opcion = sc.nextInt();
                    
            }
    }
    //#endregion
}
