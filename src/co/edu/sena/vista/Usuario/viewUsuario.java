/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.vista.Usuario;

import co.edu.sena.control.Usuario.controlUsuario;

import co.edu.sena.dto.Usuario.DTOUsuario;

/**
 *
 * @author SENA
 */
public class viewUsuario extends javax.swing.JFrame {

    int dni_Usuario = 100;
    String Perfil1 = "";
    String Cedula1 = "";
    String Nombre1 = "";
    String Telefono1 = "";
    String Correo1 = "";
    String FechaN1 = "";
    String Direccion1 = "";
    String Apellidos1 = "";
    String Movil1 = "";
    String nombreusuario1 = "";
    String contraseña1 = "";

    int contador = 0;
    String[][] datos = new String[20][20];
    controlUsuario controlUsuario = new controlUsuario();
    DTOUsuario[] dtoUsuario = new DTOUsuario[10];

    /**
     * Creates new form viewUsuario
     */
    public viewUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        registro = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();
        BORRAR = new javax.swing.JButton();
        Perfil = new javax.swing.JComboBox<>();
        Nombre = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        Cedula = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        FechaN = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        Movil = new javax.swing.JTextField();
        nombreusuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Perfil");

        jLabel2.setText("Cedula");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Telefono");

        jLabel6.setText("Movil");

        jLabel7.setText("Correo");

        jLabel8.setText("Nom_Usuario");

        jLabel9.setText("Contraseña");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("REGISTRARSE");

        jLabel12.setText("Fecha  Nacimiento");

        jLabel13.setText("Direccion");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DNIUsuario", "Perfil", "Nombre", "Apellidos", "Cedula", "Telefono", "Correo", "Fecha nacimiento", "Direccion", "Movil", "Nombre_Usuario", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        registro.setText("REGISTRARSE");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });

