/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia_pets;

import br.edu.ifnmg.logica.aplicacao.Fornecedor;
import br.edu.ifnmg.logica.aplicacao.FornecedorRepo;
import java.util.List;

/**
 *
 * @author D.N.S.J
 */
public class FornecedorDAO extends DataAccessObject<Fornecedor> implements FornecedorRepo{

    public FornecedorDAO() {
        super(Fornecedor.class);
    }


    @Override
    public List<Fornecedor> Buscar(Fornecedor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
