package principal.Ej5;

import java.util.InputMismatchException;

public class RadioException extends InputMismatchException{
    public RadioException(){
        super("Radio negativo no es válido");
    }
}
