/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaz;

import Clases.CRUD;
import Usuario.Compresor;
import conexion.ConexionBD;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class PanelMail2 extends javax.swing.JFrame {
 CRUD miCrud = new CRUD();
    Connection con = (Connection) ConexionBD.GetConnection();
    String pass_concatenada1 = "", pass_concatenada2 = "", correo = "", contrasenia="";
     correo c = new correo();
     String correo3,contraseña3; 
     String primer_nombre3, segundo_nombre3,  primer_apellido3, segundo_apellido3;
    int codigo;
    int numero, numero2;
    int multiplicacion =0;
    int ubicaciondeform=0;
    CRUD micrud=new CRUD();
    
    Connection miConexion = (Connection) ConexionBD.GetConnection();
    /**
     * Creates new form PanelMail2
     */
    public PanelMail2() {
        initComponents();
    }
    public PanelMail2(String correo,String contraseña, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido) {
        //ubicaciondeform =ubicaciondeformV;
        initComponents();
        this.setLocationRelativeTo(null);
        correo3=correo;
        contraseña3 = contraseña;
        primer_nombre3=primer_nombre;
        segundo_nombre3=segundo_nombre;
        primer_apellido3=primer_apellido;
        segundo_apellido3=segundo_apellido;
    }
    
    
    
    public void enviarCorreo(){
        numero = (int)(Math.random()*99);
        numero2 = (int)(Math.random()*100);
        multiplicacion = numero* numero2;
        c.setContrasenia("conejofeliz");
        c.setUsuarioCorreo("proyectobasesja@gmail.com");
        c.setAsunto("SU CÓDIGO DE VERIFICACIÓN");
        c.setMensaje("SU CÓDIGO ES:"+" "+multiplicacion);
        c.setDestino(txtdestino.getText().trim());
        Controlador co = new Controlador();
       if(co.enviarCorreo(c)){
           JOptionPane.showMessageDialog(null, "CORREO ENVIADO");
       }else{
           JOptionPane.showMessageDialog(null, "ERROR");
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdestino = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        btnEnviar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enviar a:");

        txtdestino.setText("ejemplo@gmail.com");
        txtdestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdestinoKeyPressed(evt);
            }
        });

        btnEnviar.setBackground(new java.awt.Color(153, 0, 0));
        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ingrese el código: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CONFIRMACIÓN DE IDENTIDAD: ");

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoKeyPressed(evt);
            }
        });

        btnEnviar1.setBackground(new java.awt.Color(153, 0, 0));
        btnEnviar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnviar1.setText("VERIFICAR");
        btnEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addGap(77, 77, 77))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEnviar1))
                            .addGap(3, 3, 3))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnEnviar)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnEnviar1)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
          pass_concatenada2="";
      
         char[] contraseña = jPasswordField1.getPassword();
            for (int i = 0; i < contraseña.length; i++) {
                pass_concatenada2 = pass_concatenada2 + contraseña[i];
                System.out.println(contraseña[i]);
            }
        String pass= (comprimir(pass_concatenada2));
        System.out.println(pass_concatenada2);
        System.out.println("pass comprimirda "+ pass);
        String correo=txtdestino.getText();
        boolean superU=micrud.BusquedaDeSuperUsuario(correo, pass);
        if (superU==true){
            enviarCorreo();
        }
        else{
           JOptionPane.showMessageDialog(null, "EL CORREO NO SERA ENVIADO PORQUE USTED NO ES EL SUPER USUARIO ACTUAL");

        }
       
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed
        // TODO add your handling code here:
             if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            codigo =  Integer.parseInt(txtcodigo.getText());
        }
    }//GEN-LAST:event_txtcodigoKeyPressed

    private void btnEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar1ActionPerformed
        // TODO add your handling code here:
        // if (ubicaciondeform==1){
            //para cambio de contraseña
            codigo = Integer.parseInt(txtcodigo.getText());
            System.out.println(codigo);
            String correo=txtdestino.getText();
            if(codigo == multiplicacion){
                try {
                    micrud.ActualizarSuperUsuario(miConexion, correo3, contraseña3, primer_nombre3,segundo_nombre3, primer_apellido3,segundo_apellido3);
                    /* datossp datos = new datossp();
                    datos.setVisible(true);
                    dispose();*/
                } catch (SQLException ex) {
                    Logger.getLogger(PanelMail2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }//}

    }//GEN-LAST:event_btnEnviar1ActionPerformed

    private void txtdestinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdestinoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            codigo =  Integer.parseInt(txtcodigo.getText());
        }
    }//GEN-LAST:event_txtdestinoKeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           
            contrasenia=pass_concatenada2;
             System.out.println(pass_concatenada2);
             System.out.println(comprimir(pass_concatenada2));
             jPasswordField1.requestFocus();
        }
    }                                          
    public String getContraseña(){
    return contrasenia;
    }
      private String comprimir(String frase) {
        Compresor compresor = new Compresor();
        String Cadena_en_binario = compresor.CodigoAscii_a_binario(frase);
        String cadena_simple = compresor.cadena_RLE(Cadena_en_binario);
        String ultima_cadena = compresor.rle_a_Ascii(cadena_simple);
        return ultima_cadena;
    }//GEN-LAST:event_jPasswordField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelMail2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelMail2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelMail2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelMail2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelMail2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviar1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdestino;
    // End of variables declaration//GEN-END:variables
}
