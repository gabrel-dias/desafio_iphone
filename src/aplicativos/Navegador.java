package aplicativos;

import java.awt.*;
import java.net.URI;

public class Navegador {
    public void abrirPagina() {
        try {
            URI uri = new URI("https://linktr.ee/tecdias"); // criação de um URI que será utilizado como URL,
            // é preciso fazer um tratamento de exceção, pois é lançada a URISyntaxException

            Desktop.getDesktop().browse(uri); // o método browse abre o navegador padrão da máquina do usuário na url
            // que foi previamente inserida
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
