package at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung;

import at.itkollegimst.venier.pos1makro.test2.order.Repos.RepoBestellung;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung.BuchCommandService;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung.BuchQueryService;
import org.springframework.stereotype.Service;

@Service
public class BestellungCommandService {

    RepoBestellung repoBestellung;
    BestellungQueryService bestellungQueryService;

    public BestellungCommandService(RepoBestellung repoBestellung, BestellungQueryService bestellungQueryService) {
        this.repoBestellung = repoBestellung;
        this.bestellungQueryService = bestellungQueryService;
    }

    public void createBestellung(CreateBestellung createBestellung){
        Bestellung b1 = new Bestellung(createBestellung);
        repoBestellung.save(b1);
    }

}
