package negocio.Tablero.Prototype;

public class TrenCreador extends Tren {
    @Override
    public void Mostartren() {
        System.out.println("nombre :" + this.getNombre() + "  Precio: " + this.getPrecio() + " Vendido:  " + this.getComprado());   
    }
}
