package aplicativos.reprodutor;

public class Musica {
    private String nomeMusica;
    private String artista;

    // getters e setters
    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Musica(String nomeMusica, String artista) {
        this.nomeMusica = nomeMusica;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Musicas{" +
                "nomeMusica='" + nomeMusica + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
