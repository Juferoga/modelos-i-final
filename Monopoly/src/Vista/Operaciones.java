/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import negocio.Tablero.FabricaPropiedades.Fabrica.Propiedades_Fabrica;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad;
import negocio.Tablero.FactoryMethod.Servicio;
import negocio.Tablero.FactoryMethod.ServicioFabrica;
import negocio.Tablero.Flyweight.FabricaSuerte;
import negocio.Tablero.Flyweight.FlyweightSuerte;
import negocio.Tablero.Prototype.Tren;
import negocio.Tablero.Prototype.TrenCreador;

/**
 *
 * @author juferoga
 */
public class Operaciones {

    public Operaciones() {
        
        //-----------------------------Factory Method--------------------------//
        Propiedades_Fabrica p_fabrica = new Propiedades_Fabrica();    

        Propiedad almacenesTriunfo = p_fabrica.getTipo("amarillo");
        Propiedad almacenesLa18 = p_fabrica.getTipo("amarillo");    
        Propiedad almacenesMiCasa = p_fabrica.getTipo("amarillo");    

        Propiedad calleBachue = p_fabrica.getTipo("naranja");
        Propiedad calleIguaque = p_fabrica.getTipo("naranja");
        Propiedad calleBague = p_fabrica.getTipo("naranja");

        Propiedad rinhoMail = p_fabrica.getTipo("morado");
        Propiedad almacenesPiloto = p_fabrica.getTipo("morado");
        Propiedad tiendasArgo = p_fabrica.getTipo("morado");

        Propiedad cafeArabe = p_fabrica.getTipo("marron");
        Propiedad cafeOmg = p_fabrica.getTipo("marron");

        Propiedad saludSms = p_fabrica.getTipo("verde");
        Propiedad saludCtr = p_fabrica.getTipo("verde");
        Propiedad saludInt = p_fabrica.getTipo("verde");

        Propiedad zapateria = p_fabrica.getTipo("rojo");
        Propiedad bolsosMochilas = p_fabrica.getTipo("rojo");
        Propiedad Accesorios = p_fabrica.getTipo("rojo");

        Propiedad amarilloRadio = p_fabrica.getTipo("azul");
        Propiedad amarilloNoticias = p_fabrica.getTipo("azul");
        Propiedad amarilloCCTV = p_fabrica.getTipo("azul");

        //-----------------------Pratron flyweight-------------------------//
        FlyweightSuerte Fortuna1 = FabricaSuerte.getFortuna( "FORTUNA" );
        FlyweightSuerte Fortuna2 = FabricaSuerte.getFortuna( "FORTUNA" );
        FlyweightSuerte Fortuna3 = FabricaSuerte.getFortuna( "FORTUNA" );
        
        FlyweightSuerte suerte1 = FabricaSuerte.getSuerte( "Suerte" );
        FlyweightSuerte suerte2 = FabricaSuerte.getSuerte( "Suerte" );
        FlyweightSuerte suerte3 = FabricaSuerte.getSuerte( "Suerte" );

        //-----------------Patron prototype----------------------------------//
        
        Tren tren = new TrenCreador();
        try {
            Tren tren2 = tren.clone();
            Tren tren3 = tren.clone();
            Tren tren4 = tren.clone();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        //-----------------------------Factory Method--------------------------//
        ServicioFabrica fabrica = new ServicioFabrica();
        Servicio luz = fabrica.getServicio("Electricidad");
        Servicio agua = fabrica.getServicio("Acueducto");
        
    }
    
    public int transferir(){
        return 1;
    }

    public int comprar(){
        return 1;
    }
    
    public int vender(){
        return 1;
    }
    
}
