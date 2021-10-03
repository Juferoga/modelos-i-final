package negocio.FactoryMethod;

public class ServicioAgua implements Servicio {
    
    private String nombre;
    private int precio;
    private boolean comprado;

    public ServicioAgua (){
        nombre = "Servicio de acueducto";
        precio = 200;
        comprado =false;
    }

 
    @Override
    public void Mostrar() {
        System.out.println(this.nombre + " precio:" + this.precio+"  ocupado:"+ this.comprado);
    }
    
}
