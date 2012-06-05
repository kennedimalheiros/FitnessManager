/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IUsuarioRepositorio;
import br.com.FitnessManager.DomainModel.Usuario;
import javax.ejb.Stateless;

/**
 *
 * @author Chrome
 */
@Stateless
public class UsuarioDAO extends DAOGenerico<Usuario> implements IUsuarioRepositorio{
   
    public UsuarioDAO(){
        super(Usuario.class);
    }

}
