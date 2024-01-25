package Vistas;

import Negocio.Notas;
import java.awt.Component;
import java.text.DecimalFormat;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Nota extends javax.swing.JFrame {

    DefaultTableModel modelo =new DefaultTableModel();
        int contador=0;
    
    //Permite Insertar en tiempo constante
    public static LinkedList caja = new LinkedList();
    
    Estudiante est = new Estudiante();
    Asignatura asig = new Asignatura();

    public Nota() {
        initComponents();
        setLocationRelativeTo(null);
        Recorrer_Estudiante();
        Recorrer_Asignatura();

        String[] titulo= new String[] {"Id Alumno", "Nombre" ,"Apellido","Id Asignatura","Nom. Asignatura","Ciclo", "Promedio Final","Sit. Academica"};

        modelo.setColumnIdentifiers(titulo);
        JTNotas.setModel(modelo);
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPC1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPC2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTP = new javax.swing.JTextField();
        txtEP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSUST = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPF = new javax.swing.JTextField();
        txtSitAcademica = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTNotas = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JCodigo = new javax.swing.JComboBox<>();
        BTestudiante = new javax.swing.JButton();
        txtapellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnonasig = new javax.swing.JTextField();
        JCodigo_A = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtciclo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Registro de Notas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(229, 229, 229));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Ingreso de Notas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Practica Calificada (PC1)");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtPC1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtPC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPC1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPC1ActionPerformed(evt);
            }
        });
        txtPC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPC1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPC1KeyTyped(evt);
            }
        });
        jPanel3.add(txtPC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 84, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Practica Calificada (PC2)");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, -1));

        txtPC2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtPC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPC2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPC2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPC2KeyTyped(evt);
            }
        });
        jPanel3.add(txtPC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 84, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Trabajo Parcial (TP)");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 136, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Examen Parcial (EP)");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        txtTP.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtTP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTPKeyTyped(evt);
            }
        });
        jPanel3.add(txtTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 110, -1));

        txtEP.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEPKeyTyped(evt);
            }
        });
        jPanel3.add(txtEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 107, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Examen Fina (EF)");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        txtEF.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtEF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEFActionPerformed(evt);
            }
        });
        txtEF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEFKeyTyped(evt);
            }
        });
        jPanel3.add(txtEF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 110, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Sustitutorio (SUST)");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        txtSUST.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtSUST.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSUST.setText("0");
        txtSUST.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSUST.setEnabled(false);
        txtSUST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSUSTActionPerformed(evt);
            }
        });
        txtSUST.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSUSTKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSUSTKeyTyped(evt);
            }
        });
        jPanel3.add(txtSUST, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 110, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_notas/comentarios-de-los-clientes.png"))); // NOI18N
        jLabel9.setText("Situacion (AC)   :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, -1, -1));

        txtPF.setEditable(false);
        txtPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPFActionPerformed(evt);
            }
        });
        jPanel3.add(txtPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 110, -1));

        txtSitAcademica.setEditable(false);
        txtSitAcademica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSitAcademicaActionPerformed(evt);
            }
        });
        jPanel3.add(txtSitAcademica, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 110, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_notas/comentarios-de-los-clientes.png"))); // NOI18N
        jLabel15.setText("Promedio(PF)   :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 1090, 120));

        JTNotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JTNotas.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        JTNotas.setForeground(new java.awt.Color(102, 102, 102));
        JTNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ALumno", "Nombre", "Apellido", "Id Asignatura", "Nom. Asignatura", "Ciclo", "Promedio Final", "Sit. Academica"
            }
        ));
        JTNotas.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(JTNotas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 940, 230));

        jPanel10.setBackground(new java.awt.Color(229, 229, 229));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 1070, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_notas/perfil.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 130, 120));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Registro De Estudiantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_notas/colegial (1).png"))); // NOI18N
        jLabel1.setText("ID ALUMNO   :");

        JCodigo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        JCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCodigoMouseClicked(evt);
            }
        });
        JCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCodigoActionPerformed(evt);
            }
        });
        JCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JCodigoKeyReleased(evt);
            }
        });

        BTestudiante.setBackground(new java.awt.Color(46, 139, 87));
        BTestudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_estudiantes/lupa.png"))); // NOI18N
        BTestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTestudianteActionPerformed(evt);
            }
        });

        txtapellido.setEditable(false);
        txtapellido.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("APELLIDO       :");

        txtnombre.setEditable(false);
        txtnombre.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("NOMBRE         :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_notas/curso-por-internet.png"))); // NOI18N
        jLabel2.setText("ID ASIGNATURA :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("NOMBRE          :");

        txtnonasig.setEditable(false);
        txtnonasig.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        JCodigo_A.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        JCodigo_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCodigo_AActionPerformed(evt);
            }
        });
        JCodigo_A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JCodigo_AKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 165, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_estudiantes/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("CICLO               :");

        txtciclo.setEditable(false);
        txtciclo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BTestudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellido))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JCodigo_A, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnonasig)
                    .addComponent(txtciclo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(JCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTestudiante))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(JCodigo_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtnonasig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtciclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 890, 160));

        jPanel4.setBackground(new java.awt.Color(229, 229, 229));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(0, 0, 204));
        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_notas/verificar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(0, 153, 0));
        btnnuevo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_notas/limpieza-de-datos.png"))); // NOI18N
        btnnuevo.setText("Limpiar");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/girar.png"))); // NOI18N
        jButton3.setText("Mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_notas/expediente.png"))); // NOI18N
        jButton2.setText("Reporte ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 240));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 6, 1200, 600));

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Regresar");

        jMenuItem4.setText("M.Principal");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Ventana obj = new Ventana();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void txtPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPFActionPerformed

    private void txtSitAcademicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSitAcademicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSitAcademicaActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        Limpiar();
  

  

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Reporte abrir = new Reporte();
        abrir.setVisible(true);
        this.dispose();
        abrir.pack();
        abrir.setDefaultCloseOperation(Reporte.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Mandar();
       
        agregar();
    }//GEN-LAST:event_btnGuardarActionPerformed


    
    
    private void txtPC1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPC1KeyTyped
        // TODO add your handling code here:
        
        char Validar= evt.getKeyChar();
        if (Character.isLetter(Validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");  
        }
         
    
    }//GEN-LAST:event_txtPC1KeyTyped

    private void txtPC2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPC2KeyTyped
        // TODO add your handling code here:        
       char Validar= evt.getKeyChar();
        if (Character.isLetter(Validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");  
        }
         
    }//GEN-LAST:event_txtPC2KeyTyped

    private void txtTPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTPKeyTyped
        // TODO add your handling code here:
       char Validar= evt.getKeyChar();
        if (Character.isLetter(Validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");  
        }
          
    }//GEN-LAST:event_txtTPKeyTyped

    private void txtEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEPKeyTyped
        // TODO add your handling code here:
      char Validar= evt.getKeyChar();
        if (Character.isLetter(Validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");  
        }
          
    }//GEN-LAST:event_txtEPKeyTyped

    private void txtEFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEFKeyTyped
        // TODO add your handling code here:
     char Validar= evt.getKeyChar();
        if (Character.isLetter(Validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");  
        }
           
    }//GEN-LAST:event_txtEFKeyTyped

    private void txtSUSTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSUSTKeyTyped
        // TODO add your handling code here:
        char Validar= evt.getKeyChar();
        if (Character.isLetter(Validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");  
        }
          
    }//GEN-LAST:event_txtSUSTKeyTyped

    
    private void txtPC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPC1ActionPerformed
        // TODO add your handling code here:
            
       

    }//GEN-LAST:event_txtPC1ActionPerformed

    private void txtEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEFActionPerformed
        // TODO add your handling code here:
       Calcular();
    }//GEN-LAST:event_txtEFActionPerformed

    private void txtEFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEFKeyReleased
        // TODO add your handling code here:
        try{
        double PC1 = Double.valueOf(txtEF.getText());
        
        if ( PC1 >= 21)
        {  
        JOptionPane.showMessageDialog(null, "Cantidad maxima excedida");  
        txtEF.setText("");
        }   
        }catch (Exception e) {}
    }//GEN-LAST:event_txtEFKeyReleased

    private void txtSUSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSUSTActionPerformed
        // TODO add your handling code here:
        Calcular_1();
    }//GEN-LAST:event_txtSUSTActionPerformed

    private void txtPC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPC2KeyReleased
        // TODO add your handling code here:
         try{
        double PC1 = Double.valueOf(txtPC2.getText());
        
        if ( PC1 >= 21)
        {  
        JOptionPane.showMessageDialog(null, "Cantidad maxima excedida");  
        txtPC2.setText("");
        }   
        }catch (Exception e) {}
    }//GEN-LAST:event_txtPC2KeyReleased

    private void txtPC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPC1KeyReleased
        // TODO add your handling code here:
         try{
        double PC1 = Double.valueOf(txtPC1.getText());
        
        if ( PC1 >= 21)
        {  
        JOptionPane.showMessageDialog(null, "Cantidad maxima excedida");  
        txtPC1.setText("");
        }   
        }catch (Exception e) {}
    }//GEN-LAST:event_txtPC1KeyReleased

    private void txtTPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTPKeyReleased
        // TODO add your handling code here:
         try{
        double PC1 = Double.valueOf(txtTP.getText());
        
        if ( PC1 >= 21)
        {  
        JOptionPane.showMessageDialog(null, "Cantidad maxima excedida");  
        txtTP.setText("");
        }   
        }catch (Exception e) {}
    }//GEN-LAST:event_txtTPKeyReleased

    private void txtEPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEPKeyReleased
        // TODO add your handling code here:
         try{
        double PC1 = Double.valueOf(txtEP.getText());
        
        if ( PC1 >= 21)
        {  
        JOptionPane.showMessageDialog(null, "Cantidad maxima excedida");  
        txtEP.setText("");
        }   
        }catch (Exception e) {}
    }//GEN-LAST:event_txtEPKeyReleased

    private void txtSUSTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSUSTKeyReleased
        // TODO add your handling code here:
         try{
        double PC1 = Double.valueOf(txtSUST.getText());
        
        if ( PC1 >= 21)
        {  
        JOptionPane.showMessageDialog(null, "Cantidad maxima excedida");  
        txtSUST.setText("");
        }   
        }catch (Exception e) {}
    }//GEN-LAST:event_txtSUSTKeyReleased

    private void JCodigo_AKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCodigo_AKeyReleased
        // TODO add your handling code here:
        Mostrar_Asignatura();
    }//GEN-LAST:event_JCodigo_AKeyReleased

    private void JCodigo_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCodigo_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCodigo_AActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Mostrar_Asignatura();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void BTestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTestudianteActionPerformed
        // TODO add your handling code here:
        Mostrar_Estudiante();
    }//GEN-LAST:event_BTestudianteActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void JCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCodigoKeyReleased
        // TODO add your handling code here:
        Mostrar_Estudiante();
    }//GEN-LAST:event_JCodigoKeyReleased

    private void JCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCodigoActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_JCodigoActionPerformed

    private void JCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCodigoMouseClicked

    }//GEN-LAST:event_JCodigoMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTestudiante;
    private javax.swing.JComboBox<String> JCodigo;
    private javax.swing.JComboBox<String> JCodigo_A;
    private javax.swing.JTable JTNotas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEF;
    private javax.swing.JTextField txtEP;
    private javax.swing.JTextField txtPC1;
    private javax.swing.JTextField txtPC2;
    private javax.swing.JTextField txtPF;
    private javax.swing.JTextField txtSUST;
    private javax.swing.JTextField txtSitAcademica;
    private javax.swing.JTextField txtTP;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtciclo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnonasig;
    // End of variables declaration//GEN-END:variables

    void Calcular() { 
           try{
        DecimalFormat df = new DecimalFormat("#,##0.0");
        double PC1 = Double.valueOf(txtPC1.getText());
        double PC2 = Double.valueOf(txtPC2.getText());
        double TP = Double.valueOf(txtTP.getText());
        double EP = Double.valueOf(txtEP.getText());
        double EF = Double.valueOf(txtEF.getText());
        
        double p = (PC1+PC2+TP+EP+EF)/5;
        String pro = df.format(p);
        txtPF.setText(String.valueOf(pro)); 
        String promedio = txtEF.getText();
        
        String situacion = "Aprobado";
        if (p >= 0 && p <= 10){
            situacion = "Desaprobado";
            txtSUST.setEnabled(true);

        }
        txtSitAcademica.setText(situacion); 
        String SitAcademica=txtSitAcademica.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Lleno Todos los campos");
        }

    }
    
     void Calcular_1() { 
         DecimalFormat df = new DecimalFormat("#,##0.0");
        double PC1 = Double.valueOf(txtPC1.getText());
        double PC2 = Double.valueOf(txtPC2.getText());
        double TP = Double.valueOf(txtTP.getText());
        double EP = Double.valueOf(txtEP.getText());
        double EF = Double.valueOf(txtEF.getText());
        double ST = Double.valueOf(txtSUST.getText());
        
        double p = (PC1+PC2+TP+EP+EF+ST)/6;
        String pro = df.format(p);
        txtPF.setText(String.valueOf(pro)); 
        String promedio = txtEF.getText();
        
        String situacion = "Aprobado";
        if (p >= 0 && p <= 10){
            situacion = "Desaprobado";
             txtSUST.setEnabled(false);
        }
        txtSitAcademica.setText(situacion); 
        String SitAcademica=txtSitAcademica.getText();
       

    }



    void Recorrer_Estudiante() {
        int id = est.Arr_codalu.size();
        DefaultComboBoxModel cbo = (DefaultComboBoxModel) JCodigo.getModel();
        JCodigo.setModel(cbo);
        for (int i = 0; i < id; i++) {
            cbo.addElement(est.Arr_codalu.get(i));

        }
    }

    void Mostrar_Estudiante() {

        int i = JCodigo.getSelectedIndex();

        txtnombre.setText(String.valueOf(est.Arr_nomalu.get(i)));
        txtapellido.setText(String.valueOf(est.Arr_apealu.get(i)));
    }

    void Recorrer_Asignatura() {

        int id_1 = asig.Arr_codasi.size();
        DefaultComboBoxModel cbo_1 = (DefaultComboBoxModel) JCodigo_A.getModel();
        JCodigo_A.setModel(cbo_1);
        for (int i = 0; i < id_1; i++) {
            cbo_1.addElement(asig.Arr_codasi.get(i));
        }
    }

    void Mostrar_Asignatura() {

        int i = JCodigo_A.getSelectedIndex();

        txtnonasig.setText(String.valueOf(asig.Arr_monasi.get(i)));
        txtciclo.setText(String.valueOf(asig.Arr_ciclo.get(i)));
    }
    
    
    
    void Mandar(){
        try{
        String idestudiante=JCodigo.getSelectedItem().toString();
        String nomestudiante=txtnombre.getText();
        String apeEstudiante=txtapellido.getText();
        String idasignatura=JCodigo_A.getSelectedItem().toString();
        String nomasignatura=txtnonasig.getText();
        String ciclo=txtciclo.getText();
        String promedio=txtPF.getText();
        String SitAcademica=txtSitAcademica.getText();
               
        
        
        Notas clasedato=new Notas (idestudiante, nomestudiante, apeEstudiante, idasignatura, nomasignatura, ciclo,promedio,SitAcademica);
        
        caja.add(clasedato);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Lleno Todos los campos");
        }
    
    }
     
   void Limpiar(){
            
        txtnombre.setText("");
        txtapellido.setText("");
        txtnonasig.setText("");
        txtciclo.setText("");
        txtPF.setText("");
        txtSitAcademica.setText("");
        txtPC1.setText(null);
        txtPC2.setText(null);
        txtTP.setText(null);
        txtEP.setText(null);
        txtEF.setText(null);
        txtSUST.setText("0");
        
       
        btnGuardar.setEnabled(true);
    
   }
   
       

   
   void mostrar(){
     
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
   
   
    void agregar(){
        
    modelo.addRow(new Object[]{
    JCodigo.getSelectedItem(),
    txtnombre.getText(), 
    txtapellido.getText(),
    JCodigo_A.getSelectedItem(),
    txtnonasig.getText(),
    txtciclo.getText(),
    txtPF.getText(),
    txtSitAcademica.getText()
    });
    }
   
 
    
    
}
