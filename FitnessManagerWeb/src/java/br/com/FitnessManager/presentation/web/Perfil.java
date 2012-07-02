/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.presentation.web;

import br.com.FitnessManager.DomainModel.Pessoa;
import br.com.FitnessManager.DomainModel.IPessoaRepositorio;
import br.com.FitnessManager.DomainModel.Usuario;
import javax.inject.Named;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author Chrome
 */
@Named(value = "perfil")

public class Perfil implements Serializable {

    private Usuario usuario;
    private Pessoa perfil;
    private boolean habilita = true;
    @EJB
    IPessoaRepositorio rep;

    public Perfil() {
    }

    public Pessoa getPerfil() {
        return perfil;
    }

    public void setPerfil(Pessoa perfil) {
        this.perfil = perfil;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isHabilita() {
        return habilita;
    }

    public void setHabilita(boolean habilita) {
        this.habilita = habilita;
    }
      
    public void buscaDados(){
       // usuario = ;
    }
    
    public void habilita(){
        if(habilita)
            habilita = false;
        else
           habilita = true;
        
    }
    
}
