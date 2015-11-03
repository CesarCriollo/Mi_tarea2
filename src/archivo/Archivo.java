
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import entidades.Empleado;
import java.io.IOException;
import java.util.ArrayList;
//import utilidades.Validacion;

/**
 *
 * @author VR
 */
public class Archivo{
    private static final String RUTA_ARCHIVO = "empleados.txt";
    
    public static boolean crear(){
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_ARCHIVO);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static boolean borrar_contenido(){
        try{
            EscribirArchivo archivo = new EscribirArchivo();
            archivo.borrar_contenido(RUTA_ARCHIVO);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static ArrayList<Empleado> obtener_registros()throws Exception{
        ArrayList<Empleado> empleados;
        try{
            LeerArchivo archivo = new LeerArchivo();
            archivo.abrir(RUTA_ARCHIVO);
            empleados = archivo.obteniendo_objetos();
            archivo.cerrar();
        }catch(Exception e){
            throw e;
        }    
        return empleados;        
    }
    
    public static boolean insertar_registro(Empleado p){
        EscribirArchivo archivo = new EscribirArchivo();
        try{
            archivo.abrir(RUTA_ARCHIVO);
            archivo.insertar_objeto(p);
            archivo.cerrar(); 
        }catch(Exception e){
            return false;
        }                          
        return true;
    }
    
   /* public static boolean actualizar_registro(Empleado p){
         ArrayList<Empleado> empleados = null;
         try{
            empleados = Archivo.obtener_registros();
            int indice = Validacion.existeEmpleado(empleados,p);
            empleados.set(indice, p);
         }catch(Exception e){
             return false;
         }
         return Archivo.actualizar_registros(empleados);         
    }*/
    
    public static boolean actualizar_registros(ArrayList empleados){
        borrar_contenido();
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_ARCHIVO);
            for(int i=0;i<empleados.size();i++)
                archivo.insertar_objeto(empleados.get(i));
            archivo.cerrar();
        }catch(Exception e){
            return false;
        }                 
        return true;
    }
    
    public static boolean actualizarDatosEmpleado(Empleado p){        
        ArrayList<Empleado> registros = null;
        
        try{
            registros = Archivo.obtener_registros();
            for(int i=0;i<registros.size();i++){
                Empleado tmp = registros.get(i); 
                if(tmp.getId().equals(p.getId())){                
                    p.setId(tmp.getId());
                    p.setNombres(tmp.getNombres());
                    p.setApellidos(tmp.getApellidos());
                    p.setEstado_civil(tmp.getEstado_civil());
                    p.setDireccion_actual(tmp.getDireccion_actual());
                    p.setE_mail(tmp.getE_mail());
                    p.setTelefono(tmp.getTelefono());
                    
                    p.setEdad(tmp.getEdad());
                    return true;
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
    
}



