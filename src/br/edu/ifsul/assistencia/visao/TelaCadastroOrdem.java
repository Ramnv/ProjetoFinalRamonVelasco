/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.visao;

import br.edu.ifsul.assistencia.model.Funcionario;
import br.edu.ifsul.assistencia.model.Modelo;
import br.edu.ifsul.assistencia.model.Ordem;
import br.edu.ifsul.assistencia.model.Peca;
import br.edu.ifsul.assistencia.model.dao.Conexao;
import br.edu.ifsul.assistencia.model.dao.DAOFuncionario;
import br.edu.ifsul.assistencia.model.dao.DAOModelo;
import br.edu.ifsul.assistencia.model.dao.DAOOrdem;
import br.edu.ifsul.assistencia.model.dao.DAOPecas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultButtonModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramon
 */
public class TelaCadastroOrdem extends javax.swing.JFrame {
    
        DAOOrdem dao = new DAOOrdem();
        Ordem o= new Ordem(); 
        Conexao conexao = new Conexao(); 
        
    public TelaCadastroOrdem() {
        initComponents();
        carregaTabela();
        preencherPeca();
        preencherFuncionario();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void preencherPeca(){
        DAOPecas d = new DAOPecas();
       for( Peca pe: d.listarPeca()){
          
         jComboBoxPeca.addItem(pe);
       }
    
    }
    public void preencherFuncionario(){
        DAOFuncionario d = new DAOFuncionario();
       for( Funcionario f: d.listarFunc()){
          
         jComboBoxFuncionario.addItem(f);
       }
    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrdem = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldMotivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButtonSim = new javax.swing.JRadioButton();
        jRadioButtonNao = new javax.swing.JRadioButton();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldDta_ini = new javax.swing.JTextField();
        jTextFieldDta_fim = new javax.swing.JTextField();
        jComboBoxPeca = new javax.swing.JComboBox<>();
        jComboBoxFuncionario = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout());

        jTableOrdem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Motivo", "Peça", "Modelo", "Marca", "Data Inicial", "Data Final", "Valor", "Pago", "Funcionário"
            }
        ));
        jTableOrdem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOrdemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOrdem);

        jPanel1.add(jScrollPane1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Motivo:");

        jLabel4.setText("Peça:");

        jLabel3.setText("Codigo:");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jTextFieldMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMotivoActionPerformed(evt);
            }
        });

        jLabel5.setText("Data Inicial:");

        jLabel6.setText("Data Final:");

        jLabel7.setText("Valor:");

        jLabel8.setText("Pago:");

        jLabel9.setText("Funcionario:");

        jRadioButtonSim.setText("Sim");

        jRadioButtonNao.setText("Nao");

        jTextFieldValor.setText(" ");

        jComboBoxPeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:" }));

        jComboBoxFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonSim)
                                    .addComponent(jRadioButtonNao))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDta_ini, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDta_fim, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(48, 48, 48)
                                        .addComponent(jComboBoxPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jRadioButtonSim)
                                .addComponent(jLabel5)
                                .addComponent(jTextFieldDta_ini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jComboBoxPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonNao)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldDta_fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new java.awt.GridLayout());

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSalvar);

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDeletar);

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAtualizar);

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonLimpar);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonVoltar);

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

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
       carregaTabela();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
//        TelaPrincipal tela = new TelaPrincipal();
//        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        boolean valido = true;
        
        if(jTextFieldMotivo.getText().length()<=0){
            JOptionPane.showMessageDialog(rootPane, "O motivo deve ser informado!!");
            jTextFieldMotivo.requestFocus();
            valido = false;
            return;
        }
        if(jTextFieldDta_ini.getText().length()<=0){
            JOptionPane.showMessageDialog(rootPane, "A data inicial deve ser informada!!");
            jTextFieldDta_ini.requestFocus();
            valido = false;
            return;
        }
        if(jTextFieldDta_fim.getText().length()<=0){
            JOptionPane.showMessageDialog(rootPane, "A data final deve ser informada!!");
            jTextFieldDta_fim.requestFocus();
            valido = false;
            return;
        }
        if(jComboBoxFuncionario.getSelectedIndex()<=0){
            JOptionPane.showMessageDialog(rootPane, " O Funcionário deve ser selecionado!!");
            valido = false;
            return;
        }
           if(jComboBoxPeca.getSelectedIndex()<=0){
            JOptionPane.showMessageDialog(rootPane, " A peça deve ser selecionada!!");
            valido = false;
            return;
        }
  
        if(jTextFieldValor.getText().length()<=0){
            JOptionPane.showMessageDialog(rootPane, "O valor  deve ser informado!!");
            jTextFieldValor.requestFocus();
            valido = false;
            return;
        }
        //DefaultButtonModel modelobotao = (DefaultButtonModel) buttonGroup1.getSelection();
              
