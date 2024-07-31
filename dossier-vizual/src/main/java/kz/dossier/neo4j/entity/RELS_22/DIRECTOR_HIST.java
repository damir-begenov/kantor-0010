package kz.dossier.neo4j.entity.RELS_22;

import kz.dossier.neo4j.entity.Persons;
import org.springframework.data.neo4j.core.schema.*;

@RelationshipProperties
@Node
public class DIRECTOR_HIST {
    @Id
    @GeneratedValue
    public Long id;
    @Property("Вид связи")
    public String Vid_svyaziey;
    @Property("Дата начало работы")
    public String data_nachalo;
    @Property("Дата окончания работы")
    public String data_okonchaniya;

    public String getVid_svyaziey() {
        return Vid_svyaziey;
    }

    public void setVid_svyaziey(String vid_svyaziey) {
        Vid_svyaziey = vid_svyaziey;
    }

    public String getData_nachalo() {
        return data_nachalo;
    }

    public void setData_nachalo(String data_nachalo) {
        this.data_nachalo = data_nachalo;
    }

    public String getData_okonchaniya() {
        return data_okonchaniya;
    }

    public void setData_okonchaniya(String data_okonchaniya) {
        this.data_okonchaniya = data_okonchaniya;
    }

    @TargetNode
    private Persons person;

    public Persons getPerson() {
        return person;
    }

    public void setPerson(Persons person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
