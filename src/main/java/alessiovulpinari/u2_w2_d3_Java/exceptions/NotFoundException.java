package alessiovulpinari.u2_w2_d3_Java.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException{
    public NotFoundException(UUID uuid) {
        super("Oggetto con id: " + uuid + " non trovato! : 404");
    }
}
