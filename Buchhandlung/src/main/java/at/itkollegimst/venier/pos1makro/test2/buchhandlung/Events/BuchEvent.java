package at.itkollegimst.venier.pos1makro.test2.buchhandlung.Events;

import lombok.Data;

@Data
public class BuchEvent {

    BuchEventDaten buchEventDaten;

    public BuchEvent(BuchEventDaten buchEventDaten) {
        this.buchEventDaten = buchEventDaten;
    }

    public BuchEvent() {
    }

    public BuchEventDaten getBuchEventDaten(){

        return buchEventDaten;

    }
}
