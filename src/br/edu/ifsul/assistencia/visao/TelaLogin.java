/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.visao;

/**
 *
 * @author ramon
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        jButtonAcessar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(360, 290, 80, 23);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/assistencia/imagens/iconfinder_Internet_Security_Padlock_lock_locked_circle_door_5172995.png"))); // NOI18N
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(200, 140, 160, 60);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(461, 290, 70, 23);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/assistencia/imagens/iconfinder_Internet_Security_key_lock_password_door_safe_5172988.png"))); // NOI18N
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(220, 230, 141, 40);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(360, 180, 170, 20);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(360, 250, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/assistencia/imagens/iconfinder_Internet_Security_locked_shield_antivirus_protect_lock_5172993 (2).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 30, 120, 110);
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 770, 440);

        setSize(new java.awt.Dimension(786, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
