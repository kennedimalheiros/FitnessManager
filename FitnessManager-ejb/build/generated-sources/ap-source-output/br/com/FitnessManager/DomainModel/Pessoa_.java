package br.com.FitnessManager.DomainModel;

import br.com.FitnessManager.DomainModel.Medida;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T21:29:36")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile SingularAttribute<Pessoa, Boolean> status;
    public static volatile SingularAttribute<Pessoa, Medida> medida;
    public static volatile SingularAttribute<Pessoa, Date> dt_nascimento;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, String> cpf;
    public static volatile SingularAttribute<Pessoa, String> rg;

}