        BORRAR.setText("BORRAR");
        BORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARActionPerformed(evt);
            }
        });

        Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conductor", "Administrador", " " }));

        Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Desktop\\LOGO.png")); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(BORRAR)
                .addGap(54, 54, 54)
                .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(registro)
                .addGap(89, 89, 89)
                .addComponent(ACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(6, 6, 6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Telefono)
                            .addComponent(Perfil, javax.swing.GroupLayout.Alignment.LEADING, 0, 96, Short.MAX_VALUE)
                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellidos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cedula)
                            .addComponent(Correo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FechaN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(Direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Contraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Movil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12)
                            .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BORRAR)
                    .addComponent(BUSCAR)
                    .addComponent(registro)
                    .addComponent(ACTUALIZAR))
                .addContainerGap(346, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        // TODO add your handling code here:

        Perfil1 = Perfil.getSelectedItem().toString();
        Cedula1 = Cedula.getText();
        Nombre1 = Nombre.getText();
        Telefono1 = Telefono.getText();
        Correo1 = Correo.getText();
        FechaN1 = FechaN.getText();
        Direccion1 = Direccion.getText();
        Apellidos1 = Apellidos.getText();
        Movil1 = Movil.getText();
        nombreusuario1 = nombreusuario.getText();
        contraseña1 = Contraseña.getText();

        dtoUsuario[contador] = new DTOUsuario();
        dtoUsuario[contador].setPerfil(Perfil1);
        dtoUsuario[contador].setCedula(Cedula1);
        dtoUsuario[contador].setNombre(Nombre1);
        dtoUsuario[contador].setTelefono(Telefono1);
        dtoUsuario[contador].setcorreo(Correo1);
        dtoUsuario[contador].setFechaN(FechaN1);
        dtoUsuario[contador].setDireccion(Direccion1);
        dtoUsuario[contador].setApellido(Apellidos1);
        dtoUsuario[contador].setMovil(Movil1);
        dtoUsuario[contador].setNom_usuario(nombreusuario1);
        dtoUsuario[contador].setContraseña(contraseña1);

        if (controlUsuario.registrarusuario(dtoUsuario[contador])) {

            datos[contador][0] = String.valueOf(dni_Usuario);
            datos[contador][1] = Perfil1;
            datos[contador][2] = Cedula1;
            datos[contador][3] = Nombre1;
            datos[contador][4] = Telefono1;
            datos[contador][5] = Correo1;
            datos[contador][6] = FechaN1;
            datos[contador][7] = Direccion1;
            datos[contador][8] = Apellidos1;
            datos[contador][9] = Movil1;
            datos[contador][10] = nombreusuario1;
            datos[contador][11] = contraseña1;

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    datos,
                    new String[]{
                        "DNIUsuario", "Perfil", "Direccion", "Nombre", "Telefono", "Correo", "Fecha de Nacimiento", "Cedula", "Apellidos", "Movil", "Nombre_usuario", "contraseña"

                    }
            ));
           contador = contador + 1;
           
            Cedula.setText("");
           Nombre.setText("");
           Telefono.setText("");
           Correo.setText("");
           FechaN.setText("");
           Direccion.setText("");
           Apellidos.setText("");
           Movil.setText("");
           nombreusuario.setText("");
           Contraseña.setText("");
        
        }


    }//GEN-LAST:event_registroActionPerformed

    private void BORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARActionPerformed
        // TODO add your handling code here:
        if (controlUsuario.deshabilitarusuario(dtoUsuario[contador])) {
            if (contador <= 0) {
                contador = 0;

            } else {
                contador--;
            }
            datos[contador][0] = "";
            datos[contador][1] = "";
            datos[contador][2] = "";
            datos[contador][3] = "";
            datos[contador][4] = "";
            datos[contador][5] = "";    
            datos[contador][6] = "";
            datos[contador][7] = "";
            datos[contador][8] = "";
            datos[contador][9] = "";
            datos[contador][10] = "";
            datos[contador][11] = "";

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    datos,
                    new String[]{
                        "DNIUsuario", "Perfil", "Cedula", "Nombre", "Telefono", "Correo", "Fecha de Nacimiento", "Direccion", "Apellidos", "Movil", "Nombre_usuario", "contraseña"

                    }
            ));
        }


    }//GEN-LAST:event_BORRARActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < contador; i++) {
            if (datos[i][2].equals(Cedula.getText())) {
                Perfil1 = Perfil.getSelectedItem().toString();
                Cedula1 = Cedula.getText();
                Nombre1 = Nombre.getText();
                Telefono1 = Telefono.getText();
                Correo1 = Correo.getText();
                FechaN1 = FechaN.getText();
                Direccion1 = Direccion.getText();
                Apellidos1 = Apellidos.getText();
                Movil1 = Movil.getText();
                nombreusuario1 = nombreusuario.getText();
                contraseña1 = Contraseña.getText();

          
                datos[i][1] = Perfil1;
                datos[i][2] = Cedula1;
                datos[i][3] = Nombre1;
                datos[i][4] = Telefono1;
                datos[i][5] = Correo1;
                datos[i][6] = FechaN1;
                datos[i][7] = Direccion1;
                datos[i][8] = Apellidos1;
                datos[i][9] = Movil1;
                datos[i][10] = nombreusuario1;
                datos[i][11] = contraseña1;

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        datos,
                        new String[]{
                            "DNIUsuario", "Perfil", "Cedula", "Nombre", "Telefono", "Correo", "Fecha de Nacimiento", "Direccion", "Apellidos", "Movil", "Nombre_usuario", "contraseña"
                        }
                ));

            }
        }

    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < contador; i++) {
            if (datos[i][2].equals(Cedula.getText())) {
                Nombre.setText(datos[i][3]);
                Telefono.setText(datos[i][4]);
                Correo.setText(datos[i][5]);
                FechaN.setText(datos[i][6]);
                Direccion.setText(datos[i][7]);
                Apellidos.setText(datos[i][8]);
               Movil.setText(datos[i][9]);

                nombreusuario.setText(datos[i][10]);
               Contraseña.setText(datos[i][11]);

            }
        }
    }//GEN-LAST:event_BUSCARActionPerformed

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
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JTextField Apellidos;
    private javax.swing.JButton BORRAR;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JTextField Cedula;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField FechaN;
    private javax.swing.JTextField Movil;
    private javax.swing.JTextField Nombre;
    private javax.swing.JComboBox<String> Perfil;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreusuario;
    private javax.swing.JButton registro;
    // End of variables declaration//GEN-END:variables
}
