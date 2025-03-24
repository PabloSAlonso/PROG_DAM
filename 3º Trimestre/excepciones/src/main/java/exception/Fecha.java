package exception;

public class Fecha {
    private int mes;

    public void setMes (int mes){
        if (mes < 1 || mes > 12){
            throw new IllegalArgumentException("Mes invalido");
        }
        this.mes = mes;
    }
    public int getMes (){
        return this.mes;
    }
}
