/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.controle;

import br.edu.ifsul.assistencia.model.dao.Conexao;
import br.edu.ifsul.assistencia.visao.TelaCadastroCliente;
import br.edu.ifsul.assistencia.visao.TelaCadastroFuncionario;
import br.edu.ifsul.assistencia.visao.TelaLogin;
import br.edu.ifsul.assistencia.visao.TelaPrincipal;

/**
 *
 * @author ramon
 */
public class Controle {
    
    
    //Verificar, baseado no exemplo do Telmo, talvez nao funcione 
    //corretamente
    private Conexao conexao;
    private TelaPrincipal frame;
    private TelaLogin telaLogin;
    private TelaCadastroCliente telaCliente;
    private TelaCadastroFuncionario telaFuncionario;
    //inserir as outras
    
    
    public Controle(){
        conexao = new Conexao();
        String retorno = conexao.abreConexao();
        if(retorno == null){
            //inserir as cartas
        }
    }
}
