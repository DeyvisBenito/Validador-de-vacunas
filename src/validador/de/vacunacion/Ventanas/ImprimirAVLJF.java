/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package validador.de.vacunacion.Ventanas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validador.de.vacunacion.ArbolAVL;

/**
 *
 * @author deyvi
 */
public class ImprimirAVLJF extends javax.swing.JFrame {

    /**
     * Creates new form ImprimirAVLJF
     */
    
    ArbolAVL arbolAVL=new ArbolAVL();
    
    public ImprimirAVLJF() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnPreOrden = new javax.swing.JButton();
        jBtnInOrden = new javax.swing.JButton();
        jBtnPostOrden = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBuscados = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Imprimir Registros");
        jLabel1.setToolTipText("");

        jBtnPreOrden.setText("Pre-Orden");
        jBtnPreOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnPreOrdenMousePressed(evt);
            }
        });

        jBtnInOrden.setText("In-Orden");
        jBtnInOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnInOrdenMousePressed(evt);
            }
        });

        jBtnPostOrden.setText("Post-Orden");
        jBtnPostOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnPostOrdenMousePressed(evt);
            }
        });

        jTBuscados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DPI", "Cantidad de Vacunas", "Fecha Vacuna 1", "Fecha Vacuna 2", "Fecha Vacuna 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTBuscados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jBtnPreOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jBtnInOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnPostOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnPreOrden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnPostOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnInOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 153));

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

    private void jBtnPreOrdenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPreOrdenMousePressed
        if(!arbolAVL.estaVacio()){
            limpiarTabla();
            DefaultTableModel modelo= new DefaultTableModel(new String[]{"Nombre","DPI","Cantidad de vacunas", "Fecha vacuna 1", "Fecha vacuna 2","Fecha vacuna 3"}, 0);
            jTBuscados.setModel(modelo);
            
            arbolAVL.PreOrden(arbolAVL.raizAVL, modelo);
            
        }else{
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        }
    }//GEN-LAST:event_jBtnPreOrdenMousePressed

    private void jMVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMVolverMousePressed
        ArbolAVLJF arbAVL=new ArbolAVLJF();
        this.dispose();
        arbAVL.setVisible(true);
    }//GEN-LAST:event_jMVolverMousePressed

    private void jBtnInOrdenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnInOrdenMousePressed
        if(!arbolAVL.estaVacio()){
            limpiarTabla();
            DefaultTableModel modelo= new DefaultTableModel(new String[]{"Nombre","DPI","Cantidad de vacunas", "Fecha vacuna 1", "Fecha vacuna 2","Fecha vacuna 3"}, 0);
            jTBuscados.setModel(modelo);
            
            arbolAVL.inOrden(arbolAVL.raizAVL, modelo);
            
        }else{
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        }
    }//GEN-LAST:event_jBtnInOrdenMousePressed

    private void jBtnPostOrdenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPostOrdenMousePressed
        if(!arbolAVL.estaVacio()){
            limpiarTabla();
            DefaultTableModel modelo= new DefaultTableModel(new String[]{"Nombre","DPI","Cantidad de vacunas", "Fecha vacuna 1", "Fecha vacuna 2","Fecha vacuna 3"}, 0);
            jTBuscados.setModel(modelo);
            
            arbolAVL.PostOrden(arbolAVL.raizAVL, modelo);
            
        }else{
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        }
    }//GEN-LAST:event_jBtnPostOrdenMousePressed

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
            java.util.logging.Logger.getLogger(ImprimirAVLJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirAVLJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirAVLJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirAVLJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImprimirAVLJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnInOrden;
    private javax.swing.JButton jBtnPostOrden;
    private javax.swing.JButton jBtnPreOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMVolver;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBuscados;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla(){
        //Vacia las filas de las tablas
        DefaultTableModel model = (DefaultTableModel) jTBuscados.getModel();
        model.setRowCount(0);
    }

}