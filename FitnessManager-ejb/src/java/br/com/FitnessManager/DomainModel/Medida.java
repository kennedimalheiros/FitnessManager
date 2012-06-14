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
public class Medida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }
    
    @Column
    private Float peso;
    
    @Column
    private Float altura;
    
    @Column
    private Float braco;
    
    @Column
    private Float cintura;
    
    @Column
    private Float quadril;
    
    @Column
    private Float peitoral;
    
    @Column
    private Float coxa;
    
    @Column
    private Float panturrilha;

    public Float getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(Float Panturrilha) {
        this.panturrilha = Panturrilha;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getBraco() {
        return braco;
    }

    public void setBraco(Float braco) {
        this.braco = braco;
    }

    public Float getCintura() {
        return cintura;
    }

    public void setCintura(Float cintura) {
        this.cintura = cintura;
    }

    public Float getCoxa() {
        return coxa;
    }

    public void setCoxa(Float coxa) {
        this.coxa = coxa;
    }

    public Float getPeitoral() {
        return peitoral;
    }

    public void setPeitoral(Float peitoral) {
        this.peitoral = peitoral;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getQuadril() {
        return quadril;
    }

    public void setQuadril(Float quadril) {
        this.quadril = quadril;
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
        if (!(object instanceof Medida)) {
            return false;
        }
        Medida other = (Medida) object;
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
