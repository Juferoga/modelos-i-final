package negocio.Jugadores;

import negocio.Tablero.Ficha.Ficha;

public class Jugador /*extends Ficha*/{
    String nombre;
    int saldo;
    private boolean carcel;
    private int[] propiedades;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.saldo = 50000;
        this.carcel = true;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    public int[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(int[] propiedades) {
        this.propiedades = propiedades;
    }

}
