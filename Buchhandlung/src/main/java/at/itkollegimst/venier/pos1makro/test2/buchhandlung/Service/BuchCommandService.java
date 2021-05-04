package at.itkollegimst.venier.pos1makro.test2.buchhandlung.Service;

import at.itkollegimst.venier.pos1makro.test2.buchhandlung.domain.Buch;
import at.itkollegimst.venier.pos1makro.test2.buchhandlung.domain.CreateBuch;
import at.itkollegimst.venier.pos1makro.test2.buchhandlung.repo.RepoBuch;
import org.springframework.stereotype.Service;

@Service
public class BuchCommandService {

    private RepoBuch repoBuch;

    public BuchCommandService(RepoBuch repoBuch) {
        this.repoBuch = repoBuch;
    }

    public String buchErstellen(CreateBuch createBuch){

        Buch b1 = new Buch(createBuch);

        return b1.getBuchnummer();


    }

}
