public class Empleado {
    // #region ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private double salarioAnual;
    private double irpf;
    // #endregion

    // #region GETS Devuelven los atribuos deseados
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public double getIrpf() {
        return this.irpf;
    }
    // #endregion

    // #region SETS Instaura condiciones para las inicializaciones de Atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
        if (this.salarioAnual <= 6000) {
            this.irpf = 7.5;
        } else if (this.salarioAnual > 6000 && this.salarioAnual < 30000) {
            this.irpf = 15;
        } else {
            this.irpf = 20;
        }
    }
    // #endregion

    // #region CONSTRUCTORES 1 Vacio y Uno con parámetros

    public Empleado() {
        this.nombre = "" ;
        this.apellido = "" ;
        this.edad = 0;
        this.dni = "" ;
        this.salarioAnual = 0;
        this.irpf = 7.5;
    }

    public Empleado(String nombre, String apellido, int edad, String dni, double salario){
        //Mediante parámetros metemos set para que compruebe las cantidades antes de usarlas
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setDni(dni);
        setSalarioAnual(salario);
       // getIrpf(); // El irpf no se pasa como parámetro por depender del salario
    }

    // #endregion

    // #region MÉTODOS
    public double hacienda(){
        return getSalarioAnual() * getIrpf() / 100;
    }
    // #endregion
}