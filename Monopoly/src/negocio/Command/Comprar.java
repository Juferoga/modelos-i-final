package negocio.Command;

public class Comprar implements Orden {
    private Inventario inventario;
    private int precio;

    public Comprar(Inventario abcStock , int p){
       this.inventario = abcStock;
       this.precio = p ;
    }

    @Override
    public void execute() {
       inventario.Comprar(this.precio);
    }
    
}
