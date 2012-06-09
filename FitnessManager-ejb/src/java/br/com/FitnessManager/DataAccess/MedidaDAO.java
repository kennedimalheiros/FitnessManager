/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IMedidaRepositorio;
import br.com.FitnessManager.DomainModel.Medida;
import javax.ejb.Stateless;

/**
 *
 * @author Chrome
 */
@Stateless
public class MedidaDAO extends DAOGenerico<Medida> implements IMedidaRepositorio{
   
    public MedidaDAO(){
        super(Medida.class);
    }

}
