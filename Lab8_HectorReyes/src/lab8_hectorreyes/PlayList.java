/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_hectorreyes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Onasis Reyes
 */
public class PlayList {

    private String nomrePlaylist;
    private ArrayList<Cancion> playList = new ArrayList();
    private File archivo = null;

    public PlayList() {
    }

    public PlayList(String nomrePlaylist, String path) {
        this.nomrePlaylist = nomrePlaylist;
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public String getNomrePlaylist() {
        return nomrePlaylist;
    }

    public void setNomrePlaylist(String nomrePlaylist) {
        this.nomrePlaylist = nomrePlaylist;
    }

    public ArrayList<Cancion> getPlayList() {
        return playList;
    }

    public void setPlayList(ArrayList<Cancion> playList) {
        this.playList = playList;
    }

    public void añadirCancion(Cancion cancion) {
        playList.add(cancion);
    }

    @Override
    public String toString() {
        return "PlayList{" + "nomrePlaylist=" + nomrePlaylist + ", playList=" + playList + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write(nomrePlaylist);
            for (Cancion cancion : playList) {
                bw.write(cancion.getNombreCancion() + "|");
                bw.write(cancion.getPuntuación() + "|");
                bw.write(cancion.getAño() + "|");
                bw.write(cancion.getArtistaAlbum() + "|");
                bw.write(cancion.getNombreAlbum());
            }
            bw.flush();
        } catch (IOException e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner leer = null;
        if (archivo.exists()) {
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter("|");
                while (leer.hasNext()) {
                    playList.add(new Cancion(
                            leer.next(),
                            leer.next(),
                            leer.next(),
                            leer.next(),
                            leer.next()));
                    //leer.next()));
                }
            } catch (Exception e) {
            }
            leer.close();
        }
    }

}
