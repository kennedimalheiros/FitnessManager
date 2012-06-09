/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IObjetivoRepositorio;
import br.com.FitnessManager.DomainModel.Objetivo;
import javax.ejb.Stateless;

/**
 *
 * @author Chrome
 */
@Stateless
public class ObjetivoDAO extends DAOGenerico<Objetivo> implements IObjetivoRepositorio{
   
    public ObjetivoDAO(){
        super(Objetivo.class);
    }

}
