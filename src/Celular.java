import aplicativos.*;
import aplicativos.reprodutor.Reprodutor;


public class Celular {
    public static void main(String[] args) {
        //reprodutor
        System.out.println("--Métodos do reprodutor de músicas--");
        Reprodutor reprodutor = new Reprodutor();
        reprodutor.playar("Spit It Out");
        System.out.println(reprodutor.pausar());

        //chamadas
        System.out.println("--Métodos das chamadas--");
        Chamadas chamadas = new Chamadas();
        chamadas.chamar("85738066");
        chamadas.atenderRecusar();
        chamadas.caixaPostal();

        // navegador
        System.out.println("--Métodos do navegador--");
        Navegador navegador = new Navegador();
        navegador.abrirPagina();

    }


}
