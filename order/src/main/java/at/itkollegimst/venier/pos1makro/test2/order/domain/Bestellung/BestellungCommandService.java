package at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung;

import at.itkollegimst.venier.pos1makro.test2.order.Repos.RepoBestellung;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung.BuchCommandService;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung.BuchQueryService;

public class BestellungCommandService {

    private RepoBestellung repoBestellung;
    private BestellungQueryService bestellungQueryService;
    private BuchCommandService buchCommandService;
    private BuchQueryService buchQueryService;

    public BestellungCommandService(RepoBestellung repoBestellung, BestellungQueryService bestellungQueryService,
                                    BuchCommandService buchCommandService, BuchQueryService buchQueryService) {
        this.repoBestellung = repoBestellung;
        this.bestellungQueryService = bestellungQueryService;
        this.buchCommandService = buchCommandService;
        this.buchQueryService = buchQueryService;
    }

    public void createBestellung(CreateBestellung createBestellung){
        Bestellung b1 = new Bestellung(createBestellung);
        repoBestellung.save(b1);
    }

}
