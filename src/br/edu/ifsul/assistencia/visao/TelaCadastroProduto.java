/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.visao;

import br.edu.ifsul.assistencia.model.Marca;
import br.edu.ifsul.assistencia.model.Modelo;
import br.edu.ifsul.assistencia.model.Peca;
import br.edu.ifsul.assistencia.model.Produto;
import br.edu.ifsul.assistencia.model.dao.Conexao;
import br.edu.ifsul.assistencia.model.dao.DAOMarca;
import br.edu.ifsul.assistencia.model.dao.DAOModelo;
import br.edu.ifsul.assistencia.model.dao.DAOPecas;
import br.edu.ifsul.assistencia.model.dao.DAOProduto;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramon
 */
public class TelaCadastroProduto extends javax.swing.JFrame {

    Produto p = new Produto();
    DAOProduto dao = new DAOProduto();
    Conexao conexao = new Conexao();

    /**
     * Creates new form TelaCadastroPeca
     */
    public TelaCadastroProduto() {
        initComponents();
        carregaTabela();
        preencherModelo();
       // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void preencherModelo() {
        DAOModelo d = new DAOModelo();
        for (Modelo m : d.listarModelo()) {

            jComboBoxModelo.addItem(m);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jComboBoxModelo = new javax.swing.JComboBox<>();
        jLabelModelo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMotivo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldN_serie = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLocalicalizar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Motivo", "Número de série", "Modelo"
            }
        ));
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProduto);

        jPanel1.add(jScrollPane1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        jLabel3.setText("Codigo:");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jComboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:" }));
        jComboBoxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModeloActionPerformed(evt);
            }
        });

        jLabelModelo.setText("Modelo:");

        jLabel1.setText("Motivo: ");

        jTextAreaMotivo.setColumns(20);
        jTextAreaMotivo.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMotivo);

        jLabel2.setText("Número de série: ");

        jTextFieldN_serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldN_serieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabelModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldN_serie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModelo)
                            .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldN_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSalvar);

        jButtonLocalicalizar.setText("Localizar");
        jButtonLocalicalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocalicalizarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonLocalicalizar);

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonLimpar);

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAtualizar);

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDeletar);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        boolean valido = true;

        if (jTextAreaMotivo.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O motivo deve ser informado!");
            jTextAreaMotivo.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldN_serie.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O número de série deve ser informado!");
            jTextFieldN_serie.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldCodigo.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, " A linha a ser alterada deve ser selecionada!!");
            valido = false;
            return;

        }
        if (jComboBoxModelo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "O Modelo deve ser selecionado!!");
            jComboBoxModelo.requestFocus();
            valido = false;
            return;
        }
        
        
        if(valido == true){
         p.setCodigoProduto(Integer.parseInt(jTextFieldCodigo.getText()));
         p.setMotivo(jTextAreaMotivo.getText());
         p.setNumeroSerie(jTextFieldN_serie.getText());
         DAOModelo d = new DAOModelo();
         Modelo m = new Modelo(); 
         m = (Modelo) jComboBoxModelo.getSelectedItem();
         m.getDescricao();
         
         for(Modelo mo : d.listar() ){
           if(m.getDescricao().equals(mo.getDescricao())){
            
               m.setCodigoModelo(mo.getCodigoModelo());
           }  
         }
         p.setModelo(m);
        
           boolean resultado =  dao.atualizar(p);
            if (resultado) {
                JOptionPane.showMessageDialog(rootPane, "Produto alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um problema! Tente novamente");

            }
            carregaTabela();
            
        }

    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonLocalicalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocalicalizarActionPerformed
        // TODO add your handling code here:
        TelaLocalizarProduto tela = new TelaLocalizarProduto();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLocalicalizarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         boolean valido = true;

        if (jTextAreaMotivo.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O motivo deve ser informado!");
            jTextAreaMotivo.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldN_serie.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O número de série deve ser informado!");
            jTextFieldN_serie.requestFocus();
            valido = false;
            return;
        }
        
        if (jComboBoxModelo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "O Modelo deve ser selecionado!!");
            jComboBoxModelo.requestFocus();
            valido = false;
            return;
        }
        
        
        if(valido == true){
        
         p.setMotivo(jTextAreaMotivo.getText());
         p.setNumeroSerie(jTextFieldN_serie.getText());
         DAOModelo d = new DAOModelo();
         Modelo m = new Modelo(); 
         m = (Modelo) jComboBoxModelo.getSelectedItem();
         m.getDescricao();
         
         for(Modelo mo : d.listar() ){
           if(m.getDescricao().equals(mo.getDescricao())){
            
               m.setCodigoModelo(mo.getCodigoModelo());
           }  
         }
         p.setModelo(m);
         dao.incluir(p);
         JOptionPane.showMessageDialog(rootPane, "Produto inserido com sucesso!");
            carregaTabela();
            
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        int row = jTableProduto.getSelectedRow();
        if (row != -1) {
            int res = JOptionPane.showConfirmDialog(rootPane, "Deseja remover este registro?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (res == JOptionPane.YES_NO_OPTION) {

                int id = (int) jTableProduto.getValueAt(row, 0);
                dao.remover(id);
                carregaTabela();

            }
        }else {
            JOptionPane.showMessageDialog(null, "Linha a ser deletada não foi selecionada!!");
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        TelaPrincipal tela = new TelaPrincipal();
//        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        carregaTabela();
        jTextAreaMotivo.setText("");
        jComboBoxModelo.setSelectedIndex(0);
        jTextFieldN_serie.setText("");
        jTextFieldCodigo.setText("");


    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jComboBoxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxModeloActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldN_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldN_serieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldN_serieActionPerformed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        int index = jTableProduto.getSelectedRow();
        
        if(index != -1){
            jTextFieldCodigo.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 0).toString());
            jTextAreaMotivo.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 1).toString());
            jTextFieldN_serie.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jTableProdutoMouseClicked
    private void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) jTableProduto.getModel();
        modelo.setNumRows(0);
        DAOProduto dao = new DAOProduto();

        try {

            for (Produto p : dao.listar()) {
                modelo.addRow(new Object[]{
                    p.getCodigoProduto(),
                    p.getMotivo(),
                    p.getNumeroSerie(),
                    p.getModelo().getDescricao()

                });
            }
        } catch (Exception e) {
            System.out.println("ERRO SQL: " + e.getLocalizedMessage());
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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonLocalicalizar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<Object> jComboBoxModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextArea jTextAreaMotivo;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldN_serie;
    // End of variables declaration//GEN-END:variables
}
