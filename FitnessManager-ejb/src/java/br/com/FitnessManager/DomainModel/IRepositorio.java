/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DomainModel;

/**
 *
 * @author Chrome
 */
public interface IRepositorio<T> {
    void salvar(T obj);
    T abrir(long id);
    void apagar(T obj);
}
