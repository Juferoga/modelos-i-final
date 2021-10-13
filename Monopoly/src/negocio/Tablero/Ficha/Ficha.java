/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.Tablero.Ficha;

/**
 *
 * @author brayan
 */
public class Ficha {
   
   int posicion;
   int pos_x;
   int pos_y;

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public Ficha(int posicion, int pos_x, int pos_y) {
        this.posicion = posicion;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }
    
    /*public Ficha(int posicion) {
        this.posicion = posicion;
        this.pos_x = calcPosicion_x(posicion);
        this.pos_y = calcPosicion_y(posicion);
    }*/

   public Ficha(){
	posicion = 0;
   } 

   public int calcPosicion_x(int posicion){
       
       if(posicion == 1  ){ return 555;  }
       else{
            if(posicion == 2 ){ return 495; }
            else{
                if (posicion >= 3 && posicion <= 11){ return 495 -(50*(posicion-2)); }
                else{
                    if (posicion == 22 ){ return 105; }
                    else{
                        if(posicion >= 23 && posicion <= 31){ return 105 + (50*(posicion-22));}
                        else{
                            return 0;
                        }
                    }
                }
            }
       }
   }

   public int calcPosicion_y(int posicion){
            if(posicion == 12 ){ return 510; }
            else{
                if (posicion >= 13 && posicion <= 21){ return 510-(50 * (posicion-12)); }
                else{
                    if (posicion == 32){ return 105; }
                    else{
                        if(posicion >= 33 && posicion <= 40){return 105 + (50*(posicion-32));}
                        else{
                            return 0;
                        }
                    }
                }
            }  
   }
}
