/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IExercicioRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;
import javax.ejb.Stateless;

/**
 *
 * @author Chrome
 */
@Stateless
public class ExercicioDAO extends DAOGenerico<Pessoa> implements IExercicioRepositorio{
   
    public ExercicioDAO(){
        super(Pessoa.class);
    }

}
