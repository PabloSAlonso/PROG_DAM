package boletin5.ejercicio5;

import java.time.LocalDate;

public class Ventas {
    public int[] ventasMes = new int[12];

    private int año;

    // #region GET SET AÑO

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        int añoActual = LocalDate.now().getYear();
        if (año >= añoActual) {
            año -= 1;
        }
        this.año = año;
    }
    // #endregion

    public Ventas(int año) {
        for (int i = 0; i < ventasMes.length; i++) {
            this.ventasMes[i] = (int) (Math.random() * 999 + 1);
        }
        setAño(año);
    }

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

    public double media() {
        double suma = 0;
        for (int i = 0; i < ventasMes.length; i++) {
            suma += ventasMes[i];
        }
        return suma / ventasMes.length;
    }

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

}
