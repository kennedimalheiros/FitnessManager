/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DomainModel;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.*;

/**
 *
 * @author Chrome
 */
@Entity
public class EsquemaExercicio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    Time tempo;
    
    @ManyToOne        
    Medida medidaAtual;
    
    @ManyToOne
    Medida medidaInicial;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EsquemaExercicio)) {
            return false;
        }
        EsquemaExercicio other = (EsquemaExercicio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.FitnessManager.DomainModel.EsquemaExercicio[ id=" + id + " ]";
    }
    
}
