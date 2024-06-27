import aplicativos.Chamadas;
import aplicativos.reprodutor.Reprodutor;


public class Celular {
    public static void main(String[] args) {
        //reprodutor
        System.out.println("--Métodos do reprodutor de músicas--");
        Reprodutor reprodutor = new Reprodutor();
        reprodutor.adicionarMusica("Spit It Out", "Slipknot");
        reprodutor.adicionarMusica("Smells Like Teen Spirit", "Nirvana");
        reprodutor.adicionarMusica("Them Bones", "Alice in Chains");
        System.out.println(reprodutor.mostrarQuantidadeMusicas() + " músicas foram adicionadas!!\n");
        reprodutor.playar();
        System.out.println(reprodutor.pausar());


//        //chamadas
        System.out.println("--Métodos das chamadas--");
        Chamadas chamadas = new Chamadas();
        chamadas.chamar("85738066");
        chamadas.atenderRecusar();
        chamadas.caixaPostal();
//
//        // navegador
//        System.out.println("--Métodos do navegador--");
//        Navegador navegador = new Navegador();
//        navegador.abrirPagina();

    }


}
