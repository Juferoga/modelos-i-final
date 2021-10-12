package negocio.Command;

public class Embargar implements Orden {
    private Inventario inventario;
    private int precio;

    public Embargar(Inventario abcStock , int p){
       this.inventario = abcStock;
       this.precio = p ;
    }


    @Override
    public void execute() {
       inventario.Embargo(precio);
    }
}
