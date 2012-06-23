/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.presentation.console;


import br.com.FitnessManager.DomainModel.IPessoaRepositorio;
import br.com.FitnessManager.DomainModel.IUsuarioRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;
import br.com.FitnessManager.DomainModel.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Chrome
 */
public class PessoaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        try {
            Context context = new InitialContext();
            
            IUsuarioRepositorio ejbu = (IUsuarioRepositorio)context.lookup("java:global/FitnessManager/FitnessManager-ejb/UsuarioDAO");
            IPessoaRepositorio ejbp = (IPessoaRepositorio)context.lookup("java:global/FitnessManager/FitnessManager-ejb/PessoaDAO");
            
            Pessoa p = new Pessoa();
            Usuario u = new Usuario(); 
            u.setLogin("Gpzim");
            u.setSenha("1234");            
            ejbu.salvar(u);
            p.setNome("Gpzim Pacheco");
            p.setCpf("12345678910");
            p.setRg("MG15407333");
            p.setStatus(Boolean.TRUE);
            ejbp.salvar(p);
            System.out.println("ID Usuário: "+ejbu.porNome("Gpzim").getId());
            
        } catch (NamingException ex) {
            Logger.getLogger(PessoaTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
