/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_hectorreyes;

/**
 *
 * @author Onasis Reyes
 */
public class Cancion {

    private String nombreCancion;
    private String puntuación;
    private String año;
    private String artistaAlbum;
    private String nombreAlbum;

    public Cancion() {
    }

    public Cancion(String nombreCancion, String puntuación, String año, String artistaAlbum, String nombreAlbum) {
        this.nombreCancion = nombreCancion;
        this.puntuación = puntuación;
        this.año = año;
        this.artistaAlbum = artistaAlbum;
        this.nombreAlbum = nombreAlbum;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(String puntuación) {
        this.puntuación = puntuación;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getArtistaAlbum() {
        return artistaAlbum;
    }

    public void setArtistaAlbum(String artistaAlbum) {
        this.artistaAlbum = artistaAlbum;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    @Override
    public String toString() {
        return nombreCancion;
    }

}
