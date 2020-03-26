/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class CRUD {
    Connection miConexion = (Connection) ConexionBD.GetConnection();

        // Connection conexion = ConexionBD.GetConnection();
        
    public void Insertar (String v_dispo, int v_cant,  String v_persona  ) throws SQLException{
        //java.util.Date fechaActual = new java.util.Date();
        //System.out.println(fechaActual);
        try {
             try (Statement statement = (Statement) miConexion.createStatement()) {
                statement.execute("INSERT INTO entrega(dispositivo,cantidad,fecha,persona_entrega)  VALUES('"+v_dispo+"',"+v_cant+",'2020-05-06','"+v_persona+"')");
            //VALUES('prueba5',4,'2020-05-01','luis')
              System.out.println("PRUEBA ingresada");
            }
            miConexion.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO GUARDO");
        }      // TODO 
    }
}
