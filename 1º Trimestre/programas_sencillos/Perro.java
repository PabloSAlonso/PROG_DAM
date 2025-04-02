public class Perro {
    public String raza;
    public String nombre;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int a) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }

    }

    private double temperatura;

    public void setTemperatura(double temperatura) {
        // Se guarda la temperatura
        this.temperatura = temperatura;
        // Y se cambia el valor de fiebre.
        if (temperatura > 39) {
            fiebre = true;
        } else {
            fiebre = false;
        }
        // Se podría poner, y sería mejor: temperatura = a > 39;
    }

    public double getTemperatura() {
        return temperatura;
    }

    private boolean fiebre;

    public boolean getFiebre() {
        return fiebre;
    }

    public Perro(String nombre, String raza, int edad, double temperatura) {
        this.nombre = nombre;
        this.raza = raza;
        setEdad(edad);
        setTemperatura(temperatura);
    }

    public void ladrar() {
        System.out.println("GUAU!!!");
    }

    public void ladrar(int n) {
        for (int i = 0; i < n; i++) {
            ladrar();
        }
    }

    public void ladrar(char idioma) {
        switch (idioma) {
            case 'I': // Inglés
            case 'i': // Inglés
                System.out.println("BARK!!!");
                break;
            case 'F': // Francés
            case 'f': // Francés
                System.out.println("WOF!!!");
                break;
            case 'A': // Alemán
            case 'a': // Alemán
                System.out.println("KETEMUERDEN!!!");
                break;
            default:
                ladrar();
        }
    }

    static String definicion = "El mejor y más baboso amigo del hombre";

    public void regurgitar(Comida c) {
        c.nombre = "bolo alimenticio";
        c.precio = 0;
    }

}
