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
        
        switch(posicion) {
            case 1:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 2:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 3:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 4:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 5:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 6:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 7:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 8:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 9:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 10:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 11:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 12:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 13:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 14:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 15:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 16:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 17:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 18:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 19:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 20:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 21:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 22:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 23:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 24:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 25:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 26:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 27:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 28:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 29:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 30:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 31:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 32:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 33:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 34:
                this.pos_x=20;
                this.pos_y=20;
            break;
	    case 35:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 36:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 37:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 38:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 39:
                this.pos_x=20;
                this.pos_y=20;
            break;
            case 40:
                this.pos_x=20;
                this.pos_y=20;
            break;
            default:
                this.pos_x=10;
                this.pos_y=10;
        }
    }

   public Ficha(){
	posicion = 0;
   } 

   public int getPosicion(){
   	return posicion;
   }

   public void setPosicion(int pos){
   	this.posicion = pos;
   }
}
