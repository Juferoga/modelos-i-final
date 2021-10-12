package negocio.Tablero.FabricaPropiedades.Productos;

public class Propiedad_Morado implements Propiedad{

    private String Nombre;
    private int Precio;
    private boolean Comprado;

    @Override
    public void Mostrar() {
        System.out.println("Creo estrato2 Morado");
    } 
}
