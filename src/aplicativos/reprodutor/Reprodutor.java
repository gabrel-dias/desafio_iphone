package aplicativos.reprodutor;

import java.util.ArrayList;
import java.util.List;

public class Reprodutor {
    private List<Musicas> musicasList;

    public Reprodutor() {
        this.musicasList = new ArrayList<>();
    }

    // métodos do reprodutor
    public void adicionarMusicaNa() {

    }

    public void mostrarListaMusicas() {

    }

    public void play(String nomeMusica) {
        System.out.println("Reproduzindo agora: ");
    }

    public String pause() {
        return "Música pausada.\n";
    }

    // TODO selecionar músicas de uma lista


}
