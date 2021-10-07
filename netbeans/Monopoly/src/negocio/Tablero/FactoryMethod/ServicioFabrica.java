package negocio.Tablero.FactoryMethod;

public class ServicioFabrica {

    public Servicio getServicio(String tipo){

        if(tipo.equalsIgnoreCase("Electricidad")){
            return new ServicioLuz();
        } else if (tipo.equalsIgnoreCase("Acueducto")){
            return new ServicioAgua();

        }else{
            return null;
        }

    }
}
