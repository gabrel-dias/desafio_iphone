public class Aplicativos {
    // atributos do reprodutor de músicas
    private String nomeMusica;
//    private String artista;
//    private List<Aplicativos> musicas = Arrays.asList()

//    public String getArtista() {
//        return artista;
//    }

//    public void setArtista(String artista) {
//        this.artista = artista;
//    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public void play(String nomeMusica) {
        setNomeMusica(nomeMusica);
//        setArtista(artista);
        System.out.println("Reproduzindo agora: " + getNomeMusica());
    }

    public String pause() {
        return "Música pausada.";
    }

    // TODO fazer método para selecionar músicas de uma lista

}
