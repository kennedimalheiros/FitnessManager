/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.EsquemaExercicio;
import br.com.FitnessManager.DomainModel.IEsquemaRepositorio;
import javax.ejb.Stateless;

/**
 *
 * @author Chrome
 */
@Stateless
public class EsquemaDAO extends DAOGenerico<EsquemaExercicio> implements IEsquemaRepositorio{
   
    public EsquemaDAO(){
        super(EsquemaExercicio.class);
    }

}
