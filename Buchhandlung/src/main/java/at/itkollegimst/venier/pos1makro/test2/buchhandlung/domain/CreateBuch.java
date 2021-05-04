package at.itkollegimst.venier.pos1makro.test2.buchhandlung.domain;

import lombok.Value;

@Value
public class CreateBuch {

    String name;
    String buchnummer;
    double preis;

    public CreateBuch(String name, String buchnummer, double preis) {
        this.name = name;
        this.buchnummer = buchnummer;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public String getBuchnummer() {
        return buchnummer;
    }

    public double getPreis() {
        return preis;
    }
}
