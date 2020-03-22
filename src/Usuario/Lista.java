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
class Lista {
     private Elemento inicio;
    private int size;
         
    public Lista() {
        inicio = null;
        size = 0;
    }
    
    public void insertar(int n, String name, String orga, String email, String comment){
        inicio = agregar(n,inicio, name, orga, email, comment);
    }
    
    private Elemento agregar(int num, Elemento elemento, String name, String orga, String email, String comment){
        if(elemento==null){
            elemento = new Elemento(num, name, orga, email, comment);            
        }
        else{
            if(elemento.getTel()<num)
                elemento.setSiguiente(agregar(num, elemento.getSiguiente(), name, orga, email, comment));
            else
            {
                Elemento aux = new Elemento(num, name, orga, email, comment);
                aux.setSiguiente(elemento);
                elemento=aux;
            }
        } 
        size ++;
        return elemento;
    }
    
    public void mostrar(){
        Elemento aux = inicio;
        if (inicio != null){
            for (int i = 0; i<=size; i++){
                System.out.println("Nombre: "+ aux.getNombre() + " Tel: " + aux.getTel() + " Organización: " 
                + aux.getOrganizacion() + "" + " Correo: " + aux.getCorreo() + " Comentario " + aux.getComentario());
                if(aux.getSiguiente() == null){
                    break;
                }
                aux = aux.getSiguiente();
            }
        }
        else{System.out.println("No hay elementos para mostrar");}
    }

    public Elemento buscar(int numero){
        Elemento aux = inicio;
        Elemento Aencontrar = inicio;
        if (inicio != null){
            for (int i = 0; i<=size; i++){
                if(aux.getTel() == numero){
                    Aencontrar = aux;
                    break;
                }else{//Esto solo es por si no lo encuentra
                    Aencontrar = null;
                }
                if(aux.getSiguiente() == null){
                    break;
                }
                aux = aux.getSiguiente();
            }
        }
        return Aencontrar;
    }
     public void eliminar (int n){
        Elemento actual=new Elemento();
        Elemento anterior=new Elemento();
        actual=inicio;
        Boolean encontrado=false;
        if (inicio!=null && encontrado!=true){
            while(actual!=null){
                if (actual.getTel()==(n)){
                    if(actual==inicio){
                        inicio=inicio.getSiguiente();
                    }
                    else{
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                    encontrado=true;
                }
                anterior=actual;
    
            actual=actual.getSiguiente();
            }
        }
        else {
            System.out.println("La agenda está vacia");
        }
    }
    public int getSize() {
        return size;
    }

    public Elemento getInicio() {
        return inicio;
    }
}
