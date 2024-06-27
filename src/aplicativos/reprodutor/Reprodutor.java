package aplicativos.reprodutor;

import java.util.ArrayList;
import java.util.List;

public class Reprodutor {
    private List<Musica> musicaList;

    public Reprodutor() {
        this.musicaList = new ArrayList<>();
    }

    // métodos do reprodutor
    public void adicionarMusicaNa(String nome, String artista) {
        musicaList.add(new Musica(nome, artista));
        System.out.println("A música " + nome + " do artista" + artista + " foi adicionada a lista");
    }

    public List<Musica> mostrarListaMusicas() {
        return musicaList;
    }

    public void playar(String nomeMusica) {
        if (!musicaList.isEmpty())  {
        System.out.println("Reproduzindo agora: " + mostrarListaMusicas());

        } else System.out.println("A lista está vazia");
    }

    public String pausar() {
        return "Música pausada.\n";
    }

    // TODO selecionar músicas de uma lista


}
