/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PessoaTeste;


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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        try {
            Context context = new InitialContext();
            
            IUsuarioRepositorio ejbu = (IUsuarioRepositorio)context.lookup("java:global/FitnessManager/FitnessManager-ejb/UsuarioDAO");
            IPessoaRepositorio ejbp = (IPessoaRepositorio)context.lookup("java:global/FitnessManager/FitnessManager-ejb/PessoaDAO");
            
            Pessoa p;
            p = ejbp.abrir(1);
            Usuario u = new Usuario(); 
            u.setLogin("Chrome");
            u.setSenha("123");
            u.setPessoa(p);            
            ejbu.salvar(u);
            
        } catch (NamingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
