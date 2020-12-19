package br.edu.ifnmg.logica.aplicacao;

import br.edu.ifnmg.logica.aplicacao.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-17T21:54:43", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Animal.class)
public class Animal_ { 

    public static volatile SingularAttribute<Animal, String> especie;
    public static volatile SingularAttribute<Animal, Cliente> cliente;
    public static volatile SingularAttribute<Animal, String> observacao;
    public static volatile SingularAttribute<Animal, String> apelido;
    public static volatile SingularAttribute<Animal, String> raca;
    public static volatile SingularAttribute<Animal, String> nome;
    public static volatile SingularAttribute<Animal, Long> id;
    public static volatile SingularAttribute<Animal, String> sexo;

}