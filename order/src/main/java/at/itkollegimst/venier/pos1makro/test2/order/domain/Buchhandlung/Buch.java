package at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung;


import at.itkollegimst.venier.pos1makro.test2.order.Events.BuchfuerBestellung;
import at.itkollegimst.venier.pos1makro.test2.order.Events.BuchfuerBestellungDaten;
import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Buch extends AbstractAggregateRoot<Buch> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String buchnummer;

    public Buch(CreateBuch createBuch) {

        this.buchnummer = createBuch.getBuchnummer();

        addDomainEvent(new BuchfuerBestellung(new BuchfuerBestellungDaten(
                this.buchnummer
        )));
    }

    public Buch() {

    }

    public void addDomainEvent(Object event){
        registerEvent(event);
    }

    public String getBuchnummer() {
        return buchnummer;
    }

    public void setBuchnummer(String buchnummer) {
        this.buchnummer = buchnummer;
    }
}
