/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package validador.de.vacunacion.Ventanas;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import validador.de.vacunacion.Conexion;

/**
 *
 * @author deyvi
 */
public class CargarARCABBJF extends javax.swing.JFrame {

    /**
     * Creates new form CargarARCABBJF
     */
    public CargarARCABBJF() {
        initComponents();
        jLbPath.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLbPath = new javax.swing.JLabel();
        jBtnSelecArc = new javax.swing.JButton();
        jBtnAccep = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLbPath.setBackground(new java.awt.Color(255, 255, 255));
        jLbPath.setForeground(new java.awt.Color(0, 0, 0));
        jLbPath.setOpaque(true);

        jBtnSelecArc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-browse-folder-30.png"))); // NOI18N
        jBtnSelecArc.setText("Seleccionar Archivo");
        jBtnSelecArc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnSelecArcMousePressed(evt);
            }
        });

        jBtnAccep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-emoji-de-marca-de-verificación-15.png"))); // NOI18N
        jBtnAccep.setText("Aceptar");
        jBtnAccep.setToolTipText("");
        jBtnAccep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnAccepMousePressed(evt);
            }
        });

        jBtnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-eliminar-15.png"))); // NOI18N
        jBtnCancel.setText("Cancelar");
        jBtnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnCancelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnAccep, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addComponent(jLbPath, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnSelecArc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnSelecArc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbPath, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAccep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-atrás-30.png"))); // NOI18N
        jMVolver.setText("Volver");
        jMVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMVolverMousePressed(evt);
            }
        });
        jMenuBar1.add(jMVolver);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMVolverMousePressed
        jLbPath.setText("");
        this.dispose();
    }//GEN-LAST:event_jMVolverMousePressed

    private void jBtnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCancelMousePressed
        //Volver a la pagina inicial
        jLbPath.setText("");
        this.dispose();
    }//GEN-LAST:event_jBtnCancelMousePressed

    private void jBtnSelecArcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSelecArcMousePressed
        // Seleccionar Archivo
        String seleccion = "";
        JFileChooser jfc1 = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("txt", "txt");
        jfc1.setFileFilter(filtrado);

        int respuesta = jfc1.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            seleccion = jfc1.getSelectedFile().getPath();
            jLbPath.setText(seleccion);
        }
    }//GEN-LAST:event_jBtnSelecArcMousePressed

    private void jBtnAccepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAccepMousePressed
        //Iniciar carga de txt
        Conexion con = new Conexion();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea cargar todos los registros?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            con.cargarTxtABB(jLbPath.getText());
            jLbPath.setText("");
            this.dispose();
        } else {
            String cant = JOptionPane.showInputDialog("Cuantos registros desea cargar?");
            if (cant == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return; // Salir del método main
            }
            try {
                long cantidad = Long.parseLong(cant.trim());
                con.cargarTxtABB(jLbPath.getText(), cantidad);
                jLbPath.setText("");
                this.dispose();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Pedido invalido");
            }
        }
    }//GEN-LAST:event_jBtnAccepMousePressed

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
            java.util.logging.Logger.getLogger(CargarARCABBJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarARCABBJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarARCABBJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarARCABBJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarARCABBJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAccep;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnSelecArc;
    private javax.swing.JLabel jLbPath;
    private javax.swing.JMenu jMVolver;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}