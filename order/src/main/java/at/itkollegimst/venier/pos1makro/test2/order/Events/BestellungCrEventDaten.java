package at.itkollegimst.venier.pos1makro.test2.order.Events;


import lombok.Value;

@Value
public class BestellungCrEventDaten {

    String bestellnummer;
    String buchnummer;
    double preis;
    boolean gedruckt;

    public BestellungCrEventDaten(String bestellnummer, String buchnummer, double preis, boolean gedruckt) {
        this.bestellnummer = bestellnummer;
        this.buchnummer = buchnummer;
        this.preis = preis;
        this.gedruckt = gedruckt;
    }

    public String getBestellnummer() {
        return bestellnummer;
    }

    public String getBuchnummer() {
        return buchnummer;
    }

    public double getPreis() {
        return preis;
    }

    public boolean isGedruckt() {
        return gedruckt;
    }
}
