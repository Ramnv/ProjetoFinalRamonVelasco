/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.visao;

import br.edu.ifsul.assistencia.model.Marca;
import br.edu.ifsul.assistencia.model.Modelo;
import br.edu.ifsul.assistencia.model.Ordem;
import br.edu.ifsul.assistencia.model.Peca;
import br.edu.ifsul.assistencia.model.dao.Conexao;
import br.edu.ifsul.assistencia.model.dao.DAOMarca;
import br.edu.ifsul.assistencia.model.dao.DAOModelo;
import br.edu.ifsul.assistencia.model.dao.DAOOrdem;
import br.edu.ifsul.assistencia.model.dao.DAOPecas;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ramon
 */
public class TelaOrcamento extends javax.swing.JFrame {
    
        DAOMarca daomarca = new DAOMarca();
        Marca marca = new Marca();
        
        DAOModelo daomodelo = new DAOModelo();
        Modelo modelo = new Modelo();
        
        DAOPecas daopecas = new DAOPecas(); 
        Peca peca = new Peca();
               
        Conexao conexao = new Conexao(); 
        int idMarca;
        int idModelo;
        int idPeca;
        
        
    public TelaOrcamento() {
        
        initComponents();
        preencherMarca();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jComboBoxModelo.setEnabled(false);
        jComboBoxPeca.setEnabled(false);
    }
    
    public void preencherMarca(){
        
        for(Marca ma : daomarca.listarNome()){
            
            jComboBoxMarca.addItem(ma);
        }
        
    }
    public void preencherModelo(int id){
        
      
        
    //criar dao para pegar modelo where cod_marca = ? 
        for(Modelo mo : daomodelo.listarModeloCodigoMarca(idMarca)){
            
            jComboBoxModelo.addItem(mo);
        }
    }
    //criar dao para pegar peca where cod_marca = ? 
     public void preencherPeca(int id){
         
         for(Peca pe : daopecas.listarPecaCodigoModelo(idModelo)){
         
             jComboBoxPeca.addItem(pe);
         }
    
    }
     public void mostarValor(int id){
         for(Peca pe : daopecas.localizar(idPeca)){
             jTextField2.setText("R$" + pe.getValor());
         }
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelPeça = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jComboBoxModelo = new javax.swing.JComboBox<>();
        jComboBoxPeca = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout());

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField2);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Orçamento"));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabelMarca.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelMarca.setText("Marca:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 154, 0, 0);
        jPanel2.add(jLabelMarca, gridBagConstraints);

        jLabelModelo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelModelo.setText("Modelo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 154, 0, 0);
        jPanel2.add(jLabelModelo, gridBagConstraints);

        jLabelPeça.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelPeça.setText("Peça:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 154, 38, 0);
        jPanel2.add(jLabelPeça, gridBagConstraints);

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:" }));
        jComboBoxMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMarcaItemStateChanged(evt);
            }
        });
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 185;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 68, 0, 123);
        jPanel2.add(jComboBoxMarca, gridBagConstraints);

        jComboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:" }));
        jComboBoxModelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxModeloItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 185;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 68, 0, 123);
        jPanel2.add(jComboBoxModelo, gridBagConstraints);

        jComboBoxPeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 185;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 68, 38, 123);
        jPanel2.add(jComboBoxPeca, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButtonSalvar.setText("Gerar Orçamento");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSalvar);

        jButtonLimpar.setText("Limpar Campos");
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        //TelaPrincipal tela = new TelaPrincipal();
        //tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        if(jComboBoxPeca.getSelectedIndex()>0){
            Peca p = (Peca) jComboBoxPeca.getSelectedItem();
            idPeca = p.getCodigoPeca();
            mostarValor(idPeca);
        }
        else {
            JOptionPane.showMessageDialog(rootPane,"A peca deve ser selecionada!" );
        }
       
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jComboBoxMarca.setSelectedIndex(0);
        jComboBoxModelo.setSelectedIndex(0);
        jComboBoxPeca.setSelectedIndex(0);
        jTextField2.setText("");
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jComboBoxMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMarcaItemStateChanged
        // TODO add your handling code here:
        //pegar a lista fazer um for e comparar a marca selecionada
        if(jComboBoxMarca.getSelectedIndex()>0){
            //pegar o codigo da marca pelo for e listar só os modelos daquela marca
            // e preencher o combobox com eles
              
                
           Marca m = (Marca) jComboBoxMarca.getSelectedItem();
           
            System.out.println("m: "+m.getCodigoMarca());
           idMarca = m.getCodigoMarca();
           preencherModelo(idMarca);
           
           
           
            jComboBoxModelo.setEnabled(true);
           
        }
    }//GEN-LAST:event_jComboBoxMarcaItemStateChanged

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void jComboBoxModeloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxModeloItemStateChanged
        
        if(jComboBoxModelo.getSelectedIndex()>0){
            
            Modelo m = (Modelo) jComboBoxModelo.getSelectedItem();
            System.out.println("m: "+m.getCodigoModelo());
            preencherPeca(m.getCodigoModelo());
            idModelo = m.getCodigoModelo();
            jComboBoxPeca.setEnabled(true);
            
        }
    }//GEN-LAST:event_jComboBoxModeloItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<Object> jComboBoxMarca;
    private javax.swing.JComboBox<Object> jComboBoxModelo;
    private javax.swing.JComboBox<Object> jComboBoxPeca;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPeça;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
