    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DomainModel;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Chrome
 */
@Remote
public interface IExercicioRepositorio extends IRepositorio<Exercicio>{
    List<Exercicio> listaTodos();
}
