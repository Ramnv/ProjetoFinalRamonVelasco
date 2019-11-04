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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(610, 260, 80, 23);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/assistencia/imagens/lock.png"))); // NOI18N
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(450, 110, 160, 60);

        jButtonSair.setText("Sair");
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(710, 260, 70, 23);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/assistencia/imagens/key.png"))); // NOI18N
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(460, 190, 141, 60);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(610, 130, 170, 20);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(610, 210, 170, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setText("Quick Budget");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 10, 330, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/assistencia/imagens/AndroidLogo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, 0, 540, 360);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 820, 360);

        setSize(new java.awt.Dimension(839, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAcessarActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
