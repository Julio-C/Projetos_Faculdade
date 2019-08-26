/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.view;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import javax.swing.JOptionPane;
import semeando_futuro.dao.LoginDAO;
import semeando_futuro.modelo.Login;

/**
 *
 * @author guilherme
 */
public class Frm_Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Frm_Login() {

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

        jPanel1 = new javax.swing.JPanel();
        lblusuario = new javax.swing.JLabel();
        lblsenha = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_Confirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(3, 76, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusuario.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario.setText("Usuário:");
        jPanel1.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblsenha.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblsenha.setForeground(new java.awt.Color(255, 255, 255));
        lblsenha.setText("Senha:");
        jPanel1.add(lblsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        jPanel1.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 173, -1));

        btn_Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(0, 102, 102));
        btn_Cancelar.setText("CANCELAR");
        btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 110, -1));

        btn_Confirmar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Confirmar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_Confirmar.setForeground(new java.awt.Color(0, 102, 102));
        btn_Confirmar.setText("LOGAR");
        btn_Confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 28, -1, -1));
        jPanel1.add(txt_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed

        Login l = new Login();
        try {

            if (txt_Usuario.getText().trim().equals("")) {
                txt_Usuario.requestFocus(true);
                JOptionPane.showMessageDialog(null, "Usuário Invalido");

            } else if (txt_Senha.getText().trim().equals("")) {
                txt_Senha.requestFocus(true);
                JOptionPane.showMessageDialog(null, "Senha Invalida");
            } else {
                Login select = new Login();
                select.setUsuario(txt_Usuario.getText());
                select.setSenha(txt_Senha.getText());
                LoginDAO cdao = new LoginDAO();
                cdao.ConsultarLogin(select);
                if(l.getVerifica().equals("OK")){
                    Frm_Login login = new Frm_Login();
                    Frm_Menu menu = new Frm_Menu();
                    menu.setVisible(true);
                    login.dispose();
                }
                
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }//GEN-LAST:event_btn_ConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblsenha;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPasswordField txt_Senha;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
