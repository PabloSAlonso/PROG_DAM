package principal.Ej1;

    public class StringTooLongException extends IllegalArgumentException {
        public StringTooLongException() {
            super("Cadena demasiado larga");
        }
    }

