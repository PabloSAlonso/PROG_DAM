package boletin5.ejercicio5;

import java.time.LocalDate;

public class Ventas {
    public int[] ventasMes = new int[12];

    private int año;

    // #region GET SET AÑO

    /**
     * Devuelve el valor de la propiedad Año
     * @return la propiedad Año
     */
    public int getAño() {
        return this.año;
    }

    /**
     * Establece el valor de la propiedad Año, Si el parametro es mayor que el año actual le resta 1.
     * @param año El valor de la propiedad al que queremos pasarle las comprobaciones
     */
    public void setAño(int año) {
        int añoActual = LocalDate.now().getYear();
        if (año >= añoActual) {
            año -= 1;
        }
        this.año = año;
    }
    // #endregion

    //#region CONSTRUCTORES

    /**
     * Inicializa la propiedad año como parámetro y crea un Array de 12 posiciones con valores aleatorios entre 0 y 999 ambos inclusive
     * @param año La propiedad año que establece con set
     */
    public Ventas(int año) {
        for (int i = 0; i < ventasMes.length; i++) {
            this.ventasMes[i] = (int) (Math.random() * 999 + 1);
        }
        setAño(año);
    }
    /**
     * Inicia las propiedades a los parametros, en caso de que el Array pasado no tenga 12 posiciones le asignará, de nuevo, valores aleatorios entre 0 y 999 incluidos ambos.
     * @param año Inicializa la propiedad año al parametro
     * @param ventasMes Inicializa la propiedad ventasMes al parametro
     */
    public Ventas(int año, int[] ventasMes) {
        if (ventasMes.length != 12) {
            for (int i = 0; i < ventasMes.length; i++) {
                this.ventasMes[i] = (int) (Math.random() * 999 + 1);
            }
        } else {
            this.ventasMes = ventasMes;
        }
        setAño(año);
    }
    //#endregion 

    //#region METODOS

    /**
     * Calcula la media de los valores de un Array
     * @return La media calculada
     */
    public double media() {
        double suma = 0;
        for (int i = 0; i < ventasMes.length; i++) {
            suma += ventasMes[i];
        }
        return suma / ventasMes.length;
    }

    /**
     * Muestra la gráfica de las ventas, por cada 100 uds añade un # a la derecha, empezando ya teniendo uno aún estando por debajo de las 100 ventas
     */
    public void grafica() {
        int mes = 0;
        System.out.printf("Año %d: ",año);
        for (int i = 0; i < ventasMes.length; i++) {
            String asterisco = "#";
            int auxiliar = ventasMes[i];
            while (auxiliar > 100) {
                auxiliar -= 100;
                asterisco += "#";
            }
            mes += 1;
            System.out.printf("\nMes %2d %4s): %s", mes,"("+ ventasMes[i], asterisco);
        }
    }
    //#endregion
}
