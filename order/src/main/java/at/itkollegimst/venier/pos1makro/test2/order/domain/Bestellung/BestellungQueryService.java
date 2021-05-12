package at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung;

import at.itkollegimst.venier.pos1makro.test2.order.Repos.RepoBestellung;
import org.springframework.stereotype.Service;

@Service
public class BestellungQueryService {

    private final RepoBestellung repoBestellung;

    public BestellungQueryService(RepoBestellung repoBestellung) {
        this.repoBestellung = repoBestellung;
    }

    public Bestellung getBestellungByBestellnummer(String bestellnummer){
        return repoBestellung.getBestellungByBestellnummer(bestellnummer)
                .orElseThrow();
    }

    public boolean bestellnummerVorhanden(String bestellnummer){
        return repoBestellung.getBestellungByBestellnummer(bestellnummer).isPresent();

    }

    public Long getNummerOfBestellungFuerBuch(String bestellnummer){
        return repoBestellung.countBestellungByBestellnummer(bestellnummer);
    }

}
