package negocio.Flyweight;
import java.util.Random;
public class Suerte implements FlyweightSuerte {
    
    final TipoSuerte Tsuerte = TipoSuerte.SUERTE;
    private String Texto = "Obten una carta de suerte";
    private String tipo = null; 
    private String Suerte;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
    public void ObtenerSuerte()
    {
        
        String[] color = new String[]{"Gris con manchas negras","Naranja con manchas negras",
                                       "Negra con manchas blancas","Negro","blanco","Naranja"};
        Random r = new Random();
        int posicion = r.nextInt(color.length);
        this.Suerte = color[posicion];
        System.out.println(Suerte+" \n");

    }
    @Override
    public void Mostrar( ){
        System.out.println(tipo +"   " + Texto );
    }  
}
