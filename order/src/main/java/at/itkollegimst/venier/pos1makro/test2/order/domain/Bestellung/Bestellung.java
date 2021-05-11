package at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung;


import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
@Data
public class Bestellung extends AbstractAggregateRoot<Bestellung> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String bestellnummer;
    private String buchnummer;
    private double preis;
    private boolean gedruckt;

    public Bestellung(CreateBestellung createBestellung) {
        this.bestellnummer = createBestellung.getBestellnummer();
        this.buchnummer = createBestellung.getBuchnummer();
        this.preis = createBestellung.getPreis();
        this.gedruckt = createBestellung.isGedruckt();


    }

    public Bestellung() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBestellnummer() {
        return bestellnummer;
    }

    public void setBestellnummer(String bestellnummer) {
        this.bestellnummer = bestellnummer;
    }

    public String getBuchnummer() {
        return buchnummer;
    }

    public void setBuchnummer(String buchnummer) {
        this.buchnummer = buchnummer;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public boolean isGedruckt() {
        return gedruckt;
    }

    public void setGedruckt(boolean gedruckt) {
        this.gedruckt = gedruckt;
    }
}
