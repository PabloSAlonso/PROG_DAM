package principal.Ej4;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

    abstract String firmaMail();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellido) {
        this.apellidos = apellido;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) { //TODO hacer
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public Persona(String nombre, String apellido, int edad, String dni) {
        setNombre(nombre);
        setApellidos(apellido);
        setEdad(edad);
        setDni(dni);
    }

    public Persona() {
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Apellidos %s", getNombre(), getApellidos());
    }
}