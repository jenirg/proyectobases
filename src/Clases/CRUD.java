/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import conexion.ConexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dell
 */
public class CRUD {
 Connection miConexion = (Connection) ConexionBD.GetConnection();

    public void Insertar_entrega(String v_dispo, int v_cant, String v_persona) throws SQLException {

        try {
            try (Statement statement = (Statement) miConexion.createStatement()) {
                statement.execute("INSERT INTO entrega(dispositivo,cantidad,fecha,persona_entrega)  VALUES('" + v_dispo + "'," + v_cant + ",'2020-05-06','" + v_persona + "')");

                JOptionPane.showMessageDialog(null, "ENTREGA INGRESADA CON ÉXITO");
            }
            miConexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO GUARDO ENTREGA");
        }      // TODO 

    }

    public void Insertar_registro(String dispositivo, int cantidad, String marca, String modelo, String procedencia, String descripcion, float total_monetario, float precio_unitario, int serie_id) throws SQLException {
        //No se esta incluyendo la imagen
        try {
            try (Statement statement = (Statement) miConexion.createStatement()) {
                statement.execute("INSERT INTO registro(dispositivo,cantidad,marca,modelo,procedencia,descripcion,total_monetario,precio_unitario,serie_id)  VALUES('"
                        + dispositivo + "'," + cantidad + ",'" + marca + "','" + modelo + "','" + procedencia + "','" + descripcion + "'," + total_monetario + "," + precio_unitario + "," + serie_id + ")");
                JOptionPane.showMessageDialog(null, "REGISTRO INGRESADO CON ÉXITO");
            }
            //miConexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO GUARDO EL REGISTRO");
        }      // TODO 
    }

    public void Insertar_serie(String no_serie) throws SQLException {

        try {
            try (Statement statement = (Statement) miConexion.createStatement()) {
                statement.execute("INSERT INTO serie(no_serie)  VALUES('" + no_serie + "')");

                JOptionPane.showMessageDialog(null, "SERIE INGRESADA CON ÉXITO");
            }
            //miConexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO GUARDO LA SERIE");
            System.out.println(e);
        }
    }

    public void Insertar_puesto(String el_puesto) throws SQLException {

        try {
            try (Statement statement = (Statement) miConexion.createStatement()) {
                statement.execute("INSERT INTO puesto(el_puesto)  VALUES('" + el_puesto + "')");

                JOptionPane.showMessageDialog(null, "PUESTO INGRESADO CON ÉXITO");
            }
            miConexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO GUARDO LA PUESTO");
        }
    }

    public void Insertar_dependencia(String la_dependencia) throws SQLException {

        try {
            try (Statement statement = (Statement) miConexion.createStatement()) {
                statement.execute("INSERT INTO dependencia(la_dependencia)  VALUES('" + la_dependencia + "')");

                JOptionPane.showMessageDialog(null, "DEPENDENCIA INGRESADA CON ÉXITO");
            }
            miConexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO GUARDO LA DEPENDENCIA");
        }
    }

    public void Insertar_Forma57(String ref_f57, String persona_solicita, String persona_autoriza, String persona_entrega, String persona_recibe) throws SQLException {

        try {
            try (Statement statement = (Statement) miConexion.createStatement()) {
                statement.execute("INSERT INTO forma57 ( ref_f57,persona_solicita,persona_autoriza,persona_entrega,persona_recibe)  VALUES('"
                        + ref_f57 + "','" + persona_solicita + "','" + persona_autoriza + "','" + persona_entrega + "','" + persona_recibe + "')");

                JOptionPane.showMessageDialog(null, "FORMA57 INGRESADA CON ÉXITO");
            }
            miConexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO GUARDO LA FORMA57");
        }
    }




  
   
