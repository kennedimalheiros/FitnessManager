/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.presentation.web;

import br.com.FitnessManager.DomainModel.IPessoaRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;
import br.com.FitnessManager.DomainModel.Usuario;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.event.FlowEvent;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Chrome
 */
@Named(value = "registro")
@RequestScoped
public class Registro {
   
    @EJB
    IPessoaRepositorio p;
    
    Pessoa pessoa = new Pessoa();
    Usuario usuario = new Usuario();  
    private static Logger logger = Logger.getLogger(Registro.class.getName());
    
    public Registro() {
        pessoa = new Pessoa();
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void salvar(){
        usuario.setSenha(encripta(usuario.getSenha()));
        pessoa.setUsuario(usuario);
        p.salvar(pessoa);
    }
    
    public void registrar(ActionEvent actionEvent){  
        salvar();
        FacesContext context = FacesContext.getCurrentInstance();  
          
        context.addMessage(null, new FacesMessage("Registro", "Registro realizado com sucessso\n Bem vindo " + pessoa.getNome()));  
    }    
    public static String encripta (String senha) {     
           try {     
                MessageDigest digest = MessageDigest.getInstance("MD5");      
                digest.update(senha.getBytes());      
                BASE64Encoder encoder = new BASE64Encoder ();      
                return encoder.encode (digest.digest ());      
           } catch (NoSuchAlgorithmException ns) {     
                ns.printStackTrace ();      
                return senha;      
           }      
     }
    
    public String onFlowProcess(FlowEvent event) {  
        
        logger.info("Current wizard step:" + event.getOldStep());  
        logger.info("Next step:" + event.getNewStep());
        return event.getNewStep();
    }
}
