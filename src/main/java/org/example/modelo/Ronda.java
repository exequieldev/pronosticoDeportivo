package org.example.modelo;

import java.util.List;

public class Ronda {
    private String nro;
    private List<Partido> partido;

    public Ronda() {
    }

    public Ronda(String nro, List<Partido> partido) {
        this.nro = nro;
        this.partido = partido;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public List<Partido> getPartido() {
        return partido;
    }

    public void setPartido(List<Partido> partido) {
        this.partido = partido;
    }
}
