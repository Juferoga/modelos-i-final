package negocio.Flyweight;

import java.util.HashMap;

public class FabricaSuerte 
{

    private static final HashMap<String,FlyweightSuerte> cartaMap = new HashMap<>();
 
    public static FlyweightSuerte getSuerte(String tipo) 
    {
        String key = tipo + "-SUERTE" ;
         
        FlyweightSuerte carta = cartaMap.get(key);
         
        if(carta != null) {
            System.out.println("Estado: Ya existe");
            return carta;
        } else {
            carta= new Suerte();
            carta.setTipo(tipo);
            cartaMap.put(key, carta);
            System.out.println("Estado: Se creo");
        }
         
        return carta;
    
    }

    public static FlyweightSuerte getFortuna(String tipo) 
    {
        String key = tipo + "-FORTUNA";
         
        FlyweightSuerte carta = cartaMap.get(key);
         
        if(carta != null) {
            System.out.println("Estado: Ya existe");
            return carta;
        } else {
            carta= new Fortuna();
            carta.setTipo(tipo);
            cartaMap.put(key, carta);
            System.out.println("Estado: Se creo");
        }
         
        return carta;
    }
    

}
