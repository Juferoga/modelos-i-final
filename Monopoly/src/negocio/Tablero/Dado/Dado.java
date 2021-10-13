package negocio.Tablero.Dado;

import java.util.Random;

public class Dado {

  boolean Estado = false;
  
  int d1, d2, sum;

  public Dado(){
    
  }

  public int TirarDado(){

    d1 = GenerarAleatorio();
    d2 = GenerarAleatorio();

    sum = d1+d2;

    if (d1 == d2){
      Estado = true;
    }else{
      Estado = false;
    }
    return sum;

  }
  
  public int GenerarAleatorio(){
    Random aleatorio = new Random();
    int dado;

    dado = aleatorio.nextInt(6)+1;

    return dado;
  }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getD2() {
        return d2;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
  
}
