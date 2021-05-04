package at.itkollegimst.venier.pos1makro.test2.druckerei.shareddomain.models;

public class BuchC {

    String name;
    String buchnummer;
    boolean buchdruck;
    double preis;

    public BuchC(String name, String buchnummer, boolean abgeholt, double preis) {
        this.name = name;
        this.buchnummer = buchnummer;
        this.buchdruck = abgeholt;
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
