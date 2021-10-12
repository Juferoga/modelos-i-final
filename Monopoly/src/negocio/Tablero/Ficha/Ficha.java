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
                if (posicion >= 3 || posicion >= 11){ return 495 -(50*(posicion-2)); }
                else{
                    if (posicion >= 21 || posicion == 31){ return 25*3; }
                    else{
                        return 0;
                    }
                }
            }
       }
   }

   public int calcPosicion_y(int posicion){
        if(posicion >= 1 || posicion <= 11 ){ return 25;  }
        else{
            if(posicion >= 21 || posicion <=31 ){ return 25*11; }
            else{
                if (posicion == 12 || posicion == 39){ return 25*2; }
                else{
                    if (posicion == 13 || posicion == 38){ return 25*3; }
                    else{
                        if (posicion == 14 || posicion == 37){ return 25*4; }
                        else{
                            if (posicion == 15 || posicion == 36){ return 25*5; }
                            else{
                                if (posicion == 16 || posicion == 35){ return 25*6; }
                                else{
                                    if (posicion == 17 || posicion == 34){ return 25*7; }
                                    else{
                                        if (posicion == 18 || posicion == 33){ return 25*8; }
                                        else{
                                            if (posicion == 19 || posicion == 32){ return 25*9; }
                                            else{
                                                if (posicion == 20 || posicion == 31){ return 25*10; }
                                                else{
                                                    return 0;
                                                }
                                            }
                                        }
                                    }   
                                }
                            }
                        }
                    }
                }
            }
        }
   }
}
