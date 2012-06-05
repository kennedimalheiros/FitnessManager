package br.com.FitnessManager.DomainModel;

import br.com.FitnessManager.DomainModel.Medida;
import java.sql.Time;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T19:05:05")
@StaticMetamodel(EsquemaExercicio.class)
public class EsquemaExercicio_ { 

    public static volatile SingularAttribute<EsquemaExercicio, Long> id;
    public static volatile SingularAttribute<EsquemaExercicio, Medida> medidaAtual;
    public static volatile SingularAttribute<EsquemaExercicio, Medida> medidaInicial;
    public static volatile SingularAttribute<EsquemaExercicio, Time> tempo;

}