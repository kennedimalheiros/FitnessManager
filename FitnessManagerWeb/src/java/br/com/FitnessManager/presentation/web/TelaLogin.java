/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.presentation.web;

import br.com.FitnessManager.DomainModel.IUsuarioRepositorio;
import br.com.FitnessManager.DomainModel.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Maurilio
 */
@Named(value = "telalogin")
@SessionScoped
public class TelaLogin implements Serializable {
    
    @EJB
    IUsuarioRepositorio repUser;
    String login,senha,alerta;

    public String getAlerta() {
        return alerta;
    }

    public void setAlerta(String alerta) {
        this.alerta = alerta;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public TelaLogin() {
    
    }
   
    public void verificaUsuario(){
        List<Usuario> usuarios = repUser.listaTodos();
        Iterator<Usuario> i = usuarios.iterator();
        while(i.hasNext()){
            if(login.equals(i.next().getLogin())){
                alerta = "Usuario ja cadastrado, informe senha para login ou novo usuario para cadastro";
                break;
            }
        }
    }
    
    public void mostra(){
        alerta=login;
    }
    
    
    
}
