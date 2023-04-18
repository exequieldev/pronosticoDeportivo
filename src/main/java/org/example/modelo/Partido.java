package org.example.modelo;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;

    private int golesEquipo1;
    private int GolesEquipo2;

    public Partido() {
    }

    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int folesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.GolesEquipo2 = folesEquipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getFolesEquipo2() {
        return GolesEquipo2;
    }

    public void setFolesEquipo2(int folesEquipo2) {
        this.GolesEquipo2 = folesEquipo2;
    }
}
