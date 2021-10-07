package negocio.Tablero.Prototype;

public abstract class Tren implements Cloneable {

    private String Nombre;
    private int Precio = 100;
    private boolean Comprado = false;

    public Tren clone() throws CloneNotSupportedException {
        return (Tren)super.clone();

    }

    public abstract void Mostartren();

    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre( String nombre){
      this.Nombre = nombre;
    }
    public int getPrecio(){
        return this.Precio;
    }
    public void setPrecio( int precio){
      this.Precio = precio;
    }
    public boolean getComprado(){
        return this.Comprado;
    }
    public void setComprado( boolean comprado){
      this.Comprado = comprado;
    }
}