//        modelobotao.setArmed(true);
       // if(!buttonGroup1.isSelec){
         //   JOptionPane.showMessageDialog(rootPane, "Deve ser selecionado sim ou não no pagamento!!");
         //  valido = false;
         //  return;
      // }
        
        
        if(valido == true){
            
           Date data1; 
            Date data2;
            try {
                data1 = new SimpleDateFormat("dd/MM/yyyy").parse(jTextFieldDta_ini.getText());
                o.setData_inicial((java.sql.Date) data1);
                data2 = new SimpleDateFormat("dd/MM/yyyy").parse(jTextFieldDta_fim.getText());
                o.setData_final((java.sql.Date) data2);
                
            } catch (ParseException ex) {
                Logger.getLogger(TelaCadastroOrdem.class.getName()).log(Level.SEVERE, null, ex);
            }
           o.setMotivo(jTextFieldMotivo.getText());  
           //chama o dao para poder listar os funcionarios
           DAOFuncionario daofuncionario = new DAOFuncionario();
          //cria um funcionario e pega o nome que foi selecionado
           Funcionario f = (Funcionario) jComboBoxFuncionario.getSelectedItem();
           //pega o nome do funcionario
           f.getNome();
           //compara o nome com a lista de funcionários existente
           for(Funcionario func: daofuncionario.listar()){
               //se forem iguais pega o código e seta nesse funcionario criado
               if(f.getNome().equals(func.getNome())){
                   f.setFuncionario_cod(func.getFuncionario_cod());
               }
           }
           //seta esse funcionario na ordem
           o.setFuncionario(f);
           
           DAOPecas daopeca = new DAOPecas();
           Peca pe = (Peca) jComboBoxPeca.getSelectedItem();
           pe.getDescricaoPeca();
           for( Peca p : daopeca.listar()){
               if(pe.getDescricaoPeca().equals(p.getDescricaoPeca())){
                   pe.setCodigoPeca(p.getCodigoPeca());
               }
           }
           o.setPeca(pe);
          
           o.setValor(Float.parseFloat(jTextFieldValor.getText()));
           if(jRadioButtonNao.isSelected()){
               
             o.setPago(false);
           }
           if( jRadioButtonSim.isSelected()){
               o.setPago(true);
           }
           dao.incluir(o);
           carregaTabela();
           
        }
     
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
      
       jTextFieldValor.setText("");
       jTextFieldMotivo.setText("");
       jTextFieldDta_ini.setText(" ");
       jTextFieldDta_fim.setText("");
       jTextFieldCodigo.setText("");
       buttonGroup1.clearSelection();
       jComboBoxPeca.setSelectedIndex(0);
       jComboBoxFuncionario.setSelectedIndex(0);
       
        
        carregaTabela();
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTextFieldMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMotivoActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        o.setOrdem_cod(Integer.parseInt(jTextFieldCodigo.getText()));
        dao.remover(o);
        carregaTabela();
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jTableOrdemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOrdemMouseClicked
        int index = jTableOrdem.getSelectedRow();
        if(index!= -1){
            jTextFieldMotivo.setText(jTableOrdem.getValueAt(jTableOrdem.getSelectedRow(),1).toString());
            jTextFieldCodigo.setText(jTableOrdem.getValueAt(jTableOrdem.getSelectedRow(),0).toString());
            jTextFieldDta_fim.setText(jTableOrdem.getValueAt(jTableOrdem.getSelectedRow(),6).toString());
            jTextFieldDta_ini.setText(jTableOrdem.getValueAt(jTableOrdem.getSelectedRow(),5).toString());
            jTextFieldValor.setText(jTableOrdem.getValueAt(jTableOrdem.getSelectedRow(),7).toString());
            jRadioButtonNao.setSelected(jTableOrdem.getValueAt(jTableOrdem.getSelectedRow(),8).equals("false"));
            jRadioButtonSim.setSelected(jTableOrdem.getValueAt(jTableOrdem.getSelectedRow(),8).equals("true"));
            jComboBoxPeca.setSelectedItem(jTableOrdem.getValueAt(jTableOrdem.getSelectedRow(),2).toString());
            jComboBoxPeca.setSelectedItem(jTableOrdem.getValueAt(jTableOrdem.getSelectedRow(),9).toString());
        }
    }//GEN-LAST:event_jTableOrdemMouseClicked
private void carregaTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) jTableOrdem.getModel();
        modelo.setNumRows(0);
        DAOOrdem dao = new DAOOrdem();
        
        try{
        
        for(Ordem o: dao.listar()){
            modelo.addRow(new Object[]{
         
                o.getOrdem_cod(),
                o.getMotivo(),
                o.getPeca().getDescricaoPeca(),
                o.getPeca().getModelo().getDescricao(),
                o.getPeca().getModelo().getMarca().getDescricao(),
                o.getData_inicial(),
                o.getData_final(),
                
                o.getValor(),
                o.getPago(),
                o.getFuncionario().getNome(),
            
            });
        }
        }catch(Exception e){
            System.out.println("ERRO SQL: " +e.getLocalizedMessage());
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
            java.util.logging.Logger.getLogger(TelaCadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroOrdem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<Object> jComboBoxFuncionario;
    private javax.swing.JComboBox<Object> jComboBoxPeca;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonNao;
    private javax.swing.JRadioButton jRadioButtonSim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrdem;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDta_fim;
    private javax.swing.JTextField jTextFieldDta_ini;
    private javax.swing.JTextField jTextFieldMotivo;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
