/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IPessoaRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;
import javax.ejb.Stateless;

/**
 *
 * @author Chrome
 */
@Stateless
public class PessoaDAO extends DAOGenerico<Pessoa> implements IPessoaRepositorio{
   
    public PessoaDAO(){
        super(Pessoa.class);
    }

}
