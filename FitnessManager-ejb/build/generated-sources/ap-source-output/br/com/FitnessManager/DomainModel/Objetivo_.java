package br.com.FitnessManager.DomainModel;

import br.com.FitnessManager.DomainModel.EsquemaExercicio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T21:29:36")
@StaticMetamodel(Objetivo.class)
public class Objetivo_ { 

    public static volatile SingularAttribute<Objetivo, Long> id;
    public static volatile SingularAttribute<Objetivo, EsquemaExercicio> ee;
    public static volatile SingularAttribute<Objetivo, Integer> treinosSemanais;
    public static volatile SingularAttribute<Objetivo, String> descricao;
    public static volatile SingularAttribute<Objetivo, Date> descanco;

}