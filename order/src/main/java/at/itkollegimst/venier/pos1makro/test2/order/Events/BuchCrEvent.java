package at.itkollegimst.venier.pos1makro.test2.order.Events;

import lombok.Data;

@Data
public class BuchCrEvent {

    private BuchCrEventDaten buchCrEventDaten;

    public BuchCrEvent(BuchCrEventDaten buchCrEventDaten) {
        this.buchCrEventDaten = buchCrEventDaten;
    }

    public BuchCrEventDaten getBuchCrEventDaten() {
        return buchCrEventDaten;
    }

    public void setBuchCrEventDaten(BuchCrEventDaten buchCrEventDaten) {
        this.buchCrEventDaten = buchCrEventDaten;
    }
}
