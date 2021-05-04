package at.itkollegimst.venier.pos1makro.test2.druckerei.shareddomain.models;

public class BestellungC {

    String bestellungsnummer;
    double bestellungpreis;
    boolean angenommen;

    public BestellungC(String bestellungsnummer, double bestellungpreis, boolean angenommen) {
        this.bestellungsnummer = bestellungsnummer;
        this.bestellungpreis = bestellungpreis;
        this.angenommen = angenommen;
    }

    public String getBestellungsnummer() {
        return bestellungsnummer;
    }

    public void setBestellungsnummer(String bestellungsnummer) {
        this.bestellungsnummer = bestellungsnummer;
    }

    public double getBestellungpreis() {
        return bestellungpreis;
    }

    public void setBestellungpreis(double bestellungpreis) {
        this.bestellungpreis = bestellungpreis;
    }

    public boolean isAngenommen() {
        return angenommen;
    }

    public void setAngenommen(boolean angenommen) {
        this.angenommen = angenommen;
    }
}
