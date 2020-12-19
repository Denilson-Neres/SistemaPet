/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia_pets;

import br.edu.ifnmg.logica.aplicacao.RelatorioFinancas;
import br.edu.ifnmg.logica.aplicacao.RelatorioFinancasRepo;
import java.util.List;

/**
 *
 * @author D.N.S.J
 */
public class RelatorioFinancasDAO extends DataAccessObject<RelatorioFinancas> implements RelatorioFinancasRepo{

    public RelatorioFinancasDAO() {
        super(RelatorioFinancas.class);
    }

    
    @Override
    public List<RelatorioFinancas> Buscar(RelatorioFinancas obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
