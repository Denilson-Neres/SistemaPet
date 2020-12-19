package br.edu.ifnmg.logica.aplicacao;

import br.edu.ifnmg.logica.aplicacao.Pessoa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-17T21:54:43", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ extends Pessoa_ {

    public static volatile SingularAttribute<Fornecedor, Pessoa> pessoa;
    public static volatile SingularAttribute<Fornecedor, String> endereco;
    public static volatile SingularAttribute<Fornecedor, String> representante;
    public static volatile SingularAttribute<Fornecedor, String> inscricaoEstadual;
    public static volatile SingularAttribute<Fornecedor, String> cnpj;

}