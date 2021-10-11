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

    public Ficha(int posicion, int pos_x, int pos_y) {
        this.posicion = posicion;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }
    
    public Ficha(int posicion) {
        this.posicion = posicion;
        this.pos_x = calcPosicion_x(posicion);
        this.pos_y = calcPosicion_y(posicion);
    }

   public Ficha(){
	posicion = 0;
   } 

   public int calcPosicion_x(int posicion){

        switch(posicion) {
            case 1:
                return 20;
            break;
            case 2:
                return 20;
            break;
            case 3:
                return 20;
            break;
            case 4:
                return 20;
            break;
            case 5:
                return 20;
            break;
            case 6:
                return 20;
            break;
            case 7:
                return 20;
            break;
            case 8:
                return 20;
            break;
            case 9:
                return 20;
            break;
            case 10:
                return 20;
            break;
            case 11:
                return 20;
            break;
            case 12:
                return 20;
            break;
            case 13:
                return 20;
            break;
            case 14:
                return 20;
            break;
            case 15:
                return 20;
            break;
            case 16:
                return 20;
            break;
            case 17:
                return 20;
            break;
            case 18:
                return 20;
            break;
            case 19:
                return 20;
            break;
            case 20:
                return 20;
            break;
            case 21:
                return 20;
            break;
            case 22:
                return 20;
            break;
            case 23:
                return 20;
            break;
            case 24:
                return 20;
            break;
            case 25:
                return 20;
            break;
            case 26:
                return 20;
            break;
            case 27:
                return 20;
            break;
            case 28:
                return 20;
            break;
            case 29:
                return 20;
            break;
            case 30:
                return 20;
            break;
            case 31:
                return 20;
            break;
            case 32:
                return 20;
            break;
            case 33:
                return 20;
            break;
            case 34:
                return 20;
            break;
            case 35:
                return 20;
            break;
            case 36:
                return 20;
            break;
            case 37:
                return 20;
            break;
            case 38:
                return 20;
            break;
            case 39:
                return 20;
            break;
            case 40:
                return 20;
            break;
            default:
                return 10;
        }

   }

   public int calcPosicion_y(int posicion){

        switch(posicion) {
            case 1:
                return 20;
            break;
            case 2:
                return 20;
            break;
            case 3:
                return 20;
            break;
            case 4:
                return 20;
            break;
            case 5:
                return 20;
            break;
            case 6:
                return 20;
            break;
            case 7:
                return 20;
            break;
            case 8:
                return 20;
            break;
            case 9:
                return 20;
            break;
            case 10:
                return 20;
            break;
            case 11:
                return 20;
            break;
            case 12:
                return 20;
            break;
            case 13:
                return 20;
            break;
            case 14:
                return 20;
            break;
            case 15:
                return 20;
            break;
            case 16:
                return 20;
            break;
            case 17:
                return 20;
            break;
            case 18:
                return 20;
            break;
            case 19:
                return 20;
            break;
            case 20:
                return 20;
            break;
            case 21:
                return 20;
            break;
            case 22:
                return 20;
            break;
            case 23:
                return 20;
            break;
            case 24:
                return 20;
            break;
            case 25:
                return 20;
            break;
            case 26:
                return 20;
            break;
            case 27:
                return 20;
            break;
            case 28:
                return 20;
            break;
            case 29:
                return 20;
            break;
            case 30:
                return 20;
            break;
            case 31:
                return 20;
            break;
            case 32:
                return 20;
            break;
            case 33:
                return 20;
            break;
            case 34:
                return 20;
            break;
            case 35:
                return 20;
            break;
            case 36:
                return 20;
            break;
            case 37:
                return 20;
            break;
            case 38:
                return 20;
            break;
            case 39:
                return 20;
            break;
            case 40:
                return 20;
            break;
            default:
                return 10;
        }

    }
}
