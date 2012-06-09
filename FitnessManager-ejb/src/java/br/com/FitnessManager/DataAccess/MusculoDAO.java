/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IMusculoRepositorio;
import br.com.FitnessManager.DomainModel.Musculo;
import javax.ejb.Stateless;

/**
 *
 * @author Chrome
 */
@Stateless
public class MusculoDAO extends DAOGenerico<Musculo> implements IMusculoRepositorio{
   
    public MusculoDAO(){
        super(Musculo.class);
    }

}
