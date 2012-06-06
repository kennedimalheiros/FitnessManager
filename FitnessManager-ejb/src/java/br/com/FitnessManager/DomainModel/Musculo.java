/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DomainModel;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Chrome
 */
@Entity
public class Musculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Long getId() {
        return id;
    }
    
    @Column
    private Float peito;
    
    @Column
    private Float costa;
    
    @Column
    private Float ombro;
    
    @Column
    private Float biceps;
    
    @Column
    private Float triceps;
    
    @Column
    private Float asa;
    
    @Column
    private Float abdomen;
    
    @Column
    private Float antebraco;
    
    @Column
    private Float panturrilha;
    
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
        if (!(object instanceof Musculo)) {
            return false;
        }
        Musculo other = (Musculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.FitnessManager.DomainModel.Medida[ id=" + id + " ]";
    }
    
}
