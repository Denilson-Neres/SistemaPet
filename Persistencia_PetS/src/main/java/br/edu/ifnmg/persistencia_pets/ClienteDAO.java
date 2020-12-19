/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia_pets;

import br.edu.ifnmg.logica.aplicacao.Cliente;
import br.edu.ifnmg.logica.aplicacao.ClienteRepo;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author D.N.S.J
 */
public class ClienteDAO extends DataAccessObject<Cliente> implements ClienteRepo{

    public ClienteDAO() {
        super(Cliente.class);
    }
    
    //RETORNA UMA LISTA DE CLIENTES
    @Override
    public List<Cliente> Buscar(Cliente obj) {
        Query consulta = this.manager.createQuery("Select c from Cliente");
        return consulta.getResultList();
    }
    
    //RETORNA UM UNICO RESULTADO(CLIENTE)
    @Override
    public Cliente AbrirCpf(String cpf) {
        Query consulta = this.manager.createQuery("select c from Cliente c where c.cpf := parametro");
        consulta.setParameter("parametro", cpf);
        return (Cliente) consulta.getSingleResult();
    }
    
}
