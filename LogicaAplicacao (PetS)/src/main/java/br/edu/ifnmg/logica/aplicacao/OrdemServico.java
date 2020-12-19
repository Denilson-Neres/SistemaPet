/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logica.aplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 *
 * @author D.N.S.J
 */
@Entity
@Table(name = "Ordem de Serviço")
public class OrdemServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 250, nullable = false)
    private Usuario operador;
    
    @Column(length = 250, nullable = false)
    private Animal animal;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date momento;
    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name ="cliente_id", nullable = false)
    private Cliente cliente;
    
    @Column(length = 500)
    private String Observacao;
    
    @Column(length = 250, nullable = false)
    private Servico servico;
    
    
    @Column(precision = 8, scale = 2)
    private BigDecimal valorTotal;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "os")
    private List<ItemOrdemServico> itens;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Tipo_OS tipo;
    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Usuario usuario;
    
    @Version
    private int version;

    public OrdemServico() {
        
        this.id = 0L;
        this.cliente = null;
        this.Observacao ="";
        this.animal = null;
        this.momento = new Date();
        this.valorTotal = new BigDecimal("0.00");
        this.servico = null;
        this.operador = null;
        this.itens = new ArrayList<>();
        this.tipo = Tipo_OS.Venda;
        this.version = 1;
    }
    
    public OrdemServico(Pessoa pessoa, Tipo_OS tipo,Usuario user) {
        
        this.id = 0L;
        this.cliente = null;
        this.Observacao ="";
        this.animal = null;
        this.momento = new Date();
        this.valorTotal = new BigDecimal("0.00");
        this.servico = null;
        this.operador = null;
        this.itens = new ArrayList<>();
        this.tipo = Tipo_OS.Venda;
        this.version = 1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getOperador() {
        return operador;
    }

    public void setOperador(Usuario operador) {
        this.operador = operador;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }    

    public List<ItemOrdemServico> getItens() {
        return itens;
    }

    public void setItens(List<ItemOrdemServico> itens) {
        this.itens = itens;
    }

    public Tipo_OS getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_OS tipo) {
        this.tipo = tipo;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    
    public boolean add(ItemOrdemServico item){
        if(!this.itens.contains(item)){
            this.itens.add(item);
            this.valorTotal = this.valorTotal.add(
                    item.getValorUnitario().multiply(BigDecimal.valueOf(item.getQuantidade())));
            return true;
        }
        return false;
    }

        public boolean remove(ItemOrdemServico item){
        if(!this.itens.contains(item)){
            this.itens.remove(item);
            this.valorTotal = this.valorTotal.subtract(
                    item.getValorUnitario().multiply(BigDecimal.valueOf(item.getQuantidade())));
            return true;
        }
        return false;
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
        if (!(object instanceof OrdemServico)) {
            return false;
        }
        OrdemServico other = (OrdemServico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.id.toString();
    }
    /*
    public BigDecimal valorFinal(){
        
    }
    */
}
