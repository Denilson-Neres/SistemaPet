package br.edu.ifnmg.logica.aplicacao;

import br.edu.ifnmg.logica.aplicacao.Pessoa;
import br.edu.ifnmg.logica.aplicacao.TipoUsuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-17T21:54:43", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Date> momentoAcesso;
    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, TipoUsuario> tipo;
    public static volatile SingularAttribute<Usuario, Pessoa> pessoa;
    public static volatile SingularAttribute<Usuario, BigDecimal> salario;
    public static volatile SingularAttribute<Usuario, Long> id;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, String> cargo;

}