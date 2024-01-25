package Vistas;



import Vistas.Ventana;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Login extends javax.swing.JFrame {
    
    private Timer tiempo;
    int cont;
    public final static int TWO_SECOND=5;
    
    
    int intentos;
    String Msg;


    
    public Login() {
        initComponents();
        
        txtuser.setBackground(new java.awt.Color(0,0,0,0));
        txtpas.setBackground(new java.awt.Color(0,0,0,0));
        txterror.setBackground(new java.awt.Color(0,0,0,0));
        barrita.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JToggleButton();
        btncerrar = new javax.swing.JToggleButton();
        txterror = new javax.swing.JTextField();
        barrita = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpas = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("INGRESE USUARIO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 130, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("INGRESE CONTRASEÑA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 270, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 51, 204));
        btnIngresar.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresarMousePressed(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIngresarKeyPressed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 100, 40));

        btncerrar.setBackground(new java.awt.Color(255, 0, 0));
        btncerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncerrar.setText("X");
        btncerrar.setBorder(null);
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncerrarMouseExited(evt);
            }
        });
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        txterror.setEditable(false);
        txterror.setBackground(new java.awt.Color(255, 255, 255));
        txterror.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txterror.setForeground(new java.awt.Color(255, 51, 51));
        txterror.setBorder(null);
        txterror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txterrorActionPerformed(evt);
            }
        });
        jPanel2.add(txterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 310, 20));

        barrita.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 480, 20));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("_________________");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/logosenati.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 300, 70));

        jLabel12.setBackground(new java.awt.Color(0, 153, 204));
        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 34)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText(" Bienvenido a Senati");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 340, 40));

        txtuser.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtuser.setForeground(new java.awt.Color(153, 153, 153));
        txtuser.setText("ID usuario");
        txtuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserMousePressed(evt);
            }
        });
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 270, 40));

        txtpas.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtpas.setForeground(new java.awt.Color(153, 153, 153));
        txtpas.setText("********");
        txtpas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtpas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpasMousePressed(evt);
            }
        });
        txtpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasActionPerformed(evt);
            }
        });
        txtpas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasKeyPressed(evt);
            }
        });
        jPanel2.add(txtpas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 270, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 400, 540));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/senatifon.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -100, 690, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(Exception e){
                
            }
        }    
    }//GEN-LAST:event_formWindowOpened

    private void txterrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txterrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txterrorActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btncerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseExited
        btncerrar.setBackground(Color.white);
    }//GEN-LAST:event_btncerrarMouseExited

    private void btncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseEntered
        btncerrar.setBackground(Color.red);
    }//GEN-LAST:event_btncerrarMouseEntered

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed

    }//GEN-LAST:event_btnIngresarKeyPressed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String user = txtuser.getText();
        String pas = txtpas.getText();

        if(user.isEmpty() || pas.isEmpty()){
            Msg=("Algún campo esta vacio");
        }else{
            if(user.equals("ADMIN") && pas.equals("12345")){
                barrita.setVisible(true);
                cont=-1;
                barrita.setValue(0);
                barrita.setStringPainted(true);
                tiempo=new Timer(TWO_SECOND, new TimerListener());
                tiempo.start();
                this.dispose();

                if(barrita.getValue()==100){
                    this.dispose();
                }
            }else{
                if (intentos == 3){
                    JOptionPane.showMessageDialog(null,"Excedio el límite de intentos","Bloqueado",JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                }else{
                    Msg =("Usuario o contraseña incorrecta. \nLe queda "+(3-intentos)+" intentos");
                    txtuser.setText(null);
                    txtuser.setText(null);
                    intentos = intentos + 1;
                }
            }
        }
        txtuser.setText(null);
        txterror.setText(Msg);
        txtpas.setText(null);

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMousePressed

    }//GEN-LAST:event_btnIngresarMousePressed

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(Color.cyan);
    }//GEN-LAST:event_btnIngresarMouseExited

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(Color.cyan);
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

    }//GEN-LAST:event_btnIngresarMouseClicked

    private void txtuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMousePressed
        if (txtuser.getText().equals("ID usuario")) {
            txtuser.setText("");
            txtuser.setForeground(Color.black);
        }
        if (String.valueOf(txtpas.getPassword()).isEmpty()) {
            txtpas.setText("********");
            txtpas.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtuserMousePressed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtpasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasMousePressed
        if (String.valueOf(txtpas.getPassword()).equals("********")) {
            txtpas.setText("");
            txtpas.setForeground(Color.black);
        }
        if (txtuser.getText().isEmpty()) {
            txtuser.setText("ID usuario");
            txtuser.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtpasMousePressed

    private void txtpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasActionPerformed

    private void txtpasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasKeyPressed

    }//GEN-LAST:event_txtpasKeyPressed
    public class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cont++;
            barrita.setValue(cont);
            if (cont==10){
                tiempo.stop();
                
               Ventana ven = new Ventana();
                ven.setVisible(true);
                
            }
        }

        private void dispose() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

                

        
    }
            
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barrita;
    private javax.swing.JToggleButton btnIngresar;
    private javax.swing.JToggleButton btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txterror;
    private javax.swing.JPasswordField txtpas;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}