public class Fecha {
    //#region ATRIBUTOS
    private int dia;
    private int mes;
    private int año;
    //#endregion
    
    //#region GETS
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }
    
    //#endregion

    //#region SETS
    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            dia = 1;
        }
        this.dia = dia;
        
    }


    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        this.mes = mes;
    }


    public void setAño(int año) {
        // if (año < 0) {
        //     año = 0;
        // }
        this.año = año;
    }

    //#endregion

    //#region CONSTRUCTORES
    public Fecha() {
        this.dia = 19;
        this.mes = 6;
        this.año = 2006;
    }

    public Fecha(int dia, int mes, int año) {
        setDia(dia);
        setMes(mes);
        setAño(año);
    }
    //#endregion

    //#region MÉTODOS
    public String fechaFormateada(boolean flag) {
        String fecha = "";
        int opcion;
        if (flag) {
            fecha = String.format("%02d/%02d/%04d", this.dia, this.mes, this.año);
        } else {
         //   do {
                opcion = this.mes;
                switch (opcion) {
                    case 1:
                    fecha = String.format("%02d de Enero del %04d", this.dia,this.año);
                        break;
                        
                    case 2:
                    fecha = String.format("%02d de Febrero del %04d", this.dia, this.año);
                    break;
                    
                    case 3:
                    fecha = String.format("%02d de Marzo del %04d", this.dia, this.año);
                    break;
                    
                    case 4:
                    fecha = String.format("%02d de Abril del %04d", this.dia, this.año);
                    break;
                    
                    case 5:
                    fecha = String.format("%02d de Mayo del %04d", this.dia, this.año);
                    break;
                    
                    case 6:
                    fecha = String.format("%02d de Junio del %04d", this.dia, this.año);
                    break;
                    
                    case 7:
                    fecha = String.format("%02d de Julio del %04d", this.dia, this.año);
                    break;
                    
                    case 8:
                    fecha = String.format("%02d de Agosto del %04d", this.dia, this.año);
                    break;
                    
                    case 9:
                    fecha = String.format("%02d de Septiembre del %04d", this.dia, this.año);
                    break;
                    
                    case 10:
                    fecha = String.format("%02d de Octubre del %04d", this.dia, this.año);
                    break;
                    
                    case 11:
                    fecha = String.format("%02d de Noviembre del %04d", this.dia, this.año);
                    break;
                    
                    case 12:
                    fecha = String.format("%02d de Diciembre del %04d", this.dia, this.año);
                    break;
                
                    default:
                }
                
         //   } while (opcion < 1 || opcion > 12);
        }
        return fecha;
    }
    public static int diferenciaFechas(Fecha f, Fecha f2){
        int diferencia;
        if (f.getAño() > f2.getAño()){
            diferencia = f.getAño() - f2.getAño();
        } else{
            diferencia = f2.getAño() - f.getAño();
        }
        return diferencia;
    }
    //#endregion
}