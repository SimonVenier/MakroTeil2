package at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung;

import at.itkollegimst.venier.pos1makro.test2.order.Repos.RepoBuch;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung.Bestellung;
import org.springframework.stereotype.Service;

import javax.persistence.SecondaryTable;

@Service
public class BuchQueryService {

    private final RepoBuch repoBuch;

    public BuchQueryService(RepoBuch repoBuch) {
        this.repoBuch = repoBuch;
    }

    public Buch getBuchByBuchnummer(String buchnummer){
        return repoBuch.findBuchByBuchnummer(buchnummer)
                .orElseThrow();
    }

    public boolean buchnummerVorhander(String buchnummer){
        return repoBuch.findBuchByBuchnummer(buchnummer).isPresent();

    }

}
