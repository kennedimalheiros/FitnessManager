/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DataAccess;

import br.com.FitnessManager.DomainModel.IRepositorio;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Chrome
 */
public class DAOGenerico  <T> implements IRepositorio <T>{
    
    public DAOGenerico(Class tipe){
        tipo=tipe;
    }
    
    @PersistenceContext(name="FitnessManager-ejbPU")
    protected EntityManager manager;
    
    private Class tipo;
    
    @Override
    public T abrir(long id) {
        return (T) manager.find(tipo,id);
    }

    @Override
    public void apagar(T obj) {
        manager.remove(obj);
    }

    @Override
    public void salvar(T obj) {
        manager.persist(obj);
    }
}
