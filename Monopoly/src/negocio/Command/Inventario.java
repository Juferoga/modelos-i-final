package negocio.Command;

public class Inventario {

    private int posicion ;
    private int saldo ;

    public Inventario(int p , int v){
        this.posicion = p;
        this.saldo = v;

    }

    public void Comprar(int precio){
       this.saldo = this.saldo- precio;     
    }
    
    public void Embargo(int precio){
        this.saldo = this.saldo + precio;
    }
}
