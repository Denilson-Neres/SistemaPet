/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia_pets;

import br.edu.ifnmg.logica.aplicacao.Compra;
import br.edu.ifnmg.logica.aplicacao.CompraRepo;
import java.util.List;

/**
 *
 * @author D.N.S.J
 */
public class CompraDAO extends DataAccessObject<Compra> implements CompraRepo{

    public CompraDAO() {
        super(Compra.class);
    }


    @Override
    public List<Compra> Buscar(Compra obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
