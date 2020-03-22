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
public class Almacen_Pass {

    private short tipoHash;//Si es uno es hash división si es 2 es hash multiplicación
    private Lista[] listaArreglo;
    private int contador = 0;

    public Almacen_Pass(short tipo) {
        tipoHash = tipo;
        listaArreglo = new Lista[30];//Esto esta definido en el pdf del proyecto
    }

    public int limitar_dpi(String dpi) {
        String cui = "";
        int el_cui = 0;
        for (int x = 0; x < 9; x++) {
            cui += (dpi.charAt(x));
        }
        return el_cui = Integer.parseInt(cui);
    }

    public void Ingreso(String nombre, int tel, String Organizacion, String Correo, String Comentario) {
        insertar(nombre, tel, Organizacion, Correo, Comentario, this.posicionDivision(tel));//se llama a la funcion insertar

    }

    public void insertar(String nombre, int tel, String Organizacion, String Correo, String Comentario, int Inserto) {

        if (listaArreglo[Inserto] == null) {//Es por que la lista no a insertado
            Lista provisional = new Lista();//Ya que antes no existia ninguna lista en esa posicion
            provisional.insertar(tel, nombre, Organizacion, Correo, Comentario);
            System.out.println("Inserto en la posicion " + Inserto + "Esta vacia la lista");
            listaArreglo[Inserto] = provisional;
        } else {
            System.out.println("Existen elementos en la posición");
            contador++;
            insertar(nombre, tel, Organizacion, Correo, Comentario, doblehashing(tel, contador));//se llama a la funcion insertar

        }
    }

    private int posicionDivision(int val) {
        return (val % listaArreglo.length);
    }

    public int doblehashing(int val, int cont) {
        int h1 = val % 31;
        int h2 = (1 + (val % (30)));
        return (h1 + cont * h2) % 31;

    }

    public void buscar(int numero) {
        int Inserto = 0;
        Elemento Encontrado = new Elemento();
        Inserto = this.posicionDivision(numero);

        if (listaArreglo[Inserto] == null) {//Esto si es numero en un prinicipio su modulo nunca se a insertado
            System.out.println("No se enontro su número");
        } else {
            System.out.println("Busco en  " + Inserto);
            Encontrado = listaArreglo[Inserto].buscar(numero);
            if (Encontrado == null) {
                System.out.println("No se encuentra su elemento");
            } else {
                System.out.println("Nombre: " + Encontrado.getNombre() + " Tel: " + Encontrado.getTel() + " Organización: "
                        + Encontrado.getOrganizacion() + "" + " Correo: " + Encontrado.getCorreo() + " Comentario " + Encontrado.getComentario());
            }
        }
    }

    public void mostrar() {
        int val = 0;
        for (Lista valor : listaArreglo) {
            if (valor != null) {
                System.out.println("Posicion " + val + ", Valores:");
                valor.mostrar();
            }
            val++;
        }
    }

    public void eliminar(int numero) {
        int Inserto = 0;
        Elemento Encontrado = new Elemento();
        Inserto = this.posicionDivision(numero);

        if (listaArreglo[Inserto] == null) {//Esto si es numero en un prinicipio su modulo nunca se a insertado
            System.out.println("No se enontro su número");
        } else {
            System.out.println("Busco en  " + Inserto);
            Encontrado = listaArreglo[Inserto].buscar(numero);
            if (Encontrado == null) {
                System.out.println("No se encuentra su elemento");
            } else {
                listaArreglo[Inserto].eliminar(numero);
                System.out.println("Dato eliminado");
            }
        }
    }
}
