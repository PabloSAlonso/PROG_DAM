package principal.Ej4;

public class Empleado extends Persona {
    // #region ATRIBUTOS

    private double salarioAnual;
    private double irpf;

    // #endregion

    // #region GETS Devuelven los atribuos deseados

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public double getIrpf() {
        return this.irpf;
    }

    // #endregion

    // #region SETS Instaura condiciones para las inicializaciones de Atributos

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
        super("", "", 0, "");
        this.salarioAnual = 0;
        this.irpf = 7.5;
    }

    public Empleado(String nombre, String apellidos, int edad, String dni, double salario) {
        // Mediante parámetros metemos set para que compruebe las cantidades antes de
        // usarlas
        super(nombre, apellidos, edad, dni);
        setSalarioAnual(salario);
        // getIrpf(); // El irpf no se pasa como parámetro por depender del salario
    }

    // #endregion

    // #region MÉTODOS
    public double hacienda() {
        return getSalarioAnual() * getIrpf() / 100;
    }
    // #endregion

    // Metodo de persona implementado
    @Override
    public String firmaMail() {
        return "Nombre:" + this.getNombre() + " Apellido:" + this.getApellidos();
    }
}
