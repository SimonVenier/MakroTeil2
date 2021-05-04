package at.itkollegimst.venier.pos1makro.test2.order.domain.buchP;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Buch {

    @Id
    @GeneratedValue
    private Long id;

    String name;
    String buchnummer;
    boolean buchdruck;
    double preis;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuchnummer() {
        return buchnummer;
    }

    public void setBuchnummer(String buchnummer) {
        this.buchnummer = buchnummer;
    }

    public boolean isBuchdruck() {
        return buchdruck;
    }

    public void setBuchdruck(boolean buchdruck) {
        this.buchdruck = buchdruck;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
