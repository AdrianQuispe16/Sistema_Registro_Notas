/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Negocio.Notas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class Reporte extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    Asignatura asig = new Asignatura();
    int contador=0;
    TableRowSorter buscar;
    
    
    public Reporte() {
        initComponents();
        setLocationRelativeTo(null);
        CargarTodo();
        DatosIngresados();
        Recorrer_Asignatura();
        
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
        txtBuscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboasignatura = new javax.swing.JComboBox<>();
        cbosituacion = new javax.swing.JComboBox<>();
        cbociclo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 270, -1));

        jTable1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Alumno", "Nom. Alumno", "Ape. Alumno", "Id Asignatura", "Nom. Asignatura", "Ciclo", "Prom. Final", "Sit. Academica"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 860, 330));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_estudiantes/lupa.png"))); // NOI18N
        jLabel10.setText("Buscar Estudiante");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 160, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("REPORTE DE NOTAS ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_estudiantes/ephc4j5f9egd7md3xrm2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 269, 83));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Buscar Por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Asigantura");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Ciclo");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Sit_Academica");

        cboasignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboasignaturaActionPerformed(evt);
            }
        });
        cboasignatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboasignaturaKeyReleased(evt);
            }
        });

        cbosituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Desaprobado" }));
        cbosituacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbosituacionKeyReleased(evt);
            }
        });

        cbociclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Ciclo", "Segundo Ciclo", "Tercer Ciclo", "Cuarto Ciclo", "Quinto Ciclo", "Sexto Ciclo", "Sextimo Ciclo", "Octavo Ciclo" }));
        cbociclo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbocicloKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboasignatura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addComponent(cbociclo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbosituacion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cbociclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbosituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, 280));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/girar.png"))); // NOI18N
        jButton1.setText("Resfrescar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 40));

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Regresar");

        jMenuItem4.setText("Menu.Principal");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Ventana obj = new Ventana();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void txtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorActionPerformed
        // TODO add your handling code here:
        Buscar_Nombre();
    }//GEN-LAST:event_txtBuscadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Refrescar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboasignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboasignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboasignaturaActionPerformed

    private void cboasignaturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboasignaturaKeyReleased
        // TODO add your handling code here:
        Buscar_Asignatura();
    }//GEN-LAST:event_cboasignaturaKeyReleased

    private void cbocicloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbocicloKeyReleased
        // TODO add your handling code here:
        Buscar_Ciclo();
    }//GEN-LAST:event_cbocicloKeyReleased

    private void cbosituacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbosituacionKeyReleased
        // TODO add your handling code here:
        Buscar_Situtacion();
    }//GEN-LAST:event_cbosituacionKeyReleased

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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboasignatura;
    private javax.swing.JComboBox<String> cbociclo;
    private javax.swing.JComboBox<String> cbosituacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables


public void CargarTodo(){
        String made[][]={};
        String columna[]={"Id Alumno", "Nombre" ,"Apellido","Id Asignatura","Nom. Asignatura","Ciclo", "Promedio Final","Sit. Academica"};
        modelo=new DefaultTableModel(made, columna);
        jTable1.setModel(modelo);
        
    }
    
    
    public void DatosIngresados(){
        Notas a;
        
        for(int i = 0 ; i < Nota.caja.size(); i++ ){
            a=(Notas)Nota.caja.get(i);
            modelo.insertRow(contador, new Object[]{});
            modelo.setValueAt(a.getIdestudiante(), contador, 0);
            modelo.setValueAt(a.getNomEstudiante(), contador, 1);
            modelo.setValueAt(a.getApeEstudiante(), contador, 2);
            modelo.setValueAt(a.getIdasignatura(), contador, 3);
            modelo.setValueAt(a.getNomasignatura(), contador, 4);
            modelo.setValueAt(a.getCiclo(), contador, 5);
            modelo.setValueAt(a.getPromedio(), contador, 6);
            modelo.setValueAt(a.getSitACademica(), contador, 7);

        }
        
    }
       void Refrescar(){
       
       jTable1.setAutoCreateRowSorter(true);
        buscar = new TableRowSorter(modelo);
        jTable1.setRowSorter(buscar);
         String jButton1=txtBuscador.getText();
        
    }
    
    void Buscar_Nombre(){
        
        jTable1.setAutoCreateRowSorter(true);
        buscar = new TableRowSorter(modelo);
        jTable1.setRowSorter(buscar);
         String buscador=txtBuscador.getText();
            
        if(!buscador.equals("")){
            buscar.setRowFilter(RowFilter.regexFilter(buscador));
        }else{
            buscar.setRowFilter(null);
        }
    }
     
     void Recorrer_Asignatura() {

        int id_1 = asig.Arr_monasi.size();
        DefaultComboBoxModel cbo_1 = (DefaultComboBoxModel) cboasignatura.getModel();
        cboasignatura.setModel(cbo_1);
        for (int i = 0; i < id_1; i++) {
            cbo_1.addElement(asig.Arr_monasi.get(i));
        }
    }
     
     void Buscar_Asignatura(){
        
        jTable1.setAutoCreateRowSorter(true);
        buscar = new TableRowSorter(modelo);
        jTable1.setRowSorter(buscar);
         String buscador= (String) cboasignatura.getSelectedItem();
            
        if(!buscador.equals("")){
            buscar.setRowFilter(RowFilter.regexFilter(buscador));
        }else{
            buscar.setRowFilter(null);
        }
    }
        
      void Buscar_Ciclo(){
        
        jTable1.setAutoCreateRowSorter(true);
        buscar = new TableRowSorter(modelo);
        jTable1.setRowSorter(buscar);
         String buscador= (String) cbociclo.getSelectedItem();
            
        if(!buscador.equals("")){
            buscar.setRowFilter(RowFilter.regexFilter(buscador));
        }else{
            buscar.setRowFilter(null);
        }
    }
        void Buscar_Situtacion(){
        
        jTable1.setAutoCreateRowSorter(true);
        buscar = new TableRowSorter(modelo);
        jTable1.setRowSorter(buscar);
         String buscador= (String) cbosituacion.getSelectedItem();
            
        if(!buscador.equals("")){
            buscar.setRowFilter(RowFilter.regexFilter(buscador));
        }else{
            buscar.setRowFilter(null);
        }
    }

}