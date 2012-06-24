/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.presentation.console;

import br.com.FitnessManager.DomainModel.*;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Chrome
 */
public class TesteLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Context context = new InitialContext();
            
            IExercicioRepositorio ejbu = (IExercicioRepositorio)context.lookup("java:global/FitnessManager/FitnessManager-ejb/ExercicioDAO");
            List<Exercicio> lista;
            lista=ejbu.listaTodos();
            Iterator<Exercicio> i=lista.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
            
        } catch (NamingException ex) {
            Logger.getLogger(PessoaTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
