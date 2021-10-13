package negocio.Tablero.FabricaPropiedades.Fabrica;

import negocio.Tablero.FabricaPropiedades.Productos.Propiedad;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Amarillo;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Azul;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Marron;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Morado;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Rojo;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Verde;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_Violeta;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad_naranja;

public class Propiedades_Fabrica {
    
    public Propiedad getTipo(String tipo , int p , String n){
 
        if(tipo.equalsIgnoreCase("marron")){
            return new Propiedad_Marron(p,n);
        } else if (tipo.equalsIgnoreCase("verde")){

            return new Propiedad_Verde( p , n);
        } else if (tipo.equalsIgnoreCase("rojo")){
            return new Propiedad_Rojo(p,n);
        } else if (tipo.equalsIgnoreCase("naranja")){
            return new Propiedad_naranja(p,n);
        } else if (tipo.equalsIgnoreCase("morado")){
            return new Propiedad_Morado(p,n);
        } else if (tipo.equalsIgnoreCase("azul")){
            return new Propiedad_Azul(p,n);
        } else if (tipo.equalsIgnoreCase("amarillo")){
            return new Propiedad_Amarillo(p,n);
        }else if (tipo.equalsIgnoreCase("violeta")){
            return new Propiedad_Violeta(p,n);
        }
        else{
            return null;
        }
    }
}
