/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DomainModel;

import javax.ejb.Remote;

/**
 *
 * @author Chrome
 */
@Remote
public interface Repositorios {
    IPessoaRepositorio pessoa();
    IObjetivoRepositorio objetivo();
    IUsuarioRepositorio usuario();
}
