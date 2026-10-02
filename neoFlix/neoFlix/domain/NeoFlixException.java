package domain;

public class NeoFlixException extends Exception {

    public static final String TO_BE_IMPLEMENTED = "Funcionalidad pendiente de implementación";
    public static final String VALUE_UNKNOWN = "Valor no reconocido";
    public static final String DATA_ERROR = "Error en los datos";
    public static final String CONTENT_EMPTY = "No hay contenido";
    
    
    public NeoFlixException() {
        super("Ha ocurrido un error en la aplicación");
    }

    
    public NeoFlixException(String mensaje) {
        super(mensaje);
    }

    
    public NeoFlixException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
