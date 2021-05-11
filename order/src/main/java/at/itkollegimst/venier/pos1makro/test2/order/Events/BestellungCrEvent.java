package at.itkollegimst.venier.pos1makro.test2.order.Events;

import lombok.Data;

@Data
public class BestellungCrEvent {

    BestellungCrEventDaten bestellungCrEventDaten;

    public BestellungCrEvent(BestellungCrEventDaten bestellungCrEventDaten){
        this.bestellungCrEventDaten = bestellungCrEventDaten;
    }

    public BestellungCrEventDaten getBestellungCrEventDaten() {
        return bestellungCrEventDaten;
    }

    public void setBestellungCrEventDaten(BestellungCrEventDaten bestellungCrEventDaten) {
        this.bestellungCrEventDaten = bestellungCrEventDaten;
    }
}
