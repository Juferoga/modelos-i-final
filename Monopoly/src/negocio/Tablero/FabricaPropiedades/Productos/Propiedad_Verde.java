package negocio.Tablero.FabricaPropiedades.Productos;

public class Propiedad_Verde implements Propiedad {
    int valor;
    String Nombre;

    public Propiedad_Verde (int p ,String n){
        this.Nombre = n;
        this.valor = p;
    }

    @Override
    public String getNombre() {
        return this.Nombre;
    }
    @Override
    public int getPrecio() {
        return this.valor;
    }
    
}
