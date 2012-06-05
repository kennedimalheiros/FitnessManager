/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IMedidaRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;
import javax.ejb.Stateless;

/**
 *
 * @author Chrome
 */
@Stateless
public class MedidaDAO extends DAOGenerico<Pessoa> implements IMedidaRepositorio{
   
    public MedidaDAO(){
        super(Pessoa.class);
    }

}
