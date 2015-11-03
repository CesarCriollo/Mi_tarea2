package archivo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirArchivo
{
   private ObjectOutputStream salida;
   
   // ABRIR ARCHIVO
   public void abrir(String ruta_archivo)throws IOException{
      try{
         File f = new File(ruta_archivo);
         FileOutputStream fos   =   new FileOutputStream(f,true);
         if(f.exists() && f.length()>0)
             salida = new ObjectOutputStream(fos) {protected void writeStreamHeader() throws IOException{}};     
         else
             salida = new ObjectOutputStream(fos);         
      }catch( IOException e ){
         System.err.println("ERROR ABRIENDO EL ARCHIVO." );
         throw e;
      }
   }

   // INSERTAR UN OBJETO AL ARCHIVO
   public void insertar_objeto(Object obj)throws IOException{
         try{
               salida.writeObject(obj); 
               salida.flush();
         }catch(IOException e){
            System.err.println("ERROR ESCRIBIENDO EN EL ARCHIVO.");
            throw e;
         }
   }

   // BORRAR CONTENIDO DE ARCHIVO
   public void borrar_contenido(String ruta_archivo)throws IOException{
      try{
          File archivo = new File(ruta_archivo);
          archivo.delete();
          FileOutputStream fos = new FileOutputStream(archivo,true);
            if (archivo.exists() && archivo.length()>0)
                salida = new ObjectOutputStream(fos){protected void writeStreamHeader() throws IOException{}};
            else
                salida = new ObjectOutputStream(fos); 
      }catch(IOException e){
         System.err.println("ERROR BORRANDO CONTENIDO DEL ARCHIVO.");
         throw e;
      }
   }

   // CERRAR ARCHIVO
   public void cerrar()throws IOException{
      try{
         if(salida != null)
            salida.close();
      }catch(IOException e){
         System.err.println("ERROR CERRANDO ARCHIVO");
         throw e;
      }
   }   
}

