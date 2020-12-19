/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia_pets;

import br.edu.ifnmg.logica.aplicacao.Servico;
import br.edu.ifnmg.logica.aplicacao.ServicoRepo;
import java.util.List;

/**
 *
 * @author D.N.S.J
 */
public class ServicoDAO extends DataAccessObject<Servico> implements ServicoRepo{

    public ServicoDAO() {
        super(Servico.class);
    }

    
    @Override
    public List<Servico> Buscar(Servico obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
