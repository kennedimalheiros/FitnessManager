/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.presentation.web;

import br.com.FitnessManager.DomainModel.IPessoaRepositorio;
import br.com.FitnessManager.DomainModel.IUsuarioRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;
import br.com.FitnessManager.DomainModel.Usuario;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;  
import javax.faces.context.FacesContext;  
import javax.faces.event.ActionEvent;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Chrome
 */
@Named(value = "registroUsuario")
@RequestScoped
public class RegistroUsuario {
    
    @EJB
    IUsuarioRepositorio r;
    
    @EJB
    IPessoaRepositorio p;
    
    Pessoa pessoa;
    String usuario;  
    String nome;  
    String senha;
    String testeu;
    String testes;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTestes() {
        return testes;
    }

    public void setTestes(String testes) {
        this.testes = testes;
    }

    public String getTesteu() {
        return testeu;
    }

    public void setTesteu(String testeu) {
        this.testeu = testeu;
    }
     
    public RegistroUsuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    public void salvar(){
        pessoa = new Pessoa();
        Usuario u = new Usuario(); 
        u.setLogin(getUsuario());
        u.setSenha(encripta(getSenha()));
        pessoa.setUsuario(u);
        pessoa.setNome(nome);
        //r.salvar(u);
        p.salvar(pessoa);
    }
    
    public void teste(){
        setTesteu(getUsuario());
    }
    
    public void msgConfirma(ActionEvent actionEvent){  
        salvar();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Parabéns",  "Registro realizado com sucesso!");  
          
        FacesContext.getCurrentInstance().addMessage(null, message);  
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
}
