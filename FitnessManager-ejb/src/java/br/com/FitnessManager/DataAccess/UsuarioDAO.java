/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IUsuarioRepositorio;
import br.com.FitnessManager.DomainModel.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Chrome
 */
@Stateless
public class UsuarioDAO extends DAOGenerico<Usuario> implements IUsuarioRepositorio{
   
    public UsuarioDAO(){
        super(Usuario.class);
    }

    @Override
    public Usuario porNome(String nome) {
        Query sql=(Query) manager.createQuery("select u from Usuario u where u.login='"+nome+"'");
        return (Usuario)sql.getSingleResult();
    }

    @Override
    public List<Usuario> listaTodos() {
        Query sql=(Query) manager.createQuery("select u from Usuario u");
        return sql.getResultList();
    }
}
