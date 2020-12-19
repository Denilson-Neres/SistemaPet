/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia_pets;

import br.edu.ifnmg.logica.aplicacao.OrdemServico;
import br.edu.ifnmg.logica.aplicacao.OrdemServicoRepo;
import java.util.List;

/**
 *
 * @author D.N.S.J
 */
public class OrdemServicoDAO extends DataAccessObject<OrdemServico> implements OrdemServicoRepo{

    public OrdemServicoDAO() {
        super(OrdemServico.class);

    }
    @Override
    public List<OrdemServico> Buscar(OrdemServico obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
