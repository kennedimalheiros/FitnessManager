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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Float getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(Float abdomen) {
        this.abdomen = abdomen;
    }

    public Float getAntebraco() {
        return antebraco;
    }

    public void setAntebraco(Float antebraco) {
        this.antebraco = antebraco;
    }

    public Float getAsa() {
        return asa;
    }

    public void setAsa(Float asa) {
        this.asa = asa;
    }

    public Float getBiceps() {
        return biceps;
    }

    public void setBiceps(Float biceps) {
        this.biceps = biceps;
    }

    public Float getCosta() {
        return costa;
    }

    public void setCosta(Float costa) {
        this.costa = costa;
    }

    public Float getOmbro() {
        return ombro;
    }

    public void setOmbro(Float ombro) {
        this.ombro = ombro;
    }

    public Float getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(Float panturrilha) {
        this.panturrilha = panturrilha;
    }

    public Float getPeito() {
        return peito;
    }

    public void setPeito(Float peito) {
        this.peito = peito;
    }

    public Float getTriceps() {
        return triceps;
    }

    public void setTriceps(Float triceps) {
        this.triceps = triceps;
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
