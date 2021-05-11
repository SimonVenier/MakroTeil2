package at.itkollegimst.venier.pos1makro.test2.order.Events;

public class BuchfuerBestellung {

    private BuchfuerBestellungDaten buchfuerBestellungDaten;

    public BuchfuerBestellung(BuchfuerBestellungDaten buchfuerBestellungDaten){

        this.buchfuerBestellungDaten = buchfuerBestellungDaten;

    }

    public BuchfuerBestellungDaten getBuchfuerBestellungDaten() {
        return buchfuerBestellungDaten;
    }

    public void setBuchfuerBestellungDaten(BuchfuerBestellungDaten buchfuerBestellungDaten) {
        this.buchfuerBestellungDaten = buchfuerBestellungDaten;
    }
}
