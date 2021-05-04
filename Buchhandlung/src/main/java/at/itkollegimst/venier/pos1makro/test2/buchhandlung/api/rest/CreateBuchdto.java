package at.itkollegimst.venier.pos1makro.test2.buchhandlung.api.rest;

import lombok.Value;

@Value
public class CreateBuchdto {

    String name;
    String buchnummer;
    double preis;

    public CreateBuchdto(String name, String buchnummer, double preis) {
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
