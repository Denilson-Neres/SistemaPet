/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia_pets;

import br.edu.ifnmg.logica.aplicacao.Animal;
import br.edu.ifnmg.logica.aplicacao.AnimalRepo;
import java.util.List;

/**
 *
 * @author D.N.S.J
 */
public class AnimalDAO extends DataAccessObject<Animal> implements AnimalRepo{

    public AnimalDAO() {
        super(Animal.class);
    }

    @Override
    public List<Animal> Buscar(Animal obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
