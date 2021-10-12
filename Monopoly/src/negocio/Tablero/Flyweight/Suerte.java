package negocio.Tablero.Flyweight;
import java.util.Random;
public class Suerte implements FlyweightSuerte {
    
    final TipoSuerte Tsuerte = TipoSuerte.SUERTE;
    private String Texto = "Obten una carta de suerte";
    private String tipo = null; 
    private String Suerte;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
    public String ObtenerSuerte()
    {
        
        String[] Fortuna = new String[]{"Gana 100","paga 20",
                                       "gana 200","gana 2","pierde 2","pierde 2"};
        Random r = new Random();
        int posicion = r.nextInt(Fortuna.length);
        this.Suerte = Fortuna[posicion];
        return Suerte;

    }

    @Override
    public void Mostrar( ){
        System.out.println(tipo +"   " + Texto );
    }  
}
