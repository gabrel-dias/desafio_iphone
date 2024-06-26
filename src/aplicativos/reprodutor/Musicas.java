package aplicativos.reprodutor;

public class Musicas {
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

    public Musicas(String nomeMusica, String artista) {
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
