package br.edu.ifnmg.logica.aplicacao;

import br.edu.ifnmg.logica.aplicacao.OrdemServico;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-17T21:54:43", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(RelatorioFinancas.class)
public class RelatorioFinancas_ { 

    public static volatile SingularAttribute<RelatorioFinancas, BigDecimal> compras;
    public static volatile SingularAttribute<RelatorioFinancas, OrdemServico> os;
    public static volatile SingularAttribute<RelatorioFinancas, Long> id;

}