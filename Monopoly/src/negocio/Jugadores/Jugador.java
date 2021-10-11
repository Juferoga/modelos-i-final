package negocio.Jugadores;

import negocio.Tablero.Ficha.Ficha;

public class Jugador extends Ficha{
    String nombre ;
    int saldo =50000;

    public Jugador(String nombre, int posicion) {
        super(posicion);
        this.nombre = nombre;
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

}
