/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semeando_futuro.view;

/**
 *
 * @author lab
 */
public class IFrm_FaltaFunc extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrm_Chamada
     */
    public IFrm_FaltaFunc() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_cad = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_motivo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_novo1 = new javax.swing.JButton();
        btn_novo3 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_motivo1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btn_novo2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        btn_novo4 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btn_novo5 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();

        setClosable(true);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 108, 78));
        jLabel11.setText("Funcionário :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 72, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 93, 171, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 108, 78));
        jLabel13.setText("Data :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 115, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 108, 78));
        jLabel14.setText("Motivo:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        btn_novo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(0, 102, 102));
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 91, 39));

        btn_cad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cad.setForeground(new java.awt.Color(0, 102, 102));
        btn_cad.setText("Cadastrar");
        btn_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 98, 39));

        txt_motivo.setColumns(20);
        txt_motivo.setRows(5);
        jScrollPane2.setViewportView(txt_motivo);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 300, 100));

        jTabbedPane1.addTab("Cadastro", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 108, 78));
        jLabel16.setText("----");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 50, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RA", "Turma" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 178, -1));

        jButton1.setText("Pesquisar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 127));

        btn_novo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_novo1.setForeground(new java.awt.Color(0, 102, 102));
        btn_novo1.setText("Alterar");
        jPanel1.add(btn_novo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 91, 39));

        btn_novo3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_novo3.setForeground(new java.awt.Color(0, 102, 102));
        btn_novo3.setText("Excluir");
        jPanel1.add(btn_novo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 91, 39));

        jLabel41.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(1, 108, 78));
        jLabel41.setText("id:");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 108, 78));
        jLabel12.setText("Funcionário :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 171, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(1, 108, 78));
        jLabel15.setText("Data :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));
        jPanel1.add(jDateChooser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 115, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(1, 108, 78));
        jLabel42.setText("Motivo:");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        txt_motivo1.setColumns(20);
        txt_motivo1.setRows(5);
        jScrollPane3.setViewportView(txt_motivo1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 300, 100));

        jTabbedPane1.addTab("Consulta", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(1, 108, 78));
        jLabel21.setText("Até:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        btn_novo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_novo2.setForeground(new java.awt.Color(0, 102, 102));
        btn_novo2.setText("Gerar");
        jPanel3.add(btn_novo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 91, 20));

        jLabel22.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(1, 108, 78));
        jLabel22.setText("Relatório Completo:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(1, 108, 78));
        jLabel23.setText("Relatório por Funcionário:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(1, 108, 78));
        jLabel24.setText("De:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));
        jPanel3.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        btn_novo4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_novo4.setForeground(new java.awt.Color(0, 102, 102));
        btn_novo4.setText("Gerar");
        jPanel3.add(btn_novo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 91, 20));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(1, 108, 78));
        jLabel25.setText("Relatório por data:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(1, 108, 78));
        jLabel26.setText("Funcionário:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        btn_novo5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_novo5.setForeground(new java.awt.Color(0, 102, 102));
        btn_novo5.setText("Gerar");
        jPanel3.add(btn_novo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 97, 91, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jTabbedPane1.addTab("Relatórios", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Cadastro de Chamada");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadActionPerformed
        

    }//GEN-LAST:event_btn_cadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cad;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_novo1;
    private javax.swing.JButton btn_novo2;
    private javax.swing.JButton btn_novo3;
    private javax.swing.JButton btn_novo4;
    private javax.swing.JButton btn_novo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txt_motivo;
    private javax.swing.JTextArea txt_motivo1;
    // End of variables declaration//GEN-END:variables
}
