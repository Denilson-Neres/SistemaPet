/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia_pets;

import br.edu.ifnmg.logica.aplicacao.Pessoa;
import br.edu.ifnmg.logica.aplicacao.PessoaRepo;
import java.util.List;

/**
 *
 * @author D.N.S.J
 */
public class PessoaDAO extends DataAccessObject<Pessoa> implements PessoaRepo{

    public PessoaDAO() {
        super(Pessoa.class);
    }

    @Override
    public List<Pessoa> Buscar(Pessoa obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
