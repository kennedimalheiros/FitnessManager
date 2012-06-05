/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IObjetivoRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;
import javax.ejb.Stateless;

/**
 *
 * @author Chrome
 */
@Stateless
public class ObjetivoDAO extends DAOGenerico<Pessoa> implements IObjetivoRepositorio{
   
    public ObjetivoDAO(){
        super(Pessoa.class);
    }

}
