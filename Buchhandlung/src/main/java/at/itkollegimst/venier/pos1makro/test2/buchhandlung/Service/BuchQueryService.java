package at.itkollegimst.venier.pos1makro.test2.buchhandlung.Service;

import at.itkollegimst.venier.pos1makro.test2.buchhandlung.Exception.KeinBuchVorhandenExcep;
import at.itkollegimst.venier.pos1makro.test2.buchhandlung.domain.Buch;
import at.itkollegimst.venier.pos1makro.test2.buchhandlung.repo.RepoBuch;
import org.springframework.stereotype.Service;

@Service
public class BuchQueryService {

    private final RepoBuch repoBuch;

    public BuchQueryService(RepoBuch repoBuch) {
        this.repoBuch = repoBuch;
    }

    public Buch getBuchByBuchnummer(String buchnummer) throws KeinBuchVorhandenExcep {

        return repoBuch.getBuchByBuchnummer(buchnummer).orElseThrow(KeinBuchVorhandenExcep::new);

    }
}
