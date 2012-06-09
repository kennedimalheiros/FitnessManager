/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DomainModel;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Chrome
 */
@Entity
public class Objetivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String descricao;
    
    @Column
    @Temporal(TemporalType.TIME)    
    private Date descanco;
    
    @Column
    private int treinosSemanais;
    
    @OneToOne
    @JoinColumn(name="EsquemaExercicio")
    EsquemaExercicio ee;

    public Date getDescanco() {
        return descanco;
    }

    public void setDescanco(Date descanco) {
        this.descanco = descanco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTreinosSemanais() {
        return treinosSemanais;
    }

    public void setTreinosSemanais(int treinosSemanais) {
        this.treinosSemanais = treinosSemanais;
    }
    
    
    
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
        if (!(object instanceof Objetivo)) {
            return false;
        }
        Objetivo other = (Objetivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.FitnessManager.DomainModel.Objetivo[ id=" + id + " ]";
    }
    
}
