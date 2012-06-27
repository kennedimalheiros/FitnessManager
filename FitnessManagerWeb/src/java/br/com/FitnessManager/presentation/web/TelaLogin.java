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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import sun.misc.BASE64Encoder;

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
    
    public void abrir(){
        Usuario u = repUser.abrir(1L);
        login="Teste";
        senha="Teste";
    }
    
    /**
     * Verifica se existe usuário cadastrado no banco com o valor informado.
     * @return true se exite usuario, false caso contrario 
     */
    public boolean verificaUsuario(){
        List<Usuario> usuarios = repUser.listaTodos();
        Iterator<Usuario> i = usuarios.iterator();
        while(i.hasNext()){
            if(login.equalsIgnoreCase(i.next().getLogin())){
                //Se exite usuário com mesmo nome, retora verdadeiro, se não.
                return true;
            }
        }
        return false;
    }
    public boolean verificaSenha(){
        Usuario u = repUser.porNome(login);
        String pass = encripta(this.senha);
        if(senha.equals(u.getSenha())){
                //Se exite usuário com mesmo nome, retora verdadeiro, se não.
            return true;
        }
        return false;
    }
    
    
    public int validaLogin(){
        if(verificaUsuario()){
            if(verificaSenha()){
                return 2;
            }
            return 1;
        }
        return 0;
    }
    
    public void msgInformativo(ActionEvent actionEvent){  
        abrir();
        int log = 1;
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao Logar", "Dados incorretos");
        if(log==2){
             message.setSeverity(FacesMessage.SEVERITY_INFO);
             message.setSummary("Login");
             message.setDetail("Login realizado com sucesso!");
        }
        if(log==1){
             message.setSeverity(FacesMessage.SEVERITY_ERROR);
             message.setSummary("Login");
             message.setDetail("Senha incorreta, tente novamente!");
        }
        if(log==0){
             message.setSeverity(FacesMessage.SEVERITY_ERROR);
             message.setSummary("Login");
             message.setDetail("Usuario nao existe, verifique\no nome digitado e tente novamente!");
        }
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
