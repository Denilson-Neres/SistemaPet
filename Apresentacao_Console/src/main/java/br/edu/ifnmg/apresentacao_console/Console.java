/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao_console;

import br.edu.ifnmg.logica.aplicacao.Cliente;
import br.edu.ifnmg.logica.aplicacao.ClienteRepo;
import br.edu.ifnmg.logica.aplicacao.RepositorioFactory;
import br.edu.ifnmg.logica.aplicacao.Usuario;
import br.edu.ifnmg.logica.aplicacao.UsuarioRepo;
import br.edu.ifnmg.persistencia_pets.ClienteDAO;
import br.edu.ifnmg.persistencia_pets.UsuarioDAO;

/**
 *
 * @author D.N.S.J
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void criarBase(){
        
        //UsuarioRepo repou = new UsuarioDAO();
        //repou.Salvar(new Usuario("caixa", "123"));
        //repou.Salvar(new Usuario("gerente", "123"));
        
        /*
        ClienteRepo repof = new ClienteDAO();
        repof.Salvar(new Cliente("João","11111111111", "10123456"));
        repof.Salvar(new Cliente("Maria","11111111112", "10123457"));
        repof.Salvar(new Cliente("José","11111111113", "10123458"));
        repof.Salvar(new Cliente("Ana","11111111114", "10123459"));
        
        FornecedorRepo repoj = new FornecedorDAO();
        repoj.Salvar(new Fornecedor("Padaria", "111111111", "00001111000"));
        repoj.Salvar(new Fornecedor("Confeitaria", "111111112", "00001111001"));
        repoj.Salvar(new Fornecedor("Mercearia", "111111113", "00001111002"));
        
        ProdutoRepo repop = new ProdutoDAO();
        repop.Salvar(new Produto("Farinha de Trigo", "5.00", 10));
        repop.Salvar(new Produto("Açúcar", "3.50", 10));
        repop.Salvar(new Produto("Sal", "1.50", 10));
        repop.Salvar(new Produto("Leite", "3.50", 10));
        */
        
      //  var user1 = repou.Abrir(1L);
       // var user2 = repou.Abrir(2L);
        /*
        var pf1 = repof.Abrir(1L);
        var pf2 = repof.Abrir(2L);
        
        var pj1 = repoj.Abrir(5L);
        var pj2 = repoj.Abrir(6L);
        
        var prod1 = repop.Abrir(1L);
        var prod2 = repop.Abrir(2L);
        var prod3 = repop.Abrir(3L);
        var prod4 = repop.Abrir(4L);
        
        OrdemServicoRepo repot = new OrdemServicoDAO();
        
        OrdemServico t1 = new OrdemServico(pf1, Tipo_OS.Venda, user1);
        t1.add(new ItemOrdemServico(prod1, 1));
        t1.add(new ItemOrdemServico(prod3, 1));
        
        repot.Salvar(t1);
        
        OrdemServico t2 = new OrdemServico(pf2, Tipo_OS.Venda, user2);
        t2.add(new ItemOrdemServico(prod2, 1));
        t2.add(new ItemOrdemServico(prod4, 1));
        
        repot.Salvar(t2);
        
        OrdemServico t3 = new OrdemServico(pj1, Tipo_OS.Compra, user1);
        t3.add(new ItemOrdemServico (prod1, 4));
        t3.add(new ItemOrdemServico(prod3, 5));
        
        repot.Salvar(t3);
        
        OrdemServico t4 = new OrdemServico(pj2, Tipo_OS.Compra, user2);
        t4.add(new ItemOrdemServico(prod2, 10));
        t4.add(new ItemOrdemServico(prod4, 10));
        
        repot.Salvar(t4);]
 */
    }
   
    public static void main(String[] args) {
        
       // UsuarioRepo repo = RepositorioFactory.getUsuarioRepo();
        
        ClienteRepo repoc = new ClienteDAO();
        
        Cliente c = repoc.AbrirCpf("1233333");
        System.out.println(c.getNome());
        
        
        //criarBase();
        
        //Usuario u = repo.Abrir(1L);
        
       // System.out.println(repo.autenticar("caixa", "1234"));
    
    }
    
}
