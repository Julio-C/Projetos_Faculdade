package projeto_julio.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JULIO
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menun
     */
    public Menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        Quadrado = new javax.swing.JMenuItem();
        Trapezio = new javax.swing.JMenuItem();
        Retangulo = new javax.swing.JMenuItem();
        Paralelograma = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu4.setText("Cálculos de Perímetro");

        Quadrado.setText("Quadrado");
        Quadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuadradoActionPerformed(evt);
            }
        });
        jMenu4.add(Quadrado);

        Trapezio.setText("Trapezio");
        Trapezio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrapezioActionPerformed(evt);
            }
        });
        jMenu4.add(Trapezio);

        Retangulo.setText("Retangulo");
        Retangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetanguloActionPerformed(evt);
            }
        });
        jMenu4.add(Retangulo);

        Paralelograma.setText("Paralelogramo");
        Paralelograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParalelogramaActionPerformed(evt);
            }
        });
        jMenu4.add(Paralelograma);

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuadradoActionPerformed
        new frmQuadrado().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_QuadradoActionPerformed

    private void TrapezioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrapezioActionPerformed
        new frmtrapezio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TrapezioActionPerformed

    private void RetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetanguloActionPerformed
        new frmRetangulo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetanguloActionPerformed

    private void ParalelogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParalelogramaActionPerformed
        new frmParalelogramo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ParalelogramaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Paralelograma;
    private javax.swing.JMenuItem Quadrado;
    private javax.swing.JMenuItem Retangulo;
    private javax.swing.JMenuItem Trapezio;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
