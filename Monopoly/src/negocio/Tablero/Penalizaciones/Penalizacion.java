package negocio.Tablero.Penalizaciones;
import java.util.Random;
public class Penalizacion {
    String pena;
    public String ObtenerPena()
    {
        
        String[] Fortuna = new String[]{"Gris con manchas negras","Naranja con manchas negras",
                                       "Negra con manchas blancas","Negro","blanco","Naranja"};
        Random r = new Random();
        int posicion = r.nextInt(Fortuna.length);
        this.pena = Fortuna[posicion];
        return pena;

    }
}
