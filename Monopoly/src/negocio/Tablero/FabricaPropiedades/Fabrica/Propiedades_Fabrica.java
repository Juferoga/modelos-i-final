package negocio.Tablero.FabricaPropiedades.Fabrica;

import negocio.Tablero.FabricaPropiedades.Productos.Propiedad;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Amarillo;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Azul;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Marron;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Morado;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Rojo;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Verde;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_naranja;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Violeta;

public class Propiedades_Fabrica {
    
    public Propiedad getTipo(String tipo){
        
        if(tipo.equalsIgnoreCase("marron")){
            return new Propiedad_Marron();
        } else if (tipo.equalsIgnoreCase("verde")){
            return new Propiedad_Verde();
        } else if (tipo.equalsIgnoreCase("rojo")){
            return new Propiedad_Rojo();
        } else if (tipo.equalsIgnoreCase("naranja")){
            return new Propiedad_naranja();
        } else if (tipo.equalsIgnoreCase("morado")){
            return new Propiedad_Morado();
        } else if (tipo.equalsIgnoreCase("azul")){
            return new Propiedad_Azul();
        } else if (tipo.equalsIgnoreCase("amarillo")){
            return new Propiedad_Amarillo();
        }else if (tipo.equalsIgnoreCase("violeta")){
            return new Propiedad_Violeta();
        }else{
            return null;
        }
    }
}
