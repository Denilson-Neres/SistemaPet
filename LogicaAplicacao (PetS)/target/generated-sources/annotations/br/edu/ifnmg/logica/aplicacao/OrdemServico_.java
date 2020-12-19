package br.edu.ifnmg.logica.aplicacao;

import br.edu.ifnmg.logica.aplicacao.Animal;
import br.edu.ifnmg.logica.aplicacao.Cliente;
import br.edu.ifnmg.logica.aplicacao.ItemOrdemServico;
import br.edu.ifnmg.logica.aplicacao.Servico;
import br.edu.ifnmg.logica.aplicacao.Tipo_OS;
import br.edu.ifnmg.logica.aplicacao.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-17T21:54:43", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(OrdemServico.class)
public class OrdemServico_ { 

    public static volatile SingularAttribute<OrdemServico, Cliente> cliente;
    public static volatile ListAttribute<OrdemServico, ItemOrdemServico> itens;
    public static volatile SingularAttribute<OrdemServico, Tipo_OS> tipo;
    public static volatile SingularAttribute<OrdemServico, String> Observacao;
    public static volatile SingularAttribute<OrdemServico, BigDecimal> valorTotal;
    public static volatile SingularAttribute<OrdemServico, Animal> animal;
    public static volatile SingularAttribute<OrdemServico, Usuario> usuario;
    public static volatile SingularAttribute<OrdemServico, Long> id;
    public static volatile SingularAttribute<OrdemServico, Servico> servico;
    public static volatile SingularAttribute<OrdemServico, Integer> version;
    public static volatile SingularAttribute<OrdemServico, Usuario> operador;
    public static volatile SingularAttribute<OrdemServico, Date> momento;

}