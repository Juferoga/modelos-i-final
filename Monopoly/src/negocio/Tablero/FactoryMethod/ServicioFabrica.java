package negocio.Tablero.FactoryMethod;

public class ServicioFabrica {

    public Servicio getServicio(String tipo , int p , String n){

        if(tipo.equalsIgnoreCase("Electricidad")){
            return new ServicioLuz(p,n);
        } else if (tipo.equalsIgnoreCase("Acueducto")){
            return new ServicioAgua(p,n);

        }else{
            return null;
        }

    }
}
