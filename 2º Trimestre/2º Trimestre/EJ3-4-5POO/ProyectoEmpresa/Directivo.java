public class Directivo {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String departamento;
    private double porcentajeBeneficios;
    //#region GETS

    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public String getDni(){
        return dni;
    }
    public String getDepartamento(){
        return "\"" + departamento + "\"";
    }
    public double getPorcentajeBeneficios() {
        return porcentajeBeneficios;
    }

    //#endregion

    //#region SETS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento.toUpperCase();
    }
    public void setPorcentajeBeneficios(double porcentajeBeneficios) {
        if (porcentajeBeneficios > 100 || porcentajeBeneficios < 0){
            porcentajeBeneficios = 0;
        }
        this.porcentajeBeneficios = porcentajeBeneficios;
    }

    //#endregion

    public Directivo(String nombre,String apellidos,int edad,String dni,String departmento,double porcentajeBeneficios){
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
        setDepartamento(departmento);
        setPorcentajeBeneficios(porcentajeBeneficios);
    }
    public Directivo(){
        nombre = "";
        apellidos = "";
        edad = 0;
        dni = "";
        departamento = "";
        porcentajeBeneficios = 0;
    }
    //#region MÉTODOS
    public double calcularBeneficio(double beneficioEmpresa){
        return getPorcentajeBeneficios() < 0 ? 0 : getPorcentajeBeneficios()*beneficioEmpresa/100;
    }
    //#endregion
}
