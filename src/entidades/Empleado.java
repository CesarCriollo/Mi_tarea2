/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;

/**
 *
 * @author vr
 */
public class Empleado implements Serializable{
    private String id;
    private String nombres;
    private String apellidos;
    private String estado_civil;
    //private String direccion_actual;
    private String dia; //cesar Criollo  cambie direccion actual  por  dia
    private String e_mail;
    private String telefono;
    private int edad;
    private int direccion; //desde github a  NetBeans //cesar Criollo  
    private int domicilio;

    public Empleado(String id, String nombres, String apellidos,String estado_civil,String dia,String e_mail,String telefono, int edad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estado_civil= estado_civil;
       // this.direccion_actual= direccion_actual;
         this.dia= dia;//cesar Criollo  cambie direccion actual  por  dia
        this.e_mail= e_mail;
        this.telefono= telefono;  
        this.edad = edad;
        this.edad = direccion;
        this.edad = domicilio;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

 //   public void setDireccion_actual(String direccion_actual) {
   //     this.direccion_actual = direccion_actual;
   // }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

  //  public String getDireccion_actual() {
   //     return direccion_actual;
   // }

    public String getE_mail() {
        return e_mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getDia() {//cesar Criollo  cambie direccion actual  por  dia
        return dia;
    }

    public void setDia(String dia) {//cesar Criollo  cambie direccion actual  por  dia
        this.dia = dia;
    }

    
    
    
    public void imprimirInfo(){
        System.out.println("-- INFO. PERSONAL --");
        System.out.println("cedula:"+id);
        System.out.println("nombres:"+nombres);
        System.out.println("apellidos:"+apellidos);
        System.out.println("estado_civil:"+estado_civil);
      //  System.out.println("direccion_actual:"+direccion_actual);
        System.out.println("telefono:"+dia);//cesar Criollo  cambie direccion actual  por  dia
        System.out.println("e_mail:"+e_mail);
        System.out.println("telefono:"+telefono);
       
        System.out.println("edad:"+edad);
        System.out.println("edad:"+direccion);
    
    }
    
}
