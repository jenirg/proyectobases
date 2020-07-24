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
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author dell
 */
public class Ingreso extends javax.swing.JFrame {

    int numerodpi, nopregunta, p1, p2, p3, p4, p5, boton_numero;
     CRUD miCrud = new CRUD();
    Connection con = (Connection) ConexionBD.GetConnection();
    String pregunta, correo = "", contraseña = "", usuario = "";
    Password contraseña3;
    String pass_concatenada;
    public boolean ver = true;

    /**
     * Creates new form Ingreso
     */
    public Ingreso() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtPassOculto.setVisible(true);
        txtPassVisible.setVisible(false);
    }

    public Ingreso(int numero_del_boton) {
        initComponents();
        this.setLocationRelativeTo(null);
        txtPassOculto.setVisible(true);
        txtPassVisible.setVisible(false);
        boton_numero = numero_del_boton;

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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldUser = new javax.swing.JTextField();
        txtPassOculto = new javax.swing.JPasswordField();
        jButtonsesion = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPassVisible = new javax.swing.JTextField();
        jButtonsesion1 = new javax.swing.JButton();
        jButtonsesion2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldUser.setBackground(new java.awt.Color(153, 153, 255));
        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        jTextFieldUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUserKeyPressed(evt);
            }
        });

        txtPassOculto.setBackground(new java.awt.Color(153, 153, 255));
        txtPassOculto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassOcultoActionPerformed(evt);
            }
        });
        txtPassOculto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassOcultoKeyPressed(evt);
            }
        });

        jButtonsesion.setBackground(new java.awt.Color(0, 0, 51));
        jButtonsesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonsesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsesion.setText("Iniciar Sesion ");
        jButtonsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsesionActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");

        txtPassVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassVisible.setForeground(new java.awt.Color(255, 255, 255));
        txtPassVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassVisibleActionPerformed(evt);
            }
        });
        txtPassVisible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassVisibleKeyPressed(evt);
            }
        });

        jButtonsesion1.setBackground(new java.awt.Color(0, 0, 51));
        jButtonsesion1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonsesion1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsesion1.setText("OLVIDE CONTRASEÑA");
        jButtonsesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonsesion1MouseClicked(evt);
            }
        });
        jButtonsesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsesion1ActionPerformed(evt);
            }
        });

        jButtonsesion2.setBackground(new java.awt.Color(0, 0, 51));
        jButtonsesion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonsesion2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsesion2.setText("Crear cuenta");
        jButtonsesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsesion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonsesion2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonsesion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonsesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(207, 207, 207))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtPassOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonsesion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(txtPassVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonsesion2)
                    .addComponent(jButtonsesion))
                .addGap(95, 95, 95))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed
    private String comprimir(String frase) {
        Compresor compresor = new Compresor();
        String Cadena_en_binario = compresor.CodigoAscii_a_binario(frase);
        String cadena_simple = compresor.cadena_RLE(Cadena_en_binario);
        String ultima_cadena = compresor.rle_a_Ascii(cadena_simple);
        return ultima_cadena;
    }
    private void jButtonsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsesionActionPerformed
        // TODO add your handling code here:
        /*usuario = jTextFieldUser.getText();
        System.out.println("1 Usuario" + usuario);
        char[] contraseña = txtPassOculto.getPassword();
        System.out.println("2 Contraseña" + contraseña);*/
        usuario = jTextFieldUser.getText();
        pass_concatenada = "";
        char[] contraseña = txtPassOculto.getPassword();
            for (int i = 0; i < contraseña.length; i++) {
                pass_concatenada = pass_concatenada + contraseña[i];
                System.out.println(contraseña[i]);
            }
        String pass= (comprimir(pass_concatenada));
        System.out.println(usuario);
        System.out.println(pass_concatenada);
        System.out.println("pass comprimirda "+ pass);
        
            
        boolean entrada = miCrud.accesoUsuario(correo, pass);
        if (entrada==true){
        //miCrud.InsertarUsuario(con, usuario, pass,correoE,contraseñaE,super_usuarioE,dependencia_idE,primer_nombreE, segundo_nombreE, primer_apellidoE, segundo_apellidoE);
        Menu menu = new Menu();
        menu.setVisible(true);
     
        }else if (entrada==false){
            Menu menu = new Menu();
            menu.setVisible(false);
            JOptionPane.showMessageDialog(null, "SUS DATOS NO FUERON ENCONTRADOS EN LA BASE DE DATOS");
        }
        
        if (usuario.equals("") || pass_concatenada.equals("")) {
            JOptionPane.showMessageDialog(null, "No ha  llenado correctamente los datos ");
        }else{
            if (usuario.equals("prueba@gmail.com")&&pass_concatenada.equals("1234abcd")){
        //verificar que la cuenta exista y sea la correcta BD
                System.out.println("si es igual la contraseña y usuario");
        if (boton_numero == 1) {
            inventario inventario = new inventario();
            inventario.setVisible(true);
            dispose();
        } else if (boton_numero == 2) {
            entrega entrega = new entrega();
            entrega.setVisible(true);
            dispose();
        } else if (boton_numero == 3) {
            Colaborador xx = new Colaborador();
            xx.setVisible(true);
            dispose();
        } else if (boton_numero == 4) {

        }
            }
            else {
            JOptionPane.showMessageDialog(null, "SUS DATOS NO SON CORRECTOS");
            
            }
        }
    }//GEN-LAST:event_jButtonsesionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu menul = new Menu();
        menul.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUserKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuario = jTextFieldUser.getText();
             txtPassOculto.setText("");
            txtPassOculto.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldUserKeyPressed

    private void txtPassOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassOcultoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassOcultoActionPerformed

    private void txtPassOcultoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassOcultoKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pass_concatenada = "";
            char[] contraseña = txtPassOculto.getPassword();
            for (int i = 0; i < contraseña.length; i++) {
                pass_concatenada = pass_concatenada + contraseña[i];
                System.out.println(contraseña[i]);
            }
            System.out.println("pass   "+pass_concatenada);
            //contraseña= txtPassOculto.getPassword();
            //contraseña3=txtPassOculto.getPassword();
            //String contraseña_SU = (String) txtPassOculto.getPassword();
        }
    }//GEN-LAST:event_txtPassOcultoKeyPressed

    private void txtPassVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassVisibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassVisibleActionPerformed

    private void txtPassVisibleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassVisibleKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassVisibleKeyPressed

    private void jButtonsesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsesion1ActionPerformed
        // TODO add your handling code here:
      PanelMail yy = new PanelMail(1);
         yy.setVisible(true);


    }//GEN-LAST:event_jButtonsesion1ActionPerformed
    private void mostrar_formulario_confirmacion() {
        confirmacion confirmacion = new confirmacion();
        confirmacion.setVisible(true);
        dispose();
    }

    private void generar_actualizacion(String respuesta_extraida, String respuesta) {
        String resp = comprimir(respuesta);
        if (respuesta_extraida.equals(resp)) {
            String pp= (String) JOptionPane.showInputDialog("Ingrese la nueva contraseña");
            String pc= (String) JOptionPane.showInputDialog("Confirme la contraseña");

            String pass_principal =comprimir(pp);
            String pass_confirmacion =comprimir(pp);
            if (pass_principal.equals(pass_confirmacion)){
                            //actualizar datos de esta persona
            JOptionPane.showMessageDialog(null, "SU CONTRASEÑA SE ACTUALIZO CON EXITO");
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO FUE LA RESPUESTA CORRECTA, DEBE INICIAR CON EL TRAMITE");
        }
    }

 
    private void jButtonsesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonsesion1MouseClicked
        // TODO add your handling code here:
        //buscar el número de pregunta de x usuario y comparar su resputa
        /*  nopregunta = (int) (Math.random() * 6) + 1;
        //return numerodado;
        if (nopregunta == 1) {
            pregunta = (String) JOptionPane.showInputDialog("¿Nombre de su primera mascota?");
            verificacion("hola", pregunta);

        } else if (nopregunta == 2) {
            pregunta = (String) JOptionPane.showInputDialog("¿Nombre de su primmera maestra?");
            verificacion("hola", pregunta);
        } else if (nopregunta == 3) {
            pregunta = (String) JOptionPane.showInputDialog("¿Cuál es su comida favorita?");
        } else if (nopregunta == 4) {
            pregunta = (String) JOptionPane.showInputDialog("¿Cuál es su pelicula favorita?");
            verificacion("hola", pregunta);
        } else if (nopregunta == 5) {
            pregunta = (String) JOptionPane.showInputDialog("¿Cuál es su pasatiempo favorito");
            verificacion("hola", pregunta);

        }*/

    }//GEN-LAST:event_jButtonsesion1MouseClicked
    private void verificacion(String respuesta_extraida, String respuesta) {
        //comprimir la respuesta que ingresa
        if (respuesta_extraida.equals(respuesta)) {
            int seleccion3 = JOptionPane.showOptionDialog(
                    null,
                    "¿QUIERE INICIAR YA CON EL CAMBIO DE CONTRASEÑA?",
                    "",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, // null para icono por defecto.
                    new Object[]{"Sí", "No", "Cancelar"}, // null para YES, NO y CANCEL
                    "Sí");

            if (seleccion3 != -1) {
                if (seleccion3 == 0) {
                    //buscar al super usuario, extraer datos y comparar
                    //vamos al area de actualización de contraseña
                    //se solicita contraseña nueva y la confirmación y se extrae la antigua
                    String correo_SU = (String) JOptionPane.showInputDialog("Ingrese el correo electronico del SUPER USUARIO");
                    String contraseña_SU = (String) JOptionPane.showInputDialog(null, "Ingrese contraseña del SUPER USUARIO");//hay que corregir este campo, no se debe ver la contraseña

                    if (correo_SU.equals("prueba@gmail.com") && contraseña_SU.equals("1234abcd")) {
                        // actualizar la contraseña del correo que lo solicito el cambio
                        JOptionPane.showMessageDialog(null, "EL CAMBIO DE CONTRASEÑA FUE UN EXITO");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ESTAMOS A SUS ORDENES");

                }
            }
        }
    }
    private void jButtonsesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsesion2ActionPerformed
        // TODO add your handling code here:
        crearcuenta cuentanueva = new crearcuenta();
        cuentanueva.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonsesion2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonsesion;
    private javax.swing.JButton jButtonsesion1;
    private javax.swing.JButton jButtonsesion2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JPasswordField txtPassOculto;
    private javax.swing.JTextField txtPassVisible;
    // End of variables declaration//GEN-END:variables
}
