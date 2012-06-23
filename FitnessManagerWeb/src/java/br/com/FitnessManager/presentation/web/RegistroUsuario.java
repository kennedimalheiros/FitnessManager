/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.presentation.web;

import br.com.FitnessManager.DomainModel.IUsuarioRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;
import br.com.FitnessManager.DomainModel.Usuario;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;  
import javax.faces.context.FacesContext;  
import javax.faces.event.ActionEvent;

/**
 *
 * @author Chrome
 */
@Named(value = "registroUsuario")
@Dependent
public class RegistroUsuario {
    
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
    
    @EJB
    IUsuarioRepositorio r;
    
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
    
    public void salvar(){
        Usuario u = new Usuario(); 
        u.setLogin(getUsuario());
        u.setSenha(getSenha());
        //r.salvar(u);
    }
    
    public void teste(){
        setTesteu(getUsuario());
    }
    
    public void msgConfirma(ActionEvent actionEvent){  
        teste();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Parabéns "+getTesteu(),  "Registro realizado com sucesso!");  
          
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }
    
}
