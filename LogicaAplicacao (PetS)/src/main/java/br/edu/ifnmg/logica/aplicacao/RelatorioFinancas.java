/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logica.aplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author D.N.S.J
 */
@Entity
@Table(name = "Relatorio Finanças")
public class RelatorioFinancas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public RelatorioFinancas(Long id) {
        this.id = id;
    }
   
    
    
    @Column(length = 250)
    private BigDecimal compras;
    
    @Column(length = 250)
    private OrdemServico os;
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCompras() {
        return compras;
    }

    public void setCompras(BigDecimal compras) {
        this.compras = compras;
    }

    public OrdemServico getOs() {
        return os;
    }

    public void setOs(OrdemServico os) {
        this.os = os;
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
        if (!(object instanceof RelatorioFinancas)) {
            return false;
        }
        RelatorioFinancas other = (RelatorioFinancas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.logica.aplicacao.RelatorioFinancas[ id=" + id + " ]";
    }
    
}
