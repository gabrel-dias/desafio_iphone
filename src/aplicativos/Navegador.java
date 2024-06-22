package aplicativos;

import java.awt.*;
import java.net.URI;

public class Navegador {
    public void abrirPagina() {
        try {
//            String url = "https://linktr.ee/tecdias";
            URI uri = new URI("https://linktr.ee/tecdias");
            Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
