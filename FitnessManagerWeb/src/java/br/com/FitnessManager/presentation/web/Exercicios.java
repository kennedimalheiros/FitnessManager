/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.presentation.web;

import br.com.FitnessManager.DomainModel.Exercicio;
import br.com.FitnessManager.DomainModel.IExercicioRepositorio;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;  
import java.util.List;  
import javax.ejb.EJB;
/**
 *
 * @author Chrome
 */
@Named(value = "exercicios")
@RequestScoped
public class Exercicios implements Serializable{

    private List<Exercicio> exercicios;
    private Exercicio exselecionado;
    
    @EJB
    IExercicioRepositorio rep;
    
    public Exercicios() {
    }  
      
    public Exercicio getExercicioSelecionado() {  
        return exselecionado;  
    }  
  
    public void setExercicioSelecionado(Exercicio selecionado) {  
        this.exselecionado = selecionado;  
    }  
  
    public List<Exercicio> preencheLista() {  
        
        return exercicios;
    }
    public List<Exercicio> getExercicios() {  
        if(exercicios == null)
            exercicios = rep.listaTodos();
        return exercicios;  
    } 
}
