/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logica.aplicacao;

import static br.edu.ifnmg.logica.aplicacao.TipoUsuario.Funcionario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author D.N.S.J
 */
@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name= "Login", length = 250, unique = true, nullable = false)
    private String login;
    
    @Column(name = "Senha", length = 250, nullable = false)
    private String senha;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date momentoAcesso;
    
    @Column(name = "Cargo", length = 250, nullable = false)
    private String cargo; 
    
    
    @Column(precision = 8,scale = 2, nullable = false)
    private BigDecimal salario;
    
    private TipoUsuario tipo;
    
    private Pessoa pessoa;

    public Usuario() {
        this.cargo = "";
        this.id = 0L;
        this.login = "";
        this.momentoAcesso = new Date();
        this.pessoa = null;
        this.salario = new BigDecimal("0.00");
        this.senha = "";
        
    }
    
    public Usuario(String login, String senha) {
        this.cargo = "";
        this.id = 0L;
        this.login = "";
        this.momentoAcesso = new Date();
        this.pessoa = null;
        this.salario = new BigDecimal("0.00");
        this.tipo = Funcionario;
        this.senha = "";
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getMomentoAcesso() {
        return momentoAcesso;
    }

    public void setMomentoAcesso(Date momentoAcesso) {
        this.momentoAcesso = momentoAcesso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoal) {
        this.pessoa = pessoal;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.login;
    }
    
}
