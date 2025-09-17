package principal.Ej4;

public class Directivo extends Persona {

    private String departamento;
    private double porcentajeBeneficios;

    // #region GETS

    public String getDepartamento() {
        return "\"" + departamento + "\"";
    }

    public double getPorcentajeBeneficios() {
        return porcentajeBeneficios;
    }

    // #endregion

    // #region SETS

    public void setDepartamento(String departamento) {
        this.departamento = departamento.toUpperCase();
    }

    public void setPorcentajeBeneficios(double porcentajeBeneficios) {
        if (porcentajeBeneficios > 100 || porcentajeBeneficios < 0) {
            porcentajeBeneficios = 0;
        }
        this.porcentajeBeneficios = porcentajeBeneficios;
    }

    // #endregion

    public Directivo(String nombre, String apellidos, int edad, String dni, String departmento,
            double porcentajeBeneficios) {
        super(nombre, apellidos, edad, dni);
        setDepartamento(departmento);
        setPorcentajeBeneficios(porcentajeBeneficios);
    }

    public Directivo() {
        super("", "", 0, "");
        departamento = "";
        porcentajeBeneficios = 0;
    }

    // #region MÉTODOS
    public double calcularBeneficio(double beneficioEmpresa) {
        return getPorcentajeBeneficios() < 0 ? 0 : getPorcentajeBeneficios() * beneficioEmpresa / 100;
    }

    // #endregion
    @Override
    public String firmaMail() {
        return "Nombre:" + super.getNombre() + " Apellido:" + super.getApellidos() + " Departamento: " + "*"
                + this.getDepartamento().trim() + "*";
    }
}
