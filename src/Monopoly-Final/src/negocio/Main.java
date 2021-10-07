package negocio;

import java.security.Provider.Service;

import negocio.FactoryMethod.Servicio;
import negocio.FactoryMethod.ServicioFabrica;
import negocio.Flyweight.FabricaSuerte;
import negocio.Flyweight.FlyweightSuerte;
import negocio.Prototype.Tren;
import negocio.Prototype.TrenCreador;

public class Main {

    

    public static void main(String[] args) throws CloneNotSupportedException
    {
        //-----------------------Pratron flyweight-------------------------//
         FlyweightSuerte suerte1 = FabricaSuerte.getSuerte( "Suerte" );
         suerte1.Mostrar();
         suerte1.ObtenerSuerte();
         FlyweightSuerte suerte2 = FabricaSuerte.getSuerte( "Suerte" );
         suerte2.Mostrar();
         suerte1.ObtenerSuerte();
         FlyweightSuerte suerte3 = FabricaSuerte.getSuerte( "Suerte" );
         suerte3.Mostrar();
         suerte1.ObtenerSuerte();
         FlyweightSuerte Fortuna1 = FabricaSuerte.getFortuna( "FORTUNA" );
         Fortuna1.Mostrar();
         Fortuna1.ObtenerSuerte();
         FlyweightSuerte Fortuna2 = FabricaSuerte.getFortuna( "FORTUNA" );
         Fortuna2.Mostrar();
         Fortuna2.ObtenerSuerte();
         FlyweightSuerte Fortuna3 = FabricaSuerte.getFortuna( "FORTUNA" );
         Fortuna3.Mostrar();
         Fortuna3.ObtenerSuerte();
         //-----------------Patron prototype----------------------------------//
         Tren tren = new TrenCreador();
         tren.setNombre("Nombre tren 1");
         tren.Mostartren();
         Tren tren2 = tren.clone();
         tren2.setNombre("Nombre tren 2");
         tren2.Mostartren();
         Tren tren3 = tren.clone();
         tren3.setNombre("Nombre tren 3");
         tren3.setPrecio(200);
         tren3.Mostartren();
         Tren tren4 = tren.clone();
         tren4.setNombre("Nombre tren 4");
         tren4.Mostartren();
         //-----------------------------Factory Method--------------------------//
         ServicioFabrica fabrica = new ServicioFabrica();
         
         Servicio agua = fabrica.getServicio("Acueducto");
         agua.Mostrar();
         Servicio luz = fabrica.getServicio("Electricidad");
         luz.Mostrar();
         //--------------------------------Abstrac Factory------------------------//
            
    }
}
