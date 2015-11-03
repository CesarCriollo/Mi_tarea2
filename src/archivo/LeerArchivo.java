

package archivo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class LeerArchivo
{
   private ObjectInputStream entrada;

   public void abrir(String ruta_archivo)throws IOException{
      try{
         entrada = new ObjectInputStream(new FileInputStream(ruta_archivo));
      }catch(IOException e){
         System.err.println("ERROR ABRIENDO EL ARCHIVO.");
         throw e;
      }
   }

   public ArrayList obteniendo_objetos()throws Exception{
      Object obj;
      ArrayList registros = new ArrayList();
            
      try{ 
         while(true){              
            try{
                obj = (Object)entrada.readObject();
            }catch(Exception e){
                break;
            }
            registros.add(obj);                
         }
      }catch(Exception e){
          System.err.println("ERROR LEYENDO ARCHIVO.");
          throw e;
      }
      return registros;
   }
   
   public void cerrar()throws IOException{
      try{
         if(entrada != null)
            entrada.close();         
      }catch(IOException e){
         System.err.println("ERROR CERRANDO ARCHIVO.");
         throw e;
      }
   }
}