package at.itkollegimst.venier.pos1makro.test2.buchhandlung.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Buch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    String name;
    String buchnummer;
    double preis;

    public Buch(CreateBuch createBuch) {

        this.name = name;
        this.buchnummer = buchnummer;
        this.preis = preis;
    }

    public Buch() {

    }


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

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
