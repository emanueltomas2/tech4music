package br.com.tech4me.tech4music.shared;



public class MusicaDto {
    private String id;
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private int anoLancamento;

    public String getId() {
        return this.id;
    }
    public String getAlbum() {
        return this.album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAnoLancamento() {
        return this.anoLancamento;
    }
    public void setAnoLancament(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return this.artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
   
}