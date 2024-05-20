/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package validador.de.vacunacion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deyvi
 */
public class ImprimirABBjF extends javax.swing.JFrame {

    /**
     * Creates new form ImprimirABBjF
     */
    
    ArbolBinarioB arbB=new ArbolBinarioB();
    
    public ImprimirABBjF() {
        initComponents();
        limpiarTabla();
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
        jLabel1 = new javax.swing.JLabel();
        jbtnPreOrden = new javax.swing.JButton();
        jbtnPostOrden = new javax.swing.JButton();
        jbtnInOrden = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRegistros = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Imprimir Registros");

        jbtnPreOrden.setText("Pre-Orden");
        jbtnPreOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtnPreOrdenMousePressed(evt);
            }
        });

        jbtnPostOrden.setText("Post-Orden");
        jbtnPostOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtnPostOrdenMousePressed(evt);
            }
        });

        jbtnInOrden.setText("In-Orden");
        jbtnInOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtnInOrdenMousePressed(evt);
            }
        });

        jTRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DPI", "Cantidad de vacunas", "Fecha Vacuna 1", "Fecha Vacuna 2", "Fecha Vacuna 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jTRegistros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jbtnPreOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnInOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jbtnPostOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPreOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnInOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPostOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMVolver.setBackground(new java.awt.Color(255, 255, 255));
        jMVolver.setForeground(new java.awt.Color(0, 0, 0));
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMVolverMousePressed
        ArbolBinarioBJF arbb=new ArbolBinarioBJF();
        this.dispose();
        arbb.setVisible(true);
    }//GEN-LAST:event_jMVolverMousePressed

    private void jbtnPreOrdenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPreOrdenMousePressed
        if(!arbB.estaVacio()){
            limpiarTabla();
            DefaultTableModel modelo= new DefaultTableModel(new String[]{"Nombre","DPI","Cantidad de vacunas", "Fecha vacuna 1", "Fecha vacuna 2","Fecha vacuna 3"}, 0);
            jTRegistros.setModel(modelo);
            
            arbB.PreOrden(arbB.raiz, modelo);
            
        }else{
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        }
    }//GEN-LAST:event_jbtnPreOrdenMousePressed

    private void jbtnInOrdenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnInOrdenMousePressed
        if(!arbB.estaVacio()){
            limpiarTabla();
            DefaultTableModel modelo= new DefaultTableModel(new String[]{"Nombre","DPI","Cantidad de vacunas", "Fecha vacuna 1", "Fecha vacuna 2","Fecha vacuna 3"}, 0);
            jTRegistros.setModel(modelo);
            
            arbB.inOrden(arbB.raiz, modelo);
            
        }else{
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        }
    }//GEN-LAST:event_jbtnInOrdenMousePressed

    private void jbtnPostOrdenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPostOrdenMousePressed
        if(!arbB.estaVacio()){
            limpiarTabla();
            DefaultTableModel modelo= new DefaultTableModel(new String[]{"Nombre","DPI","Cantidad de vacunas", "Fecha vacuna 1", "Fecha vacuna 2","Fecha vacuna 3"}, 0);
            jTRegistros.setModel(modelo);
            
            arbB.PostOrden(arbB.raiz, modelo);
            
        }else{
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        }
    }//GEN-LAST:event_jbtnPostOrdenMousePressed

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
            java.util.logging.Logger.getLogger(ImprimirABBjF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirABBjF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirABBjF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirABBjF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImprimirABBjF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMVolver;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRegistros;
    private javax.swing.JButton jbtnInOrden;
    private javax.swing.JButton jbtnPostOrden;
    private javax.swing.JButton jbtnPreOrden;
    // End of variables declaration//GEN-END:variables


private void limpiarTabla(){
        //Vacia las filas de las tablas
        DefaultTableModel model = (DefaultTableModel) jTRegistros.getModel();
        model.setRowCount(0);
    }

}