     public void Insertar_nombre_apellido(String primer_nombre,String segundo_nombre,String primer_apellido,String segundo_apellido,int usuario_id) throws SQLException {

        try {
            try (Statement statement = (Statement) miConexion.createStatement()) {
                statement.execute("INSERT INTO nombre_apellido(primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,usuario_id)  VALUES('"
                        + primer_nombre + "','" + segundo_nombre + "','" + primer_apellido + "','" + segundo_apellido + "," + usuario_id + ")");

                JOptionPane.showMessageDialog(null, "NOMBRE INGRESADO CON ÉXITO");
            }
            miConexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO GUARDO EL REGISTRO");
        }      // TODO 
    }
    public void Insertar_usuario(String cui,Date fecha_nacimiento,String correo,String contraseña,boolean super_usuario, int puesto_id,int dependencia_id) throws SQLException {

        try {
            try (Statement statement = (Statement) miConexion.createStatement()) {
                statement.execute("INSERT INTO usuario(cui,fecha_nacimiento,correo,contraseña,super_usuario,puesto_id,dependencia_id)  VALUES('"
                        + cui + "','" + fecha_nacimiento + "','" + correo + "','" + correo + "','" + contraseña + "','" + super_usuario + "'," + puesto_id + "," + dependencia_id + ")");

                JOptionPane.showMessageDialog(null, "REGISTRO INGRESADO CON ÉXITO");
            }
            miConexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO GUARDO EL REGISTRO");
        }      // TODO 
    }
   public void getconexion() throws SQLException{
        miConexion.close();
   }
 public static void IngresarRegistro(Connection con,String dispositivo,int cantidad,String marca, String modelo,String procedencia,String descripcion,float total_monetario, float precio_unitario) throws SQLException { 
    try(CallableStatement cstmt = con.prepareCall("{call conexion.InsertarRegistro(?, ?, ? ,? ,?, ?, ? ,? )}"); ) {  
        cstmt.setString(1,dispositivo);
        cstmt.setInt(2,cantidad );
        cstmt.setString(3,marca);
        cstmt.setString(4,modelo);
        cstmt.setString(5,procedencia);
        cstmt.setString(6,descripcion);
        cstmt.setFloat(7,total_monetario);
        cstmt.setFloat(8,precio_unitario);
        cstmt.execute();  
        System.out.println("Ingreso correcto");  
    }  
    }
  public static void IngresarEntrega(Connection con, String dispositivo, int cantidad, String persona, String serie) throws SQLException {
        try (CallableStatement cstmt = con.prepareCall("{call conexion.InsertarRegistro(?, ?, ? ,? )}");) {
            cstmt.setString(1, dispositivo);
            cstmt.setInt(2, cantidad);
            cstmt.setString(3, persona);
            cstmt.setString(4, serie);
            cstmt.execute();
            System.out.println("Ingreso correcto");
        }
    }

    public void ConsultaPorNoSerie(int serie, JTextField dispositivo, JTextField modelo, JTextField marca) {
        try {
            //Connection miConexion=(Connection) Conexion.GetConnection();

            Statement s = miConexion.createStatement();
            ResultSet clr = s.executeQuery("select * from registro where serie_id=" + serie );
            while (clr.next())
            {
            dispositivo.setText((clr.getString("dispositivo")));
            modelo.setText((clr.getString("modelo")));
            marca.setText((clr.getString("marca")));
            }         // return cte;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int BuscarElIDSerie(String serie) {
        int IDSerie = 0;
        try {
            //Connection miConexion=(Connection) Conexion.GetConnection();

            Statement s = miConexion.createStatement();
            ResultSet clr = s.executeQuery("select id from serie where no_serie='" + serie + "'");
            while (clr.next()) {
                IDSerie=clr.getInt("id");
                //System.out.println("EL ID DE LA SERIE ENCONTRADA"+ clr.getInt("id") );
            }

        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        return IDSerie;
    }
     public static void InsertarUsuario(Connection con,String correosp,String contraseniasp,String correo,String contraseña, boolean super_usuario, String dependencia_id, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido ) throws SQLException { 
                    
                    try(CallableStatement cstmt = con.prepareCall("{call conexion.InsertarUsuario(?, ?, ? ,?,?,?,?,?,?,?)}"); ) {  
                     cstmt.setString(1,correosp);
                    cstmt.setString(2,contraseniasp);
                    cstmt.setString(3,correo);
                    cstmt.setString(4,contraseña);
                    cstmt.setBoolean(5, super_usuario);
                    cstmt.setString(6,dependencia_id);
                    cstmt.setString(7,primer_nombre);
                    cstmt.setString(8,segundo_nombre);
                    cstmt.setString(9,primer_apellido);
                    cstmt.setString(10,segundo_apellido);
                    cstmt.execute();  
                     System.out.println("Ingreso correcto");  
    
                     }  
                }
     
      public static void InsertarColaborador(Connection con,String primernom, String segundonom,String primerape, String segundoape, String dependenciaid,String puestoid ) throws SQLException { 
                    
          try(CallableStatement cstmt = con.prepareCall("{call conexion.InsertarColaborador(?, ?, ? ,?,?,?)}"); ) {  
                     cstmt.setString(1,primernom);
                    cstmt.setString(2,segundonom);
                    cstmt.setString(3,primerape);
                    cstmt.setString(4,segundoape);
                    cstmt.setString(5,dependenciaid);
                    cstmt.setString(6,puestoid);
                    cstmt.execute();  
                     System.out.println("Ingreso correcto");  
    
                     }  
     }
}
