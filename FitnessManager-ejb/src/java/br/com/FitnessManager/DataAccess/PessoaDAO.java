/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IPessoaRepositorio;
import br.com.FitnessManager.DomainModel.Pessoa;
import br.com.FitnessManager.DomainModel.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Chrome
 */
@Stateless
public class PessoaDAO extends DAOGenerico<Pessoa> implements IPessoaRepositorio{
   
    public PessoaDAO(){
        super(Pessoa.class);
    }

    @Override
    public Pessoa porNome(String nome) {
        Query sql=(Query) manager.createQuery("select p from Pessoa p where p.nome='"+nome+"'");
        return (Pessoa)sql.getSingleResult();
    }

    @Override
    public List<Pessoa> listaTodos() {
        Query sql=(Query) manager.createQuery("select p from Pessoa p");
        return sql.getResultList();
    }

    @Override
    public Pessoa porLogin(String login) {
        Query sql=(Query) manager.createQuery("select p from Pessoa p "
                + "join Usuario u on u.id = p.usuario_id where u.login='"+login+"'");
        return (Pessoa)sql.getSingleResult();
    }

}
