/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author dell
 */
class Elemento {
     private int tel;
    private String nombre, organizacion, correo, comentario;
    private Elemento siguiente;
    
    public Elemento(){//Esto es si queremos crear un elemento sin pasarle datos
    
    }
    
    public Elemento(int dato, String name, String orga, String email, String comment){
        this.tel = dato;
        this.nombre = name;
        this.organizacion = orga;
        this.correo = email;
        this.comentario = comment;
        this.siguiente = null;
    }
    
    public Elemento getSiguiente(){
        return siguiente;
    }
    
     public void setSiguiente(Elemento elemento){
        siguiente = elemento;
    }

    public int getTel() {
        return tel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getComentario() {
        return comentario;
    }
    
     
}
