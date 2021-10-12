package negocio.Command;
import java.util.ArrayList;
import java.util.List;

public class invoker {
    
   private List<Orden> ordenList = new ArrayList<Orden>(); 

   public void RecibirOrden(Orden orden){
      ordenList.add(orden);		
   }

   public void RealizarOrden(){
      for (Orden orden : ordenList) {
         orden.execute();
      }
      ordenList.clear();
   }
}
