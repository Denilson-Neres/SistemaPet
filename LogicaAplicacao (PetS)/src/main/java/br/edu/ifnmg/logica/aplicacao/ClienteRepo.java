/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logica.aplicacao;

/**
 *
 * @author D.N.S.J
 */
public interface ClienteRepo extends Repositorio<Cliente>{
    public Cliente AbrirCpf(String cpf);
}
