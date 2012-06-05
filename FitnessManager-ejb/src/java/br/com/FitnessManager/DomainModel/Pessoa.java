/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FitnessManager.DomainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Chrome
 */
@Entity
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length=100)
    private String nome;
    
    @Column(length=11)
    private String cpf;
    
    @Column(length=11)
    private String rg;
    
    @Column
    private Boolean status;
   
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dt_nascimento;
    
    @ManyToOne(targetEntity=Medida.class)
    Medida medida;
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.FitnessManager.DomainModel.Usuario[ id=" + id + " ]";
    }
    
}
