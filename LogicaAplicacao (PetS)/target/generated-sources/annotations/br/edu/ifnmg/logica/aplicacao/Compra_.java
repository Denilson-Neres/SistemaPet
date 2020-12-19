package br.edu.ifnmg.logica.aplicacao;

import br.edu.ifnmg.logica.aplicacao.Produto;
import br.edu.ifnmg.logica.aplicacao.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-17T21:54:43", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, BigDecimal> precoCompra;
    public static volatile SingularAttribute<Compra, Produto> produto;
    public static volatile SingularAttribute<Compra, Usuario> comprador;
    public static volatile SingularAttribute<Compra, Long> id;
    public static volatile SingularAttribute<Compra, Integer> quantidade;
    public static volatile SingularAttribute<Compra, Date> dataCompra;

}