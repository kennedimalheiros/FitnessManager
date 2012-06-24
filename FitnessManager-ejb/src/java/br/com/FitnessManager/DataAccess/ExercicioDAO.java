/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.Exercicio;
import br.com.FitnessManager.DomainModel.IExercicioRepositorio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Chrome
 */
@Stateless
public class ExercicioDAO extends DAOGenerico<Exercicio> implements IExercicioRepositorio{
   
    public ExercicioDAO(){
        super(Exercicio.class);
    }

    @Override
    public List<Exercicio> listaTodos() {
        Query sql=(Query) manager.createQuery("select e from Exercicio e");
        return sql.getResultList();
    }

}
