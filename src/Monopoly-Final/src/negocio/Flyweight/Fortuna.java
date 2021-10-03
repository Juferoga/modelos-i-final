package negocio.Flyweight;
import java.util.Random;
public class Fortuna implements FlyweightSuerte {
    final TipoSuerte Tsuerte = TipoSuerte.FORTUNA;
    private String fortuna;
    private String Texto = "Obten una carta de Fortuna";
    private String tipo = null; 

    public void Mostrar(){System.out.println(tipo +"   " + Texto );}

    public void setTipo(String Tipo){
        this.tipo = Tipo;
    }
    
    public void ObtenerSuerte(){
        String[] Fortuna = new String[]{"Gris con manchas negras","Naranja con manchas negras",
                                       "Negra con manchas blancas","Negro","blanco","Naranja"};
        Random r = new Random();
        int posicion = r.nextInt(Fortuna.length);
        this.fortuna = Fortuna[posicion];
        System.out.println(fortuna+" \n");
    }
}
