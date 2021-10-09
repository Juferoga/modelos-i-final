package negocio.Tablero.FactoryMethod;

public class ServicioLuz implements Servicio {
    
    private String nombre;
    private int precio;
    private boolean comprado;

    public ServicioLuz (){
        nombre = "Servicio de electricidad";
        precio = 200;
        comprado =false;
    }

    @Override
    public void Mostrar() {
        System.out.println(this.nombre + " precio:" + this.precio+"  ocupado:"+ this.comprado);
    }
}
