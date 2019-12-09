/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.visao;

import br.edu.ifsul.assistencia.model.Cliente;
import br.edu.ifsul.assistencia.model.Produto;
import br.edu.ifsul.assistencia.model.dao.Conexao;
import br.edu.ifsul.assistencia.model.dao.DAOCliente;
import br.edu.ifsul.assistencia.model.dao.DAOProduto;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author ramon
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    DAOCliente dao = new DAOCliente();
    Cliente c = new Cliente();
    Conexao conexao = new Conexao();
    private java.util.List<Cliente> list;
    DAOProduto daop = new DAOProduto();

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroCliente() {
        initComponents();
        carregaTabela();
        preencherProduto();
        
       //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public void preencherProduto(){
        DAOProduto daoProduto = new DAOProduto();
        
        for(Produto p : daoProduto.listarProduto()){
            jComboBoxProduto.addItem(p);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelProduto = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonLocalicalizar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jLabelCPF.setText("CPF:");

        jLabelTelefone.setText("Telefone:");

        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
            }
        });

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jLabelCodigo.setText("Codigo:");

        jLabelProduto.setText("Produto:");

        jLabelEndereco.setText("Endereco");

        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelCPF))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))))
                    .addComponent(jLabelProduto))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefone)
                            .addComponent(jLabelEndereco))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEndereco)
                            .addComponent(jTextFieldTelefone))))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProduto)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new java.awt.GridLayout());

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone", "Endereço", "N de serie", "Modelo", "Marca"
            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jPanel4.add(jScrollPane1);

        jPanel1.setLayout(new java.awt.GridLayout());

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar);

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDeletar);

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtualizar);

        jButtonLimpar.setText("Limpar Campos");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpar);

        jButtonLocalicalizar.setText("Localizar");
        jButtonLocalicalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocalicalizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLocalicalizar);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVoltar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
        // TODO add your handling code here:
        Container janela = getContentPane();
        setLayout(null);

        //
        JLabel labelCpf = new JLabel("CPF: ");

        // mask
        MaskFormatter mascaraCpf = null;

        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");

        } catch (ParseException excp) {
            System.err.println("Erro na formatacao: " + excp.getMessage());
            System.exit(-1);
        }
        //
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);


    }//GEN-LAST:event_jTextFieldCpfActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        boolean valido = true;

        if (jTextFieldNome.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O nome deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldCpf.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O CPF deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldEndereco.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O Endereço deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldTelefone.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O Telefone deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
       if (jComboBoxProduto.getSelectedIndex() == 0) {
           JOptionPane.showMessageDialog(rootPane, "O Produto deve ser selecionado!!");
           jComboBoxProduto.requestFocus();
            valido = false;
           return;
       }
        if(jTextFieldCodigo.getText().length()<=0){
            JOptionPane.showMessageDialog(rootPane, "A linha a ser alterada deve ser selecionada!!");
            valido = false;
            return;
        }

        if (valido == true) {
                
            c.setCpf(jTextFieldCpf.getText());
            c.setEndereco(jTextFieldEndereco.getText());
            c.setNome(jTextFieldNome.getText());
            c.setTelefone(jTextFieldTelefone.getText());
            Produto p = new Produto();
            p = (Produto) jComboBoxProduto.getSelectedItem();
            p.getNumeroSerie();
          
            for(Produto po : daop.listar()){
                if(p.getNumeroSerie().equals(po.getNumeroSerie())){
                    
                    p.setCodigoProduto(po.getCodigoProduto());
                }
            }
            
            c.setProduto(p);
            c.setCodigoCliente(Integer.parseInt(jTextFieldCodigo.getText()));

            dao.alterar(c);
            JOptionPane.showMessageDialog(rootPane, "Cliente alterado com sucesso!");
            carregaTabela();
        }

    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonLocalicalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocalicalizarActionPerformed
        // TODO add your handling code here:
        TelaLocalizarCliente tela = new TelaLocalizarCliente();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLocalicalizarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        boolean valido = true;

        if (jTextFieldNome.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O nome deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldCpf.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O CPF deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldEndereco.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O Endereço deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldTelefone.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O Telefone deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
       if (jComboBoxProduto.getSelectedIndex() == 0) {
           JOptionPane.showMessageDialog(rootPane, "O Produto deve ser selecionado!!");
           jComboBoxProduto.requestFocus();
            valido = false;
           return;
       }

        if (valido == true) {
            c.setNome(jTextFieldNome.getText());
            c.setCpf(jTextFieldCpf.getText());
            c.setEndereco(jTextFieldEndereco.getText());
            c.setTelefone(jTextFieldTelefone.getText());
            Produto p = new Produto();
            p = (Produto) jComboBoxProduto.getSelectedItem();
            p.getNumeroSerie();
          
            for(Produto po : daop.listar()){
                if(p.getNumeroSerie().equals(po.getNumeroSerie())){
                    
                    p.setCodigoProduto(po.getCodigoProduto());
                }
            }
            
            c.setProduto(p);
            dao.inserir(c);
            JOptionPane.showMessageDialog(rootPane, "Cliente inserido com sucesso!");
            carregaTabela();
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        int row = jTableCliente.getSelectedRow();
        if (row != -1) {

            int res = JOptionPane.showConfirmDialog(rootPane, "Deseja remover este registro?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (res == JOptionPane.YES_NO_OPTION) {

                int id = (int) jTableCliente.getValueAt(row, 0);

                dao.remover(id);
                carregaTabela();
                jTextFieldNome.setText("");
                jTextFieldCpf.setText("");
                jTextFieldEndereco.setText("");
                jTextFieldTelefone.setText("");
                jComboBoxProduto.setSelectedIndex(0);
                jTextFieldCodigo.setText("");
                carregaTabela();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Linha a ser deletada não foi selecionada!!");
        }


    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        // TelaPrincipal tela = new TelaPrincipal();
        //tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

        jTextFieldNome.setText("");
        jTextFieldCpf.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldTelefone.setText("");
        jComboBoxProduto.setSelectedIndex(0);
        jTextFieldCodigo.setText("");
        carregaTabela();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        int index = jTableCliente.getSelectedRow();
        if (index != -1) {
            jTextFieldCodigo.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 0).toString());
            jTextFieldNome.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 1).toString());
            jTextFieldCpf.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 2).toString());
            jTextFieldTelefone.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 3).toString());
            jTextFieldEndereco.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 4).toString());
          //  jTextFieldProduto.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_jTableClienteMouseClicked
    private void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) jTableCliente.getModel();
        modelo.setNumRows(0);
        DAOCliente dao = new DAOCliente();

        try {

            for (Cliente c : dao.listar()) {
                modelo.addRow(new Object[]{
                    c.getCodigoCliente(),
                    c.getNome(),
                    c.getCpf(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getProduto().getNumeroSerie(),
                    c.getProduto().getModelo().getDescricao(),
                    c.getProduto().getModelo().getMarca().getDescricao(),});
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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonLocalicalizar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<Object> jComboBoxProduto;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
