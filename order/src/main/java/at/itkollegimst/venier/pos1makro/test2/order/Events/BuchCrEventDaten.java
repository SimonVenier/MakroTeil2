package at.itkollegimst.venier.pos1makro.test2.order.Events;

import lombok.Data;

@Data
public class BuchCrEventDaten {

    String name;
    String buchnummer;
    double preis;

    public BuchCrEventDaten(String name, String buchnummer, double preis) {
        this.name = name;
        this.buchnummer = buchnummer;
        this.preis = preis;
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
