/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IPessoaRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;

/**
 *
 * @author Chrome
 */
public class MedidaDAO extends DAOGenerico<Pessoa> implements IPessoaRepositorio{
   
    public MedidaDAO(){
        super(Pessoa.class);
    }

}
