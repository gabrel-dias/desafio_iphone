package aplicativos.reprodutor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Reprodutor {
    private List<Musica> musicasList;

    public Reprodutor() {
        this.musicasList = new ArrayList<>();
    }

    // métodos do reprodutor
    public void adicionarMusica(String nomeMusica, String artista) {
        musicasList.add(new Musica(nomeMusica, artista));
        System.out.println("A música " + nomeMusica + " do artista " + artista + " foi adicionada a lista!");
    }

    public int mostrarQuantidadeMusicas() {
        return musicasList.size();
    }

    public void playar() {
        if (!musicasList.isEmpty()) {
            Iterator<Musica> musicaIterator = musicasList.iterator();
            System.out.println("Músicas que estão na lista:");
            while (musicaIterator.hasNext()) {
                Musica musica = musicaIterator.next();
                System.out.println(musicasList.indexOf(musica) + " - " + musica.getNomeMusica() + " - " + musica.getArtista());
            }
            System.out.println("Escolha uma música para tocar:");
            Scanner escolhaIndex = new Scanner(System.in);
            int indiceLista = escolhaIndex.nextInt();
            System.out.println("Tocando agora: " + musicasList.get(indiceLista) + "...\n");
        }
    }
//        System.out.println("Reproduzindo agora: "+musicasList.get(indiceLista));

    public String pausar() {
        return "Música pausada.\n";
    }


}
