package at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung;

import at.itkollegimst.venier.pos1makro.test2.order.Repos.RepoBuch;

public class BuchCommandService {

    private RepoBuch repoBuch;

    public BuchCommandService(RepoBuch repoBuch) {
        this.repoBuch = repoBuch;
    }

    public String createBuch1(CreateBuch createBuch){

        Buch b1 = new Buch(createBuch);
        repoBuch.save(b1);
        return b1.getBuchnummer();


    }

    public RepoBuch getRepoBuch() {
        return repoBuch;
    }

    public void setRepoBuch(RepoBuch repoBuch) {
        this.repoBuch = repoBuch;
    }
}
