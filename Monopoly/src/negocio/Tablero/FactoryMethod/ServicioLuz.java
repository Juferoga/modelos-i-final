package negocio.Tablero.FactoryMethod;

public class ServicioLuz implements Servicio {
    
    int valor;
    String Nombre;

    public ServicioLuz (int p ,String n){
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